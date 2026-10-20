import java.util.Scanner;

public class IT26102610_Lab4_Q3 {

    public static void main(String[] args) {
   
        double number;
        String result;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextDouble();

        result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("The number is: " + result);
    }
}