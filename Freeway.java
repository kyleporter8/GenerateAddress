
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
		String[] freeways = {"A101", "A202", "A238", "A347", "A51",
							 "A85", "A87", "I10", "I8", "I17", "SUNVALLEY PW",
							 "US60", "GRANDE AV"};
		int randNum = (int)((Math.random() * freeways.length));
		
		freeway = freeways[randNum];
		setFreeway(freeway);
	} // setRandomFreeway() method in Freeway class
	
	/**
	 * Constructor sets freeway name
	 * @param String freeway
	 */
	public Freeway(String freeway) {
		setFreeway(freeway);
	} // Freeway() constructor in Freeway class
	
	/**
	 * void Constructor sets random freeway name
	 */
	public Freeway() {
		setRandomFreeway();
	}// void Freeway() constructor in freeway class

} // Freeway class 
