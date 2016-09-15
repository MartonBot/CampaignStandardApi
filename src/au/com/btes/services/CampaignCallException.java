package au.com.btes.services;

public class CampaignCallException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8450647896512687756L;

	public CampaignCallException(Exception e) {
		super(e);
	}
	
	public CampaignCallException(String message) {
		super(message);
	}
	
}