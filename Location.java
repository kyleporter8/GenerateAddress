
public class Location {

private String city;
	
	/**
	 * set the city's code
	 * @return void
	 */
	public void setCity(String city) {
		this.city = city;
	} // setCity method in Location class
	
	/**
	 * get city's code
	 * @return String code
	 */
	public String getCity() {
		return city;
	} // getCode() method in Location class
	
	/**
	 * generate a random city Code and set it to object's code
	 * @return String city 
	 */
	public void setRandomCity() {
		String city;
		String[] cities = {"HRQ", "TON", "BUC", "BUV", "GDY",
						   "LFP", "AVO", "TOL", "GLN", "PEO",
						   "SUN", "YNG", "ELM", "SCW", "SUR",
						   "WIT", "BCC", "DSY", "LAV", "PDV", 
						   "SCT", "TMP", "GUA", "CHA", "SLK", 
						   "MAR", "PHX", "GIB"};
		
		int randNum = (int)((Math.random() * cities.length));
		city = cities[randNum];
		setCity(city);
	} // setRandomCity() method in Location class
	
	/**
	 * Constructor
	 * @param String code
	 */
	public Location(String city) {
		
		setCity(city);
		
	} // Location() constructor in Location class
	
	/**
	 * Void default Constructor w/random code
	 */
	public Location() {
		
		setRandomCity();
		
	} // void Location() constructor in Location class
	
} // Location class
