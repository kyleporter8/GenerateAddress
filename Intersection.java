
public class Intersection extends Location {


	Street streetA;
	Street streetB;

	/**
	 * Constructor with params
	 * @param strA
	 * @param strB
	 * @param city
	 */
	public Intersection(String strA, String strB, String city) {
		super(city);;
		streetA = new Street(strA); 
		streetB = new Street(strB);
	} // Intersection() constructior in Intersection class
	
	/**
	 * constructor w/o params
	 * generates random attribute values
	 */
	public Intersection() {
		super();
		streetA = new Street(); 
		streetB = new Street();
	} // Intersection() constructor w/o params in Intersection class
	
	/**
	 * method Overrides toString() to return String of entire address
	 */
	public String toString() {
		String intersection;
		
		intersection = streetA.getStreet() + "/" + 
				       streetB.getStreet() + " ," + 
				       super.getCity();
		
		return(intersection);
	} // toString() method in Intersection class
	
} // Intersection class
