import java.util.Scanner;

public class IT26101292lab4Q3{
	public static void main(String[] args){
		
		int no1;
		String message;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number");
		no1=input.nextInt();
		
		message=(no1>0) ? "Positive":(no1<0)? "Negative":"Zero";	

		
		System.out.println("The number is :"+message);
		
		

	}
}
