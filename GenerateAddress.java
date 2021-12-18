import java.util.Scanner;

public class GenerateAddress {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		Address AHQ2;

		AHQ2 = new Address("2425", "W","LOWER BUCKEYE", "RD", "PHX");
		
		System.out.println("Test Address >>>");		
		System.out.println(AHQ2);
		
		System.out.print("\nHow many random addresses do you wish to generate?> ");
		num = keyboard.nextInt();
		
		for(int i=0; i<num; i++) {
			
			Address address = new Address();
			
			System.out.println(address);
		}
		
		keyboard.close();
		
	} // main() method in GenerateAddress class
	
} // GenerateAddress class
