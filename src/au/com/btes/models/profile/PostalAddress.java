package au.com.btes.models.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostalAddress {

	@SerializedName("addrDefined")
	@Expose
	private Boolean addrDefined;
	@SerializedName("addrErrorCount")
	@Expose
	private Integer addrErrorCount;
	@SerializedName("addrLastCheck")
	@Expose
	private String addrLastCheck;
	@SerializedName("addrQuality")
	@Expose
	private String addrQuality;
	@SerializedName("line1")
	@Expose
	private String line1;
	@SerializedName("line2")
	@Expose
	private String line2;
	@SerializedName("line3")
	@Expose
	private String line3;
	@SerializedName("line4")
	@Expose
	private String line4;
	@SerializedName("line5")
	@Expose
	private String line5;
	@SerializedName("line6")
	@Expose
	private String line6;
	@SerializedName("serialized")
	@Expose
	private String serialized;

	/**
	 * 
	 * @return
	 * The addrDefined
	 */
	public Boolean getAddrDefined() {
		return addrDefined;
	}

	/**
	 * 
	 * @param addrDefined
	 * The addrDefined
	 */
	public void setAddrDefined(Boolean addrDefined) {
		this.addrDefined = addrDefined;
	}

	/**
	 * 
	 * @return
	 * The addrErrorCount
	 */
	public Integer getAddrErrorCount() {
		return addrErrorCount;
	}

	/**
	 * 
	 * @param addrErrorCount
	 * The addrErrorCount
	 */
	public void setAddrErrorCount(Integer addrErrorCount) {
		this.addrErrorCount = addrErrorCount;
	}

	/**
	 * 
	 * @return
	 * The addrLastCheck
	 */
	public String getAddrLastCheck() {
		return addrLastCheck;
	}

	/**
	 * 
	 * @param addrLastCheck
	 * The addrLastCheck
	 */
	public void setAddrLastCheck(String addrLastCheck) {
		this.addrLastCheck = addrLastCheck;
	}

	/**
	 * 
	 * @return
	 * The addrQuality
	 */
	public String getAddrQuality() {
		return addrQuality;
	}

	/**
	 * 
	 * @param addrQuality
	 * The addrQuality
	 */
	public void setAddrQuality(String addrQuality) {
		this.addrQuality = addrQuality;
	}

	/**
	 * 
	 * @return
	 * The line1
	 */
	public String getLine1() {
		return line1;
	}

	/**
	 * 
	 * @param line1
	 * The line1
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}

	/**
	 * 
	 * @return
	 * The line2
	 */
	public String getLine2() {
		return line2;
	}

	/**
	 * 
	 * @param line2
	 * The line2
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}

	/**
	 * 
	 * @return
	 * The line3
	 */
	public String getLine3() {
		return line3;
	}

	/**
	 * 
	 * @param line3
	 * The line3
	 */
	public void setLine3(String line3) {
		this.line3 = line3;
	}

	/**
	 * 
	 * @return
	 * The line4
	 */
	public String getLine4() {
		return line4;
	}

	/**
	 * 
	 * @param line4
	 * The line4
	 */
	public void setLine4(String line4) {
		this.line4 = line4;
	}

	/**
	 * 
	 * @return
	 * The line5
	 */
	public String getLine5() {
		return line5;
	}

	/**
	 * 
	 * @param line5
	 * The line5
	 */
	public void setLine5(String line5) {
		this.line5 = line5;
	}

	/**
	 * 
	 * @return
	 * The line6
	 */
	public String getLine6() {
		return line6;
	}

	/**
	 * 
	 * @param line6
	 * The line6
	 */
	public void setLine6(String line6) {
		this.line6 = line6;
	}

	/**
	 * 
	 * @return
	 * The serialized
	 */
	public String getSerialized() {
		return serialized;
	}

	/**
	 * 
	 * @param serialized
	 * The serialized
	 */
	public void setSerialized(String serialized) {
		this.serialized = serialized;
	}

}