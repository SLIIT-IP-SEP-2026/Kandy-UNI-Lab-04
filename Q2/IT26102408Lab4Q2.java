import java.util.Scanner;

public class IT26102408Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double exam = input.nextDouble();

        if (exam < 0 || exam > 100) {
            System.out.println("Invalid input. Marks should be between 0 and 100.");
        } else {
            System.out.print("Please enter lab submission marks (out of 100): ");
            double lab = input.nextDouble();

            if (lab < 0 || lab > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
            } else {
                System.out.print("Please enter the percentage given for the exam: ");
                double examPercent = input.nextDouble();

                System.out.print("Please enter the percentage given for the lab submission: ");
                double labPercent = input.nextDouble();

                if (examPercent + labPercent != 100) {
                    System.out.println("The percentages must add up to 100. Terminating program.");
                } else {
                    double finalMark = (exam * examPercent / 100) + (lab * labPercent / 100);
                    System.out.println("Final mark is : " + finalMark);
                }
            }
        }

        input.close();
    }
}