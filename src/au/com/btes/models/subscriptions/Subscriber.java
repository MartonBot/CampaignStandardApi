package au.com.btes.models.subscriptions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subscriber {

	@SerializedName("PKey")
	@Expose
	private String pKey;

	/**
	* 
	* @return
	* The pKey
	*/
	public String getPKey() {
	return pKey;
	}

	/**
	* 
	* @param pKey
	* The PKey
	*/
	public void setPKey(String pKey) {
	this.pKey = pKey;
	}

	public Subscriber(String pKey) {
		this.pKey = pKey;
	}
	
	
	
}
