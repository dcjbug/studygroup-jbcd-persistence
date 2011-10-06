/**
 * @author Deepak Kumar
 *
 * http://www.roseindia.net
 * Java Class to map to the database Book table
 */
package roseindia.tutorial.hibernate;


public class Book {
	private long lngBookId;
	private String strBookName;
	
	/**
	 * @return Returns the lngBookId.
	 */
	public long getLngBookId() {
		return lngBookId;
	}
	/**
	 * @param lngBookId The lngBookId to set.
	 */
	public void setLngBookId(long lngBookId) {
		this.lngBookId = lngBookId;
	}
	/**
	 * @return Returns the strBookName.
	 */
	public String getStrBookName() {
		return strBookName;
	}
	/**
	 * @param strBookName The strBookName to set.
	 */
	public void setStrBookName(String strBookName) {
		this.strBookName = strBookName;
	}
}
