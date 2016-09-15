package au.com.btes.models.services;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Template {

	@SerializedName("PKey")
	@Expose
	private String pKey;
	@SerializedName("title")
	@Expose
	private String title;

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

	/**
	 * 
	 * @return
	 * The title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 * The title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}