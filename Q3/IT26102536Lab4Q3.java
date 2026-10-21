import java.util.Scanner;
public class IT26102536Lab4Q3 {
	public static void main(String[] args) {
		
		
		//Scanner object create(Scanner class)
        Scanner input = new Scanner(System.in);

        //Declare variables
		int num;
		
		
		//Get user inputs
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		//Using ternary operator
		String result = (num>0) ? "Positive" : (num<0 ? "Negative" : "Zero");
		
		System.out.println("The number is: " +result);
	}
}
		
	