package au.com.btes.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents the URL of an Adobe Campaign service.
 * It can be used to subscribe to a service, or to unsubscribe from a service. It can also be used to view the subscriptions for a given profile.
 * @author mgrihangne
 *
 */
public class CampaignServiceUrl {

	@SerializedName("href")
	@Expose
	private String href;

	/**
	 * 
	 * @return
	 * The href
	 */
	public String getHref() {
		return href;
	}

	/**
	 * 
	 * @param href
	 * The href
	 */
	public void setHref(String href) {
		this.href = href;
	}

	public CampaignServiceUrl(String href) {
		this.href = href;
	}
	
	

}