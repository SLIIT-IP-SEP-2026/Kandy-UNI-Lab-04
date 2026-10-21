import java.util.Scanner;

public class IT26102536Lab4Q2 {
    public static void main(String[] args) {

        //Scanner object create(Scanner class)
        Scanner input = new Scanner(System.in);

        //Declare variables
        double exam_marks, lab_marks, exam_pct, lab_pct;

        //Get user inputs
        System.out.print("Please enter exam marks (out of 100): ");
        exam_marks = input.nextDouble();
        if (exam_marks < 0 || exam_marks > 100) {
            System.out.print("Invalid input for exam marks. Terminating program.");
            return;
        }
        
        System.out.print("Please enter lab submission marks (out of 100): ");
        lab_marks = input.nextDouble();
        if (lab_marks < 0 || lab_marks > 100) {
            System.out.print("Invalid input for exam marks. Teminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        exam_pct = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        lab_pct = input.nextDouble();

        if (exam_pct + lab_pct != 100) {
            System.out.print("The percentages must add up to 100. Terminating program. ");
            return;
        }
        
        double final_marks = exam_marks * (exam_pct/100) + lab_marks * (lab_pct/100);
        System.out.println("Final Exam Mark is : "+ final_marks);




    }
}
