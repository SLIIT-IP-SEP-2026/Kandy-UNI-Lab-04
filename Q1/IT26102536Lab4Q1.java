import java.util.Scanner;

public class IT26102536Lab4Q1 {
	
	public static void main (String[] args) {
		
		//Scanner object create - Scanner class
		Scanner input = new Scanner(System.in);
		
		//Declare variables
		int number;
		
		//Get user inputs
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		if (number < 0)
		{
			System.out.print("The number is: Negative");
		}
		else if (number > 0)
		{
			System.out.print("The number is: Positive");
		}
		else
		{
			System.out.print("The number is Zero");
		}
	}
}
		