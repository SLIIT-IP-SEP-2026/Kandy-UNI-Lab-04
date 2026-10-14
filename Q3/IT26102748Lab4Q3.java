//IT26102748 Mediwaka M.W.A.H.C.B

import java.util.Scanner;

public class IT26102748Lab4Q3{
	
	public static void main(String[] args){
		
		int number;
		String message;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		message = (number > 0) ? "Positive" : 
		          (number < 0) ? "Negative" : "Zero";
				  
				  
		System.out.println("The number is: " + message);
	}
}	