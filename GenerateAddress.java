import java.util.Scanner;

public class GenerateAddress {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		
		City city = new City("PHX");
		AddressNumber number = new AddressNumber("2425");
		Direction direction = new Direction("W");
		Street street = new Street("Lower Buckeye");
		Suffix suffix = new Suffix("Rd");
		
		System.out.println("Test Address >>>");		
		System.out.println(number.getNumber() + " " + 
						   direction.getDir() + " " + 
				           street.getStreet() + " " + 
						   suffix.getSuffix() + " ," +
				           city.getCode());
		
		System.out.print("\nHow many random addresses do you wish to generate?> ");
		num = keyboard.nextInt();
		
		for(int i=0; i<num; i++) {
			
			city.setRandomCode();
			number.setRandomNumber();
			direction.setRandomDirection();
			street.setRandomStreet();
			suffix.setRandomSuffix();
			
			System.out.println(number.getNumber() + " " + 
					   direction.getDir() + " " + 
			           street.getStreet() + " " + 
					   suffix.getSuffix() + " ," +
			           city.getCode());
		}
		
		keyboard.close();
		
	} // main() method in GenerateAddress class
	
} // GenerateAddress class
