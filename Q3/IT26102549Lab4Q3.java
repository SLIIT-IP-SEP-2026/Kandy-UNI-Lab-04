import java.util.Scanner;

public class IT26102549Lab4Q3{

public static void main(String[]arg){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number:");
	
	int number = sc.nextInt();
	String message;
	
	message = (number > 0)?"The number is : Positive":(number < 0)?"The number is : Negative" : "The number is : Zero";
	System.out.println("message"+message);
	
	sc.close();
}

}