
package roseindia.tutorial.hibernate;

import java.util.Date;
/**
 * @author Deepak Kumar
 *
 * http://www.roseindia.net
 * Java Class to map to the database insurance table
 */
public class Insurance {
	private long lngInsuranceId;
	private String insuranceName;
	private int investementAmount;
	private Date investementDate;
	
	/**
	 * @return Returns the insuranceName.
	 */
	public String getInsuranceName() {
		return insuranceName;
	}
	/**
	 * @param insuranceName The insuranceName to set.
	 */
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	/**
	 * @return Returns the investementAmount.
	 */
	public int getInvestementAmount() {
		return investementAmount;
	}
	/**
	 * @param investementAmount The investementAmount to set.
	 */
	public void setInvestementAmount(int investementAmount) {
		this.investementAmount = investementAmount;
	}
	/**
	 * @return Returns the investementDate.
	 */
	public Date getInvestementDate() {
		return investementDate;
	}
	/**
	 * @param investementDate The investementDate to set.
	 */
	public void setInvestementDate(Date investementDate) {
		this.investementDate = investementDate;
	}
	/**
	 * @return Returns the lngInsuranceId.
	 */
	public long getLngInsuranceId() {
		return lngInsuranceId;
	}
	/**
	 * @param lngInsuranceId The lngInsuranceId to set.
	 */
	public void setLngInsuranceId(long lngInsuranceId) {
		this.lngInsuranceId = lngInsuranceId;
	}
}
