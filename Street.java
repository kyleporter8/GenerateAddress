
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
	 * sets street to a random String from Array
	 */
	public void setRandomStreet() {
		
		String street;
		String[] streetArr = {"N 3RD AV", "N 59TH AV", "N 16TH ST", "N 24TH ", "N 7TH ST",
							  "S 7TH AV", "S 67TH AV", "S 21ST PL", "S 16TH ST", "S 44TH ST",
							  "W MINNEZONA AV", "S DORSEY LN", "W CLARENDON AV", "E OSBORN RD", "N CENTRAL AV",
							  "N NORTHVALLEY PW", "W CIVIC CENTER DR", "W THUNDERBIRD RD", "S POWER RD", "E UNIVERSITY DR"};
		street = streetArr[(int)((Math.random() * streetArr.length))];
		setStreet(street);
		
	}// setRandomStreet() method in Street class
	
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
		
		setRandomStreet();
		
	} // void Street() constructor in Street class 
	
} // Street class
