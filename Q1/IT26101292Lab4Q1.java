import java.util.Scanner;

public class IT26101292lab4Q1{
	public static void main(String[] args){
		
		int no1;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		no1=input.nextInt();
		if(no1>0)
		{
			System.out.println("The number is :Positive");
		}
		else if(no1<0){
			System.out.println("The number is :Negative");
		}
		else if(no1==0){
			System.out.println("The number is :Zero");
		}
		
	
		
	}
}











