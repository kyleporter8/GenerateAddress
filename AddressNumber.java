
public class AddressNumber {
	
	private String number;
	
	/**
	 * sent address number
	 * @param int number
	 */
	public void setNumber(String number) {
		this.number = number;
	} // setNumber() method in AddressNumber class
	
	/**
	 * get address number
	 * @return int number
	 */
	public String getNumber() {
		return number;
	} // getNumber() method in AddressNumber class
	
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
		
	} // setRandomNumber() method in AddressNumber class
	
	/**
	 * Constructor 
	 * @param int number
	 */
	public AddressNumber(String number) {
		
		setNumber(number);
		
	} // AddressNumber() constructor in AddressNumber class
	
	/**
	 * void default Constructor w/random number
	 */
	public AddressNumber() {
		
		setRandomNumber();
		
	}// void AddressNumber() constructor in AddressNumber class
	
} // AddressNumber class
