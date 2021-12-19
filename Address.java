
public class Address extends Location {


	private String number;
	Street street;
	
	/**
	 * sent address number
	 * @param int number
	 */
	public void setNumber(String number) {
		this.number = number;
	} // setNumber() method in Address class
	
	/**
	 * get address number
	 * @return int number
	 */
	public String getNumber() {
		return number;
	} // getNumber() method in Address class
	
	/**
	 * sets address number to a random number
	 */
	public void setRandomNumber(){
		int length, digit;
		String number = "";
		
		length = (int)((Math.random() * 5) + 1);
		
		for (int i=0; i < length; i++) {
			digit = (int)((Math.random() * 8) + 1);
			number = number + digit;
		}
		
		while(number.subSequence(0, 1).equals("0")) {
			number = number.substring(1); 
		} 
		setNumber(number);	
	} // setRandomNumber() method in Address class
	
	/**
	 * Overrides the toString() method to return address as a String;
	 */
	public String toString() {
		String address;
		
		address = getNumber() + " " + 
		           street.getStreet() + " ," + 
		           super.getCity();
		
		return address;
	} // toString() method in Address class
	
	/**
	 * void constructor with random attribute values
	 */
	public Address() {
		super();
		setRandomNumber();
		street = new Street();
	} // void constructor in Address class
	
	/**
	 * Constructor w/attribute params
	 * @param str address street
	 * @param cty address city
	 */
	public Address(String num, String str, String cty) {
		super(cty);
		setNumber(num);
		street = new Street(str);
	} // Address() constructor in Address class
	
} // Address class
