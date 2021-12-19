
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
		
		boolean run = true;
		
		String dirA = streetA.getStreet().substring(0, 1);
		
		while(run) {

			String dirB = streetB.getStreet().substring(0, 1);
			
			if( (dirA.equals("N") || dirA.equals("S")) && 
			   (dirB.equals("E") || dirB.equals("W")) ){
					run = false;
			}
			
			else if( (dirA.equals("E") || dirA.equals("W")) && 
					(dirB.equals("N") || dirB.equals("S")) ) {
					run = false;
			}
			else {
				streetB = new Street();
			}
		} // end of while loop
		
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
