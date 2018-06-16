import java.util.Scanner;


public class CalcFactorial {

	public static void main (String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		int number;
		int result = 1;
		
		while (choice.equalsIgnoreCase("y")) {
			
			//Ask User to enter a number 
			System.out.print("Enter an integer that's greater than 0 and less than 10: ");
			number = sc.nextInt(); 
			
			
			//Calculates the Factorial
			if(number <= 0 || number >= 10) {
				result = 1;
			} else {
				for(int i = 1; i <= number; i++) {
					result = result * i;
				}
			}
			
			System.out.println("The factorial of " + number + " is: " + result + ".");
			System.out.println();
			
			//Check is user wants to continue
			System.out.print("Continue (y/n): ");
			choice = sc.next();
			System.out.println();
		}
	}
}
