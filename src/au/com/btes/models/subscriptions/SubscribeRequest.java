package au.com.btes.models.subscriptions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubscribeRequest {

	@SerializedName("subscriber")
	@Expose
	private Subscriber subscriber;

	/**
	 * 
	 * @return
	 * The subscriber
	 */
	public Subscriber getSubscriber() {
		return subscriber;
	}

	/**
	 * 
	 * @param subscriber
	 * The subscriber
	 */
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public SubscribeRequest(Subscriber subscriber) {
		this.subscriber = subscriber;
	}
	
	

}