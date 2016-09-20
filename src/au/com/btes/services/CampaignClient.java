package au.com.btes.services;

import java.io.IOException;

import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;

import au.com.btes.models.CampaignServiceUrl;
import au.com.btes.models.profile.Profile;
import au.com.btes.models.services.ServicesResponse;
import au.com.btes.models.subscriptions.SubscribeRequest;
import au.com.btes.models.subscriptions.SubscribeResponse;
import au.com.btes.models.subscriptions.SubscriptionsResponse;
import au.com.btes.util.Util;

public class CampaignClient implements ICampaignClient {

	private static final String ADOBE_IO_BASE_URL = "https://mc.adobe.io/%s/campaign";

	private HttpClient httpClient;

	private String tenant;

	private String apiKey;

	private String accessToken;

	@Override
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	@Override
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	@Override
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@Override
	public ServicesResponse getServices() throws CampaignCallException {
		ServicesResponse services = null;

		try {
			HttpClient client = getHttpClient();
			HttpGet httpGet = new HttpGet(getServicesEndpoint());
			setAuthorizationHeaders(httpGet);
			HttpResponse response = client.execute(httpGet);

			Util.checkForStatus(response, HttpStatus.SC_OK);

			String json = Util.getTextContent(response);
			Gson gson = new Gson();
			services = gson.fromJson(json, ServicesResponse.class);
		} catch (IOException e) {
			throw new CampaignCallException(e);
		}

		return services;
	}

	@Override
	public Profile getProfile(String primaryKey) throws CampaignCallException {
		Profile profile = null;

		try {
			HttpClient client = getHttpClient();
			HttpGet httpGet = new HttpGet(getProfileEndpoint(primaryKey));
			setAuthorizationHeaders(httpGet);
			HttpResponse response = client.execute(httpGet);

			Util.checkForStatus(response, HttpStatus.SC_OK);

			String json = Util.getTextContent(response);
			Gson gson = new Gson();
			profile = gson.fromJson(json, Profile.class);
		} catch (IOException e) {
			throw new CampaignCallException(e);
		}

		return profile;
	}

	@Override
	public SubscriptionsResponse getSubscriptions(CampaignServiceUrl subscriptionsUrl) throws CampaignCallException {
		SubscriptionsResponse subscriptions = null;

		try {
			HttpClient client = getHttpClient();
			HttpGet httpGet = new HttpGet(subscriptionsUrl.getHref());
			setAuthorizationHeaders(httpGet);
			HttpResponse response = client.execute(httpGet);

			Util.checkForStatus(response, HttpStatus.SC_OK);

			String json;
			json = Util.getTextContent(response);
			Gson gson = new Gson();
			subscriptions = gson.fromJson(json, SubscriptionsResponse.class);
		} catch (IOException e) {
			throw new CampaignCallException(e);
		}

		return subscriptions;
	}

	@Override
	public SubscribeResponse subscribe(SubscribeRequest subscribeRequest, CampaignServiceUrl subscriptionUrl) throws CampaignCallException {
		SubscribeResponse subscribeResponse = null;

		try {
			HttpClient client = getHttpClient();
			HttpPost postRequest = new HttpPost(subscriptionUrl.getHref());
			setAuthorizationHeaders(postRequest);
			postRequest.setHeader("Content-Type", "application/json");

			Gson gson = new Gson();
			String postBodyJson = gson.toJson(subscribeRequest);
			postRequest.setEntity(new StringEntity(postBodyJson));
			HttpResponse response = client.execute(postRequest);

			Util.checkForStatus(response, HttpStatus.SC_CREATED);

			String json = Util.getTextContent(response);

			subscribeResponse = gson.fromJson(json, SubscribeResponse.class);
		} catch (IOException e) {
			throw new CampaignCallException(e);
		}

		return subscribeResponse;
	}

	@Override
	public void unsubscribe(CampaignServiceUrl subscriptionUrl) throws CampaignCallException {
		try {
			HttpClient client = getHttpClient();
			HttpDelete deleteRequest = new HttpDelete(subscriptionUrl.getHref());
			setAuthorizationHeaders(deleteRequest);

			HttpResponse response = client.execute(deleteRequest);

			Util.checkForStatus(response, HttpStatus.SC_NO_CONTENT);
		} catch (IOException e) {
			throw new CampaignCallException(e);
		}
	}
	
	public void updateProfile(Profile profile) throws CampaignCallException {
		try {
			HttpClient client = getHttpClient();
			HttpPatch patchRequest = new HttpPatch(getProfileEndpoint(profile.getPKey()));
			setAuthorizationHeaders(patchRequest);
			patchRequest.setHeader("Content-Type", "application/json");

			Gson gson = new Gson();
			String postBodyJson = gson.toJson(profile);
			patchRequest.setEntity(new StringEntity(postBodyJson));

			HttpResponse response = client.execute(patchRequest);

			Util.checkForStatus(response, HttpStatus.SC_OK);
		} catch (IOException e) {
			throw new CampaignCallException(e);
		}
	}

	private HttpClient getHttpClient() {
		if (httpClient == null) {
			httpClient = HttpClientBuilder.create().build();
		}
		return httpClient;
	}

	private String getBaseUrl() {
		return String.format(ADOBE_IO_BASE_URL, tenant);
	}

	private String getServicesEndpoint() {
		return getBaseUrl() + "/profileAndServices/service";
	}

	private String getProfileEndpoint(String primaryKey) {
		return getBaseUrl() + "/profileAndServices/profile/" + primaryKey;
	}

	private void setAuthorizationHeaders(HttpMessage request) {
		request.setHeader("Authorization", "Bearer " + accessToken);
		request.setHeader("X-Api-Key", apiKey);
	}

}
