import java.util.Scanner;

public class IT26101654Lab4Q1 {
    public static void main(String[] args) {
		
		double num1, answer;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		num1 = input.nextDouble();
		
		if(num1 > 0)
		System.out.println("The number is: Positive");
		
		else if(num1 < 0)
		System.out.println("The number is: Negative");
		
		else
		System.out.println("The number is Zero");
    }
}