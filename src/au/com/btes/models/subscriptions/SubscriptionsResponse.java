package au.com.btes.models.subscriptions;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import au.com.btes.models.Count;

public class SubscriptionsResponse {

	@SerializedName("content")
	@Expose
	private List<Subscription> subscriptions = new ArrayList<Subscription>();
	@SerializedName("count")
	@Expose
	private Count count;
	@SerializedName("serverSidePagination")
	@Expose
	private Boolean serverSidePagination;

	/**
	 * 
	 * @return
	 * The subscriptions
	 */
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}

	/**
	 * 
	 * @param subscriptions
	 * The subscriptions
	 */
	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}

	/**
	 * 
	 * @return
	 * The count
	 */
	public Count getCount() {
		return count;
	}

	/**
	 * 
	 * @param count
	 * The count
	 */
	public void setCount(Count count) {
		this.count = count;
	}

	/**
	 * 
	 * @return
	 * The serverSidePagination
	 */
	public Boolean getServerSidePagination() {
		return serverSidePagination;
	}

	/**
	 * 
	 * @param serverSidePagination
	 * The serverSidePagination
	 */
	public void setServerSidePagination(Boolean serverSidePagination) {
		this.serverSidePagination = serverSidePagination;
	}

}