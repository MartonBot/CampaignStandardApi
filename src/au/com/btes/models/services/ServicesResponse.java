package au.com.btes.models.services;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import au.com.btes.models.Count;


public class ServicesResponse {

	@SerializedName("content")
	@Expose
	private List<Service> services = new ArrayList<Service>();
	@SerializedName("count")
	@Expose
	private Count count;
	@SerializedName("serverSidePagination")
	@Expose
	private Boolean serverSidePagination;

	/**
	 * 
	 * @return
	 * The services
	 */
	public List<Service> getServices() {
		return services;
	}

	/**
	 * 
	 * @param services
	 * The services
	 */
	public void setServices(List<Service> services) {
		this.services = services;
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