import java.util.Scanner;

public class IT26102558Lab4Q3 {
	public static void main(String[] args){
		 
		int number;
   	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enther a number: ");
	number=input.nextInt();
	
	System.out.print(number > 0 ? "The number is:Positive" : "The number is:Negative");
	System.out.print(number==0? "The number is:Zero" : ".");
		 
	}
}