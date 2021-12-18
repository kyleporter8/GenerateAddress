import java.util.Scanner;

public class GenerateAddress {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		Address AHQ2;
		Intersection INDIAN_SCHOOL;
		
		AHQ2 = new Address("2425", "W","LOWER BUCKEYE", "RD", "PHX");
		INDIAN_SCHOOL = new Intersection("N", "27TH", "AV", "W", "INDIAN SCHOOL", "RD", "PHX");
		
		System.out.println("Test Address >>>");		
		System.out.println(AHQ2);
		System.out.println();
		System.out.println("Test Intersection >>>");
		System.out.println(INDIAN_SCHOOL);
		
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
		
		keyboard.close();
		
	} // main() method in GenerateAddress class
	
} // GenerateAddress class
