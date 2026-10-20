import java.util.Scanner;

public class IT26102610_Lab4_Q1 {

    public static void main(String[] args) {

        int Number;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
		
        Number = input.nextInt();

        if (Number > 0) {
			
            System.out.println("The number is: Positive");
			
        } else if (Number < 0) {
			
            System.out.println("The number is: Negative");
			
        } else {
			
            System.out.println("The number is Zero");
        }
    }
}
	

	
	
	
	
		
