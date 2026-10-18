import java.util.Scanner;

public class IT26101588Lab4Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int number = sc.nextInt();

        String result = (number > 0) ? "Positive number"
                      : (number < 0) ? "Negative number"
                      : "Number is Zero";

        System.out.println(result);
    }
}