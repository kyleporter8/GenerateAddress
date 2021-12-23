
public class LimitedAccessRoadway extends Location {
	
	Freeway freeway;
	Street street;
	DirectionOfTravel doT;
	
	/**
	 * Sets a random cross rd based upon freeway in question
	 * @param String fy
	 */
	public String setRandomXRoad(String fy) {
		
		int randNum;
		String xRd;
		switch(fy) {		
		
			case "A101":
				String[] A101Arr = {"W MCDOWELL RD", "W THOMAS RD", "W INDIAN SCHOOL RD", "W BETHANY HOME RD", "W GLENDALE AV",
						             "W NORTHERN AV", "W OLIVE AV", "W PEORIA AV", "W GRAND AV", "W THUNDERBIRD RD", "E THUNDERBIRD RD", "W RAY RD"};
				randNum = (int)((Math.random() * A101Arr.length));
				xRd = A101Arr[randNum];
				break;
			
			case "A202":
				String A202Arr[] = {"N 24TH ST", "N 32ND ST", "N 40TH ST", "N 44TH ST", "E VAN BUREN ST",
								  "E SKY HARBOR BL", "N PRIEST DR", "N SCOTTSDALE RD", "N MCCLINTOCK DR", "S PRICE RD"};
				randNum = (int)((Math.random() * A202Arr.length));
				xRd = A202Arr[randNum];
				break;
				
			case "A303":
				String A303Arr[] = {"W THOMAS RD", "W INDIAN SCHOOL RD", "W CAMELBACK RD", "W BETHANY HOME RD", "W GLENDALE AV",
						   			"W NORTHERN AV", "W NORTHERN PW", "W OLIVE AV", "W CACTUS RD", "W WADDELL RD"};
				randNum = (int)((Math.random() * A303Arr.length));
				xRd = A303Arr[randNum];
				break;
				
			case "A51":
				String A51Arr[] = {"E MCDOWELL RD", "E THOMAS RD", "E INDIAN SCHOOL RD", "E HIGHLAND AV", "E COLTER ST",
						           "E BETHANY HOME RD", "E GLENDALE AV", "E NORTHERN AV", "N 32ND ST", "E SHEA BL"};
				randNum = (int)((Math.random() * A51Arr.length));
				xRd = A51Arr[randNum];
				break;
				
			case "I10":
				String I10Arr[] = {"S MILLER RD", "N ESTRELLA PW", "N AVONDALE BL", "N 59TH AV", "N 7TH ST",
									"E SKY HARBOR BL", "E UNIVERSITY DR", "S 40TH ST", "W BASELINE RD", "E GUADALUPE RD", "W RAY RD"};
				randNum = (int)((Math.random() * I10Arr.length));
				xRd = I10Arr[randNum];
				break;
				
			case "I17":
				String I17Arr[] = {"W GREENWAY RD", "W THUNDERBIRD RD", "W THOMAS RD", "W VAN BUREN ST", "W BUCKEYE RD",
									"S 19TH AV", "S 7TH AV", "S CENTRAL AV", "S 7TH ST", "S 16TH ST"};
				randNum = (int)((Math.random() * I17Arr.length));
				xRd = I17Arr[randNum];
				break;
				
			case "US60":
				String US60Arr[] = {"S PRIEST DR", "S KYRENE RD", "S MILL AV", "S RURAL RD", "S MCCLINTOCK DR"};
				randNum = (int)((Math.random() * US60Arr.length));
				xRd = US60Arr[randNum];
				break;
				
			case "A143":
				String A143Arr[] = {"E VAN BUREN ST", "E WASHINGTON ST", "E SKY HARBOR BL", "E UNIVERSITY DR"};
				randNum = (int)((Math.random() * A143Arr.length));
				xRd = A143Arr[randNum];
				break;
				
			default:
				Street xStreet = new Street();
				xRd = xStreet.getStreet();
				break;
		} // end of switch/case loop
		
		return xRd;
		
	} // end of setRandomXRoad() method in LimitedAccessRoadway class

	
	/**
	 * Constructor sets attributes with params
	 * @param fy
	 * @param str
	 * @param dt
	 * @param city
	 */
	public LimitedAccessRoadway(String fy, String str, String dt, String pos, String city) {
		super(city);
		freeway = new Freeway(fy);
		street = new Street(str);
		doT = new DirectionOfTravel(dt, pos);
		
	} // LimitedAccessRoadway() constructor in LimitedAccessRoadway class
	
	/**
	 * void constructor sets random attribute values
	 */
	public LimitedAccessRoadway() {
		super();
		freeway = new Freeway();
		street = new Street(setRandomXRoad(freeway.getFreeway()));
		doT = new DirectionOfTravel(street.getStreet());
		
		if(freeway.getFreeway().equals("A51")) {
			super.setCity("PHX");
		}
		
	} // void LimitedAccessRoadway() constructor in LimitedAccessRoadway class
	
	/**
	 * overrides toString() method to return Limited Access Roadway String
	 */
	public String toString() {
		String lAR;
		lAR = freeway.getFreeway() + " @ " + 
			  street.getStreet() + " " + 
			  doT.getDoT() + " " + 
		      doT.getPosition() + " ," + 
			  super.getCity();
		
		return lAR;
	} // toString() method in LimitedAccessRoadway class
	
} // LimitedAccessRoadway class
