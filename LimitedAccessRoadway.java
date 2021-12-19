
public class LimitedAccessRoadway extends Location {
	
	Freeway freeway;
	Street street;
	DirectionOfTravel doT;
	
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
		street = new Street();
		doT = new DirectionOfTravel();
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
