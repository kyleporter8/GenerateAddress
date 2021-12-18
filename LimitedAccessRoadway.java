
public class LimitedAccessRoadway extends Location {
	
	Freeway freeway;
	Direction direction;
	Street street;
	Suffix suffix;
	DirectionOfTravel doT;
	
	/**
	 * Constructor sets attributes with params
	 * @param fy
	 * @param dir
	 * @param str
	 * @param sfx
	 * @param dt
	 * @param city
	 */
	public LimitedAccessRoadway(String fy, String dir, String str, String sfx, String dt, String pos, String city) {
		super(city);
		freeway = new Freeway(fy);
		direction = new Direction(dir);
		street = new Street(str);
		suffix = new Suffix(sfx);
		doT = new DirectionOfTravel(dt, pos);
	} // LimitedAccessRoadway() constructor in LimitedAccessRoadway class
	
	/**
	 * void constructor sets random attribute values
	 */
	public LimitedAccessRoadway() {
		super();
		freeway = new Freeway();
		direction = new Direction();
		street = new Street();
		suffix = new Suffix();
		doT = new DirectionOfTravel();
	} // void LimitedAccessRoadway() constructor in LimitedAccessRoadway class
	
	/**
	 * overrides toString() method to return Limited Access Roadway String
	 */
	public String toString() {
		String lAR;
		lAR = freeway.getFreeway() + " @ " + 
		      direction.getDir() + " " + 
			  street.getStreet() + " " + 
		      suffix.getSuffix() + " " +
			  doT.getDoT() + " " + 
		      doT.getPosition() + " ," + 
			  super.getCity();
		
		return lAR;
	} // toString() method in LimitedAccessRoadway class
	
} // LimitedAccessRoadway class
