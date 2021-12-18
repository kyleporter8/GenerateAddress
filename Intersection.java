
public class Intersection extends Location {

	Direction directionA;
	Direction directionB;
	Street streetA;
	Street streetB;
	Suffix suffixA;
	Suffix suffixB;
	
	/**
	 * Constructor with params
	 * @param dirA
	 * @param dirB
	 * @param strA
	 * @param strB
	 * @param sufA
	 * @param sufB
	 * @param city
	 */
	public Intersection(String dirA, String strA, String sufA, String dirB,  String strB,  String sufB, String city) {
		super(city);
		directionA = new Direction(dirA);
		directionB = new Direction(dirB);
		streetA = new Street(strA); 
		streetB = new Street(strB);
		suffixA = new Suffix(sufA);
		suffixB = new Suffix(sufB);
	} // Intersection() constructior in Intersection class
	
	/**
	 * constructor w/o params
	 * generates random attribute values
	 */
	public Intersection() {
		super();
		directionA = new Direction();
		directionB = new Direction();
		streetA = new Street(); 
		streetB = new Street();
		suffixA = new Suffix();
		suffixB = new Suffix();
	} // Intersection() constructor w/o params in Intersection class
	
	public String toString() {
		String intersection;
		
		intersection = directionA.getDir() + " " + 
					   streetA.getStreet() + " " + 
				       suffixA.getSuffix() + "/" +
					   directionB.getDir() + " " + 
				       streetB.getStreet() + " " + 
					   suffixB.getSuffix() + " ," + 
				       super.getCity();
		
		return(intersection);
	}
	
} // Intersection class
