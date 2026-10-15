import java.util.Scanner;

public class IT26102549Lab4Q1{
	
	public static void main(String[] agrs){
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		number = sc.nextInt();
		
		if (number > 0)
		{
			System.out.println("The number is : Positive");
		}
		else if (number == 0)
		{
			System.out.println("The number is : Zero");
		}
		else
		{
			System.out.println("The number is : Negative");
		}
		
		sc.close();
		
		
		
	}//end of main method
	
	
}//end of class