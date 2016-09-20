package au.com.btes.models.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import au.com.btes.models.CampaignServiceUrl;

public class Profile {

	@SerializedName("PKey")
	@Expose
	private String pKey;
	@SerializedName("age")
	@Expose
	private Integer age;
	@SerializedName("birthDate")
	@Expose
	private String birthDate;
	@SerializedName("blackList")
	@Expose
	private Boolean blackList;
	@SerializedName("blackListEmail")
	@Expose
	private Boolean blackListEmail;
	@SerializedName("blackListFax")
	@Expose
	private Boolean blackListFax;
	@SerializedName("blackListMobile")
	@Expose
	private Boolean blackListMobile;
	@SerializedName("blackListPhone")
	@Expose
	private Boolean blackListPhone;
	@SerializedName("blackListPostalMail")
	@Expose
	private Boolean blackListPostalMail;
	@SerializedName("created")
	@Expose
	private String created;
	@SerializedName("cryptedId")
	@Expose
	private String cryptedId;
	@SerializedName("domain")
	@Expose
	private String domain;
	@SerializedName("email")
	@Expose
	private String email;
	@SerializedName("emailFormat")
	@Expose
	private String emailFormat;
	@SerializedName("fax")
	@Expose
	private String fax;
	@SerializedName("firstName")
	@Expose
	private String firstName;
	@SerializedName("gender")
	@Expose
	private String gender;
	@SerializedName("lastModified")
	@Expose
	private String lastModified;
	@SerializedName("lastName")
	@Expose
	private String lastName;
	@SerializedName("location")
	@Expose
	private Location location;
	@SerializedName("middleName")
	@Expose
	private String middleName;
	@SerializedName("mobilePhone")
	@Expose
	private String mobilePhone;
	@SerializedName("phone")
	@Expose
	private String phone;
	@SerializedName("postalAddress")
	@Expose
	private PostalAddress postalAddress;
	@SerializedName("salutation")
	@Expose
	private String salutation;
	@SerializedName("subscriptions")
	@Expose
	private CampaignServiceUrl urlToSubscriptions;
	@SerializedName("thumbnail")
	@Expose
	private String thumbnail;
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
	 * The age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * 
	 * @param age
	 * The age
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * 
	 * @return
	 * The birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * 
	 * @param birthDate
	 * The birthDate
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * 
	 * @return
	 * The blackList
	 */
	public Boolean getBlackList() {
		return blackList;
	}

	/**
	 * 
	 * @param blackList
	 * The blackList
	 */
	public void setBlackList(Boolean blackList) {
		this.blackList = blackList;
	}

	/**
	 * 
	 * @return
	 * The blackListEmail
	 */
	public Boolean getBlackListEmail() {
		return blackListEmail;
	}

	/**
	 * 
	 * @param blackListEmail
	 * The blackListEmail
	 */
	public void setBlackListEmail(Boolean blackListEmail) {
		this.blackListEmail = blackListEmail;
	}

	/**
	 * 
	 * @return
	 * The blackListFax
	 */
	public Boolean getBlackListFax() {
		return blackListFax;
	}

	/**
	 * 
	 * @param blackListFax
	 * The blackListFax
	 */
	public void setBlackListFax(Boolean blackListFax) {
		this.blackListFax = blackListFax;
	}

	/**
	 * 
	 * @return
	 * The blackListMobile
	 */
	public Boolean getBlackListMobile() {
		return blackListMobile;
	}

	/**
	 * 
	 * @param blackListMobile
	 * The blackListMobile
	 */
	public void setBlackListMobile(Boolean blackListMobile) {
		this.blackListMobile = blackListMobile;
	}

	/**
	 * 
	 * @return
	 * The blackListPhone
	 */
	public Boolean getBlackListPhone() {
		return blackListPhone;
	}

	/**
	 * 
	 * @param blackListPhone
	 * The blackListPhone
	 */
	public void setBlackListPhone(Boolean blackListPhone) {
		this.blackListPhone = blackListPhone;
	}

	/**
	 * 
	 * @return
	 * The blackListPostalMail
	 */
	public Boolean getBlackListPostalMail() {
		return blackListPostalMail;
	}

	/**
	 * 
	 * @param blackListPostalMail
	 * The blackListPostalMail
	 */
	public void setBlackListPostalMail(Boolean blackListPostalMail) {
		this.blackListPostalMail = blackListPostalMail;
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
	 * The cryptedId
	 */
	public String getCryptedId() {
		return cryptedId;
	}

	/**
	 * 
	 * @param cryptedId
	 * The cryptedId
	 */
	public void setCryptedId(String cryptedId) {
		this.cryptedId = cryptedId;
	}

	/**
	 * 
	 * @return
	 * The domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * 
	 * @param domain
	 * The domain
	 */
	public void setDomain(String domain) {
		this.domain = domain;
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
	 * The emailFormat
	 */
	public String getEmailFormat() {
		return emailFormat;
	}

	/**
	 * 
	 * @param emailFormat
	 * The emailFormat
	 */
	public void setEmailFormat(String emailFormat) {
		this.emailFormat = emailFormat;
	}

	/**
	 * 
	 * @return
	 * The fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * 
	 * @param fax
	 * The fax
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * 
	 * @return
	 * The firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param firstName
	 * The firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return
	 * The gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * 
	 * @param gender
	 * The gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 
	 * @return
	 * The lastModified
	 */
	public String getLastModified() {
		return lastModified;
	}

	/**
	 * 
	 * @param lastModified
	 * The lastModified
	 */
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * 
	 * @return
	 * The lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName
	 * The lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return
	 * The location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * 
	 * @param location
	 * The location
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * 
	 * @return
	 * The middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * 
	 * @param middleName
	 * The middleName
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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
	 * The phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 
	 * @param phone
	 * The phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 
	 * @return
	 * The postalAddress
	 */
	public PostalAddress getPostalAddress() {
		return postalAddress;
	}

	/**
	 * 
	 * @param postalAddress
	 * The postalAddress
	 */
	public void setPostalAddress(PostalAddress postalAddress) {
		this.postalAddress = postalAddress;
	}

	/**
	 * 
	 * @return
	 * The salutation
	 */
	public String getSalutation() {
		return salutation;
	}

	/**
	 * 
	 * @param salutation
	 * The salutation
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	/**
	 * 
	 * @return
	 * The subscriptions
	 */
	public CampaignServiceUrl getUrlToSubscriptions() {
		return urlToSubscriptions;
	}

	/**
	 * 
	 * @param subscriptions
	 * The subscriptions
	 */
	public void setUrlToSubscriptions(CampaignServiceUrl urlToSubscriptions) {
		this.urlToSubscriptions = urlToSubscriptions;
	}

	/**
	 * 
	 * @return
	 * The thumbnail
	 */
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * 
	 * @param thumbnail
	 * The thumbnail
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
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

	public Profile(String pKey) {
		this.pKey = pKey;
	}

}