
public class Street {
	
	private String street;
	
	/**
	 * set Street name
	 * @param String street
	 */
	public void setStreet(String street) {
		this.street = street;
	} // setStreet() method in Street class
	
	/**
	 * get Street name
	 * @return String street
	 */
	public String getStreet() {
		return street;
	} // getStreet() method in Street class
	
	/**
	 * Constructor w/param to set street
	 * @param String street
	 */
	public Street(String street) {
		setStreet(street);
	} // Street() constructor in Street class
	
	/**
	 * default void Constructor sets random street
	 */
	public Street() {
		String street;
		String[] streetArr = {"3rd", "59th", "16th", "24th", "7th",
							  "Minnezona", "Dorsey", "Clarendon", "Osborn", "Central"};
		
		street = streetArr[(int)((Math.random() * streetArr.length))];
		setStreet(street);
	} // void Street() constructor in Street class 
	
} // Street class
