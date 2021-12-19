
public class Freeway {

	private String freeway;
	
	/**
	 * sets freeway name 
	 * @param String freeway
	 */
	public void setFreeway(String freeway) {
		this.freeway = freeway;
	} // setFreeway() method in Freeway class
	
	/**
	 * get freeway name
	 * @return String freeway
	 */
	public String getFreeway() {
		return freeway;
	} // getFreeway() method in Freeway class
	
	/**
	 * sets freeway attribute to a random freeway
	 */
	public void setRandomFreeway() {
		String freeway;
		String[] freeways = {"A101", "A202", "A303", "A51", "I10", "I17", "US60", "A143"};
		int randNum = (int)((Math.random() * freeways.length));
		
		freeway = freeways[randNum];
		setFreeway(freeway);
	} // setRandomFreeway() method in Freeway class
	
	/**
	 * Constructor sets freeway name and cross road
	 * @param String freeway
	 * @param String xRoad
	 */
	public Freeway(String freeway) {
		setFreeway(freeway);
	} // Freeway() constructor in Freeway class
	
	/**
	 * void Constructor sets random freeway name and cross road
	 */
	public Freeway() {
		setRandomFreeway();
	}// void Freeway() constructor in freeway class

} // Freeway class 
