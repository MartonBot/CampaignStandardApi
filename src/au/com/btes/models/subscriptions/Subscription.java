package au.com.btes.models.subscriptions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subscription {

	@SerializedName("PKey")
	@Expose
	private String pKey;
	@SerializedName("created")
	@Expose
	private String created;
	@SerializedName("email")
	@Expose
	private String email;
	@SerializedName("expirationDate")
	@Expose
	private String expirationDate;
	@SerializedName("href")
	@Expose
	private String href;
	@SerializedName("metadata")
	@Expose
	private String metadata;
	@SerializedName("mobilePhone")
	@Expose
	private String mobilePhone;
	@SerializedName("serviceName")
	@Expose
	private String serviceName;
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
	 * The created
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * 
	 * @param created
	 * The created
	 */
	public void setCreated(String created) {
		this.created = created;
	}

	/**
	 * 
	 * @return
	 * The email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email
	 * The email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return
	 * The expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}

	/**
	 * 
	 * @param expirationDate
	 * The expirationDate
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

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
	 * The metadata
	 */
	public String getMetadata() {
		return metadata;
	}

	/**
	 * 
	 * @param metadata
	 * The metadata
	 */
	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	/**
	 * 
	 * @return
	 * The mobilePhone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}

	/**
	 * 
	 * @param mobilePhone
	 * The mobilePhone
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	/**
	 * 
	 * @return
	 * The serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * 
	 * @param serviceName
	 * The serviceName
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
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