import java.util.Scanner;

public class IT26102747Lab4Q2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter exam marks: ");
        double examMarks = input.nextDouble();

        System.out.print("Enter lab marks: ");
        double labMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100 ||
            labMarks < 0 || labMarks > 100) {

            System.out.println("Invalid marks. Marks must be 0-100.");

        } else {
            System.out.print("Enter exam percentage: ");
            double examPercentage = input.nextDouble();

            System.out.print("Enter lab percentage: ");
            double labPercentage = input.nextDouble();

            if (examPercentage < 0 || examPercentage > 100 ||
                labPercentage < 0 || labPercentage > 100 ||
                examPercentage + labPercentage != 100) {

                System.out.println(
                    "Invalid percentages. They must add to 100."
                );

            } else {
                double finalMark =
                    (examMarks * examPercentage / 100) +
                    (labMarks * labPercentage / 100);

                System.out.println(
                    "Final module mark: " + finalMark
                );
            }
        }

        input.close();
    }
}