
public class GenerateAddress {

	public static void main(String[] args) {
		
		City randomCity = new City();
		AddressNumber randomNumber = new AddressNumber();
		Direction randomDir = new Direction();
		Street randomStreet = new Street();
		Suffix randomSuffix = new Suffix();
		
		
		System.out.println(randomNumber.getNumber() + " " + 
						   randomDir.getDir() + " " + 
				           randomStreet.getStreet() + " " + 
						   randomSuffix.getSuffix() + " ," + 
				           randomCity.getCode());
		
	} // main() method in GenerateAddress class
	
} // GenerateAddress class
