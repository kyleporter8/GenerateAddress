
public class Address extends Location {


	private String number;
	Direction direction;
	Street street;
	Suffix suffix;
	
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
				   direction.getDir() + " " + 
		           street.getStreet() + " " + 
				   suffix.getSuffix() + " ," +
		           super.getCity();
		
		return address;
	} // toString() method in Address class
	
	/**
	 * void constructor with random attribute values
	 */
	public Address() {
		super();
		setRandomNumber();
		direction = new Direction();
		street = new Street();
		suffix = new Suffix();
	} // void constructor in Address class
	
	/**
	 * Constructor w/attribute params
	 * @param num address number
	 * @param dir address direction
	 * @param str address street
	 * @param sfx address suffix
	 * @param cty address city
	 */
	public Address(String num, String dir, String str, String sfx, String cty) {
		super(cty);
		setNumber(num);
		direction = new Direction(dir);
		street = new Street(str);
		suffix = new Suffix(sfx);
	} // Address() constructor in Address class
	
} // Address class
