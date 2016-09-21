package au.com.btes.services;

import au.com.btes.models.CampaignServiceUrl;
import au.com.btes.models.profile.Profile;
import au.com.btes.models.services.Service;
import au.com.btes.models.services.ServicesResponse;
import au.com.btes.models.subscriptions.SubscribeRequest;
import au.com.btes.models.subscriptions.SubscribeResponse;
import au.com.btes.models.subscriptions.Subscriber;
import au.com.btes.models.subscriptions.SubscriptionsResponse;
	
public interface ICampaignClient {
	
	/**
	 * Sets the tenant of the Adobe Campaign instance.
	 * @param tenant a string that identifies the instance of Adobe Campaign
	 */
	public void setTenant(String tenant);
	
	/**
	 * Sets the API key necessary to make calls to the REST API.
	 * @param apiKey the API key
	 */
	public void setApiKey(String apiKey);
	
	/**
	 * Sets the access token necessary to authenticate the API call. This token has a validity of one day and can be obtained through the {@link ExchangeClient} class.
	 * @param accessToken the access token
	 */
	public void setAccessToken(String accessToken);

	/**
	 * This method gets all the services (or news categories) available in Campaign for subscription or unsubscription.
	 * @return the list of services available
	 * @throws CampaignCallException
	 */
	ServicesResponse getServices() throws CampaignCallException;
	
	/**
	 * This method gets the Adobe Campaign profile associated to a given primary key.
	 * @param primaryKey the profile's primary key
	 * @return the Adobe Campaign profile
	 * @throws CampaignCallException
	 */
	Profile getProfile(String primaryKey) throws CampaignCallException;
	
	/**
	 * This method returns the subscriptions (profile/service pairs) held by a given URL. This URL is typically obtained by querying a profile first.
	 * @param subscriptionsUrl the URL holding the subscriptions
	 * @return a list of the subscriptions for a given profile
	 * @throws CampaignCallException
	 */
	SubscriptionsResponse getSubscriptions(CampaignServiceUrl subscriptionsUrl) throws CampaignCallException;
	
	/**
	 * This method is used to perform a subscription of a profile to a service. The {@link SubscribeRequest} is built from a {@link Subscriber}, which is built from a profile's primary key.
	 * @param subscribeRequest the request object containing the subscriber
	 * @param subscriptionsUrl the URL to the subscription, obtained from a {@link Service}
	 * @return an object confirming the subscription
	 * @throws CampaignCallException
	 */
	SubscribeResponse subscribe(SubscribeRequest subscribeRequest, CampaignServiceUrl subscriptionsUrl) throws CampaignCallException;
	
	/**
	 * This method unsubscribes a profile from a service.
	 * @param subscriptionUrl the URL obtained when listing a profile's subscriptions
	 * @throws CampaignCallException
	 */
	void unsubscribe(CampaignServiceUrl subscriptionUrl) throws CampaignCallException;
	
	/**
	 * This method is used to update Campaign fields of a profile. Only the fields that are set on the {@link Profile} object will be updated.
	 * @param profile the profile that will be updated, built from a primary key
	 * @throws CampaignCallException
	 */
	void updateProfile(Profile profile) throws CampaignCallException;
	
	/**
	 * This method creates a new profile in Campaign. Only the fields that are set on the {@link Profile} will be set in Campaign.
	 * @param profile the profile to be created
	 * @return the profile as created by Campaign
	 * @throws CampaignCallException
	 */
	Profile createProfile(Profile profile) throws CampaignCallException;
	
}
