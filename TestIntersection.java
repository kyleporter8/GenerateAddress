import java.util.Scanner;

public class TestIntersection {
		
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many random Intersections do you wish to generate?> ");
		
		int num = keyboard.nextInt();
		
		for(int i=0; i<num; i++) {
			
			Intersection intersection = new Intersection();
			
			System.out.println(intersection);
		}
		
		keyboard.close();
	}

}
