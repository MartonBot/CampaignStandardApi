package au.com.btes.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;

import au.com.btes.services.CampaignCallException;

public class Util {

	public static String getTextContent(HttpResponse response) throws UnsupportedOperationException, IOException {
		String json = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		try {
			StringBuilder sb = new StringBuilder();
			String line;
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			json = sb.toString();
		}
		finally {
			br.close();
		}
		return json;
	}

	public static void checkForStatus(HttpResponse response, int normalStatus) throws CampaignCallException {
		try {
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode != normalStatus) {
				String message = String.format("The response status is %d instead of %d. ", statusCode, normalStatus);
				message += getTextContent(response);
				throw new CampaignCallException(message);
			}
		} catch (IOException e) {
			throw new CampaignCallException(e);
		}
	}

}
