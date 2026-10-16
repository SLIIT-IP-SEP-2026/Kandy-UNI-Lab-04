import java.util.Scanner;
public class IT26102625Lab4Q3{
	public static void main(String[]args){

    int a;
	Scanner input = new Scanner(System.in);

    System.out.println("Enter the number:");
	a = input.nextInt();
	
	String result = (a>0)? "positive" : (a<0)? "Negative" : "Zero";

    System.out.println("The number is :" +result);





	}

}