//IT26102748 Mediwaka M.W.A.H.C.B.

import java.util.Scanner;

public class IT26102748Lab4Q2{
	
	public static void main(String[] args){
		
		int examMarks,labMarks,examPercentage,labPercentage;
		double finalMarks;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks = input.nextInt();
		
		if (examMarks < 0 || examMarks > 100)
		{
			System.out.println("Invalid input for exam marks. Terminating program");
			return;
		}
		
		
		
		System.out.print("Please enter lab submission marks (out of 100): ");
		labMarks = input.nextInt();
		
		if (labMarks < 0 || labMarks > 100)
		{
			System.out.println("Invalid input for lab submission marks marks. Terminating program");
			return;
		}
		
		
		
		System.out.print("Please enter the percentage given for the exam: ");
		examPercentage = input.nextInt();
		
		System.out.print("Please enter the percentage given for the lab submission: ");
		labPercentage = input.nextInt();
		
		if(examPercentage + labPercentage != 100)
		{
			System.out.println("The percentage must add up to 100. Terminating program.");
			return;
		}
		
		
		
		finalMarks = examMarks * examPercentage/100.0 + labMarks * labPercentage/100.0;
		
		System.out.println("Final Exam Mark is : " + finalMarks);
		
	}
}