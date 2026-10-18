import java.util.Scanner;

public class IT26101588Lab4Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter exam marks:");
        double marks = sc.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.println("Please enter lab submission marks:");
        double labMarks = sc.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        System.out.println("Please enter the percentage given for the exam:");
        double marksPercentage = sc.nextDouble();

        System.out.println("Please enter the percentage given for the lab submission:");
        double labmarksPercentage = sc.nextDouble();

        if (marksPercentage < 0 || marksPercentage > 100 || labmarksPercentage < 0 || labmarksPercentage > 100 || Math.abs(marksPercentage + labmarksPercentage - 100) > 0.000001) {

            System.out.println("The percentages must be between 0 and 100 and add up to 100. Terminating program.");
            return;
        }

        double finalMarks = (marks * marksPercentage / 100) + (labMarks * labmarksPercentage / 100);

        System.out.println("Final marks: " + finalMarks);
    }
}