package au.com.btes.models.services;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import au.com.btes.models.CampaignServiceUrl;

public class Service {

	@SerializedName("PKey")
	@Expose
	private String pKey;
	@SerializedName("builtIn")
	@Expose
	private Boolean builtIn;
	@SerializedName("created")
	@Expose
	private String created;
	@SerializedName("desc")
	@Expose
	private String desc;
	@SerializedName("end")
	@Expose
	private String end;
	@SerializedName("href")
	@Expose
	private String href;
	@SerializedName("isTemplate")
	@Expose
	private Boolean isTemplate;
	@SerializedName("label")
	@Expose
	private String label;
	@SerializedName("lastModified")
	@Expose
	private String lastModified;
	@SerializedName("limitedDuration")
	@Expose
	private Boolean limitedDuration;
	@SerializedName("mainDate")
	@Expose
	private String mainDate;
	@SerializedName("messageType")
	@Expose
	private String messageType;
	@SerializedName("mode")
	@Expose
	private String mode;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("publicLabel")
	@Expose
	private String publicLabel;
	@SerializedName("start")
	@Expose
	private String start;
	@SerializedName("subScenarioEventType")
	@Expose
	private String subScenarioEventType;
	@SerializedName("subscriptions")
	@Expose
	private CampaignServiceUrl urlToSubscribe;
	@SerializedName("targetResource")
	@Expose
	private String targetResource;
	@SerializedName("template")
	@Expose
	private Template template;
	@SerializedName("thumbnail")
	@Expose
	private String thumbnail;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("unsubScenarioEventType")
	@Expose
	private String unsubScenarioEventType;
	@SerializedName("validityDuration")
	@Expose
	private String validityDuration;

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
	 * The builtIn
	 */
	public Boolean getBuiltIn() {
		return builtIn;
	}

	/**
	 * 
	 * @param builtIn
	 * The builtIn
	 */
	public void setBuiltIn(Boolean builtIn) {
		this.builtIn = builtIn;
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
	 * The desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * 
	 * @param desc
	 * The desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * 
	 * @return
	 * The end
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * 
	 * @param end
	 * The end
	 */
	public void setEnd(String end) {
		this.end = end;
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
	 * The isTemplate
	 */
	public Boolean getIsTemplate() {
		return isTemplate;
	}

	/**
	 * 
	 * @param isTemplate
	 * The isTemplate
	 */
	public void setIsTemplate(Boolean isTemplate) {
		this.isTemplate = isTemplate;
	}

	/**
	 * 
	 * @return
	 * The label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * 
	 * @param label
	 * The label
	 */
	public void setLabel(String label) {
		this.label = label;
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
	 * The limitedDuration
	 */
	public Boolean getLimitedDuration() {
		return limitedDuration;
	}

	/**
	 * 
	 * @param limitedDuration
	 * The limitedDuration
	 */
	public void setLimitedDuration(Boolean limitedDuration) {
		this.limitedDuration = limitedDuration;
	}

	/**
	 * 
	 * @return
	 * The mainDate
	 */
	public String getMainDate() {
		return mainDate;
	}

	/**
	 * 
	 * @param mainDate
	 * The mainDate
	 */
	public void setMainDate(String mainDate) {
		this.mainDate = mainDate;
	}

	/**
	 * 
	 * @return
	 * The messageType
	 */
	public String getMessageType() {
		return messageType;
	}

	/**
	 * 
	 * @param messageType
	 * The messageType
	 */
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	/**
	 * 
	 * @return
	 * The mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * 
	 * @param mode
	 * The mode
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * 
	 * @return
	 * The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 * The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 * The publicLabel
	 */
	public String getPublicLabel() {
		return publicLabel;
	}

	/**
	 * 
	 * @param publicLabel
	 * The publicLabel
	 */
	public void setPublicLabel(String publicLabel) {
		this.publicLabel = publicLabel;
	}

	/**
	 * 
	 * @return
	 * The start
	 */
	public String getStart() {
		return start;
	}

	/**
	 * 
	 * @param start
	 * The start
	 */
	public void setStart(String start) {
		this.start = start;
	}

	/**
	 * 
	 * @return
	 * The subScenarioEventType
	 */
	public String getSubScenarioEventType() {
		return subScenarioEventType;
	}

	/**
	 * 
	 * @param subScenarioEventType
	 * The subScenarioEventType
	 */
	public void setSubScenarioEventType(String subScenarioEventType) {
		this.subScenarioEventType = subScenarioEventType;
	}

	/**
	 * 
	 * @return
	 * The URL used to subscribe to the service
	 */
	public CampaignServiceUrl getUrlToSubscribe() {
		return urlToSubscribe;
	}

	/**
	 * 
	 * @param urlToSubscribe
	 * The URL used to subscribe to the service
	 */
	public void setUrlToSubscribe(CampaignServiceUrl urlToSubscribe) {
		this.urlToSubscribe = urlToSubscribe;
	}

	/**
	 * 
	 * @return
	 * The targetResource
	 */
	public String getTargetResource() {
		return targetResource;
	}

	/**
	 * 
	 * @param targetResource
	 * The targetResource
	 */
	public void setTargetResource(String targetResource) {
		this.targetResource = targetResource;
	}

	/**
	 * 
	 * @return
	 * The template
	 */
	public Template getTemplate() {
		return template;
	}

	/**
	 * 
	 * @param template
	 * The template
	 */
	public void setTemplate(Template template) {
		this.template = template;
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

	/**
	 * 
	 * @return
	 * The unsubScenarioEventType
	 */
	public String getUnsubScenarioEventType() {
		return unsubScenarioEventType;
	}

	/**
	 * 
	 * @param unsubScenarioEventType
	 * The unsubScenarioEventType
	 */
	public void setUnsubScenarioEventType(String unsubScenarioEventType) {
		this.unsubScenarioEventType = unsubScenarioEventType;
	}

	/**
	 * 
	 * @return
	 * The validityDuration
	 */
	public String getValidityDuration() {
		return validityDuration;
	}

	/**
	 * 
	 * @param validityDuration
	 * The validityDuration
	 */
	public void setValidityDuration(String validityDuration) {
		this.validityDuration = validityDuration;
	}
	
}
