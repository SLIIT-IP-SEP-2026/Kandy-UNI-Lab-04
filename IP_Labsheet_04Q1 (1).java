import java.util.Scanner;

public class IP_Labsheet_04Q1{
	
	public static void main( String[] args) {
		 int num;
		 Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		  num =scanner.nextInt();
		 
		if ( num > 0){
			System.out.println("The number is : Positive ");
		} else if (num < 0){
		    System.out.println("The number is : Negative" );
		} else {
		    System.out.println("The number is : Zero");
		}	
		
		scanner.close();
		
	}
		

	
} 
  