import java.util.Scanner;

public class IT26102625Lab4Q1{
	public static void main(String[]arg) {
		
		int a ;
		Scanner input= new Scanner(System.in);
		
	  System.out.println("Enter the number");
	  a = input.nextInt();
	  
	  if(a>0) 
	  {
		System.out.println("The number is: positive");
	  }
	  else if(a<0) 
	  { 
	    System.out.println("The number is: Negative");
	  }
	  else
	  {
        System.out.println("The number is Zero");
	  }
	
		
		
	}
} 