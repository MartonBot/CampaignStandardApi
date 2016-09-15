package au.com.btes.models.profile;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

	@SerializedName("address1")
	@Expose
	private String address1;
	@SerializedName("address2")
	@Expose
	private String address2;
	@SerializedName("address3")
	@Expose
	private String address3;
	@SerializedName("address4")
	@Expose
	private String address4;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("countryCode")
	@Expose
	private String countryCode;
	@SerializedName("stateCode")
	@Expose
	private String stateCode;
	@SerializedName("zipCode")
	@Expose
	private String zipCode;

	/**
	 * 
	 * @return
	 * The address1
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * 
	 * @param address1
	 * The address1
	 */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	/**
	 * 
	 * @return
	 * The address2
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * 
	 * @param address2
	 * The address2
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	/**
	 * 
	 * @return
	 * The address3
	 */
	public String getAddress3() {
		return address3;
	}

	/**
	 * 
	 * @param address3
	 * The address3
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	/**
	 * 
	 * @return
	 * The address4
	 */
	public String getAddress4() {
		return address4;
	}

	/**
	 * 
	 * @param address4
	 * The address4
	 */
	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	/**
	 * 
	 * @return
	 * The city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * 
	 * @param city
	 * The city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 * @return
	 * The countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * 
	 * @param countryCode
	 * The countryCode
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * 
	 * @return
	 * The stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * 
	 * @param stateCode
	 * The stateCode
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	/**
	 * 
	 * @return
	 * The zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * 
	 * @param zipCode
	 * The zipCode
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}