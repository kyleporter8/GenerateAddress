
public class GenerateAddress {

	public static void main(String[] args) {
		String city;
		int addrNum;
		String dir;
		String street;
		String suffix;
		
		City randomCity = new City();
		city = randomCity.getCode();
		
		AddressNumber randomNumber = new AddressNumber();
		addrNum = randomNumber.getNumber();
		
		dir = getDir();
		street = getStreet();
		suffix = getSuffix();
		
		System.out.println(addrNum + " " + dir + " " + street + " " + suffix + " ," + city);
		
	} // main() method in GenerateAddress class
	
	/***
	 * generate random city code
	 * @return String of city code
	 
	public static String getCity() {
		String city;
		String[] cities = {"HRQ", "TON", "BUC", "BUV", "GDY",
						   "LFP", "AVO", "TOL", "GLN", "PEO",
						   "SUN", "YNG", "ELM", "SCW", "SUR",
						   "WIT", "BCC", "DSY", "LAV", "PDV", 
						   "SCT", "TMP", "GUA", "CHA", "SLK", 
						   "MAR", "PHX", "GIB"};
		
		int randNum = (int)((Math.random() * cities.length));
		city = cities[randNum];	
		return city;
	} // getCity() method in GenerateAddress class
	*/
	/**
	 * gets address number 
	 * @return string number of 1 - 5 digits
	 
	public static String getAddrNum() {
		int num, length, digit;
		String number = "";
		
		length = (int)((Math.random() * 5) + 1);
		
		for (int i=0; i < length; i++) {
			digit = (int)((Math.random() * 8) + 1);
			number = number + digit;
		}
		
		while(number.subSequence(0, 1).equals("0")) {
			number = number.substring(1);
		}
		return number;
	} // getAddrNum() method in GenerateAddress class
	*/
	
	/**
	 * get street directional
	 * @return String direction dir
	 */
	public static String getDir() {
		String[] dirArr = {"N", "S", "E", "W"};
		
		String dir = dirArr[(int)((Math.random() * 4))];
		return dir;
	} // getDir() method in GenerateAddress class
	
	/**
	 * get Street name
	 * @return String of street name
	 */
	public static String getStreet() {
		String street;
		String[] streetArr = {"3rd", "59th", "16th", "24th", "7th",
							  "Minnezona", "Dorsey", "Clarendon", "Osborn", "Central"};
		
		street = streetArr[(int)((Math.random() * streetArr.length))];
		
		return street;
		} // getStreet() in GenerateAddress class
	
	/**
	 * get street suffix
	 * @return String suffix
	 */
	public static String getSuffix() {
		String suffix;
		String[] suffixArr = {"ST", "PL", "WY", "AV", "DR", "LN",
							  "ML", "PS", "PA", "PW", "RR", "RD",
							  "AC", "FY", "PT", "WW", "EX", "VS"};
		
		suffix = suffixArr[(int)((Math.random() * suffixArr.length))];
		return suffix;
	} // getSuffix() method in GenerateAddress class
	
}
