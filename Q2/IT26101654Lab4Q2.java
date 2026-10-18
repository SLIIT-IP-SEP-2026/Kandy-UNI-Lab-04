import java.util.Scanner;

public class IT26101654Lab4Q2 {
    public static void main(String[] args) {
        double examMarks, labMarks, examPerc, labPerc, finalMark;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        examMarks = input.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            System.exit(0);
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        labMarks = input.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab marks. Terminating program.");
            System.exit(0);
        }

        System.out.print("Please enter the percentage given for the exam: ");
        examPerc = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        labPerc = input.nextDouble();

        if (examPerc + labPerc != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            System.exit(0);
        }

        finalMark = (examMarks * examPerc / 100) + (labMarks * labPerc / 100);

        System.out.println("Final Exam Mark is : " + finalMark);
        
        input.close();
    }
}