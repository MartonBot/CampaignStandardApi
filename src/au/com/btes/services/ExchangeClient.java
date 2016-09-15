package au.com.btes.services;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

import com.google.gson.Gson;

import au.com.btes.models.exchange.ExchangeResponse;
import au.com.btes.util.Util;

public class ExchangeClient {

	private String endpoint;

	private String accessToken;

	private String apiKey;
	private String clientSecret;
	private String jwtToken;

	private final String apiKeyParamName = "client_id";
	private final String clientSecretParamName = "client_secret";
	private final String jwtTokenParamName = "jwt_token";

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public void retrieveAccessToken() throws CampaignCallException  {
		try {
			HttpClient httpClient = HttpClientBuilder.create().build();
			HttpPost httpPost = new HttpPost(endpoint);

			ArrayList<NameValuePair> postParameters;

			postParameters = new ArrayList<NameValuePair>();
			postParameters.add(new BasicNameValuePair(apiKeyParamName, apiKey));
			postParameters.add(new BasicNameValuePair(clientSecretParamName, clientSecret));
			postParameters.add(new BasicNameValuePair(jwtTokenParamName, jwtToken));
			httpPost.setEntity(new UrlEncodedFormEntity(postParameters));

			HttpResponse response = httpClient.execute(httpPost);

			Util.checkForStatus(response, HttpStatus.SC_OK);

			String json = Util.getTextContent(response);
			Gson gson = new Gson();
			ExchangeResponse exchangeResponse = gson.fromJson(json, ExchangeResponse.class);

			accessToken = exchangeResponse.getAccessToken();
		}
		catch (IOException e) {
			throw new CampaignCallException(e);
		}
	}

	public String getAccessToken() {
		return accessToken;
	}


}
