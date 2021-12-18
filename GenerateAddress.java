import java.util.Scanner;

public class GenerateAddress {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		Address AHQ2;
		Intersection INDIAN_SCHOOL;
		LimitedAccessRoadway THUNDERBIRD;
		
		AHQ2 = new Address("2425", "W","LOWER BUCKEYE", "RD", "PHX");
		INDIAN_SCHOOL = new Intersection("N", "27TH", "AV", "W", "INDIAN SCHOOL", "RD", "PHX");
		THUNDERBIRD = new LimitedAccessRoadway("I17", "W", "THUNDERBIRD", "RD", "NB", "OF", "PHX");
		
		System.out.println("Test Address >>>");		
		System.out.println(AHQ2);
		System.out.println();
		System.out.println("Test Intersection >>>");
		System.out.println(INDIAN_SCHOOL);
		System.out.println();
		System.out.println("Test Limited Access Roadway >>>");
		System.out.println(THUNDERBIRD);
		
		System.out.print("\nHow many random Addresses do you wish to generate?> ");
		num = keyboard.nextInt();
		
		for(int i=0; i<num; i++) {
			
			Address address = new Address();
			
			System.out.println(address);
		}
		
		System.out.print("\nHow many random Intersections do you wish to generate?> ");
		num = keyboard.nextInt();
		
		for(int i=0; i<num; i++) {
			
			Intersection intersection = new Intersection();
			
			System.out.println(intersection);
		}
		
		System.out.print("\nHow many random Limited Access Roadways do you wish to generate?> ");
		num = keyboard.nextInt();
		
		for(int i=0; i<num; i++) {
			
			LimitedAccessRoadway lAR = new LimitedAccessRoadway();
			
			System.out.println(lAR);
		}
		
		keyboard.close();
		
	} // main() method in GenerateAddress class
	
} // GenerateAddress class
