package au.com.btes.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Count {

	@SerializedName("href")
	@Expose
	private String href;
	@SerializedName("value")
	@Expose
	private Integer value;

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

	/**
	 * 
	 * @return
	 * The value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * 
	 * @param value
	 * The value
	 */
	public void setValue(Integer value) {
		this.value = value;
	}

}