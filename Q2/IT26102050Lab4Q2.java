import java.util.Scanner;

public class IT26102050Lab4Q2{
	
	public static void main(String[] args){
		
		double examMarks, labMarks, examPercentage, labPercentage, finalMark;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter exam marks (out of 100): ");
		examMarks = input.nextDouble();
		
		if(examMarks < 0 || examMarks > 100)
		{
			System.out.print("Invalid input for exam marks. Terminating program.");
			return ;
		}
		System.out.println("Please enter lab marks (out of 100): ");
		labMarks = input.nextDouble();
		
			if(labMarks < 0 || labMarks > 100)
		{
			System.out.print("Invalid input for lab marks. Terminating program.");
			return ;
		}
		
		System.out.println("Please enter lab percentage (out of 100): ");
		labPercentage = input.nextDouble();
		
		System.out.println("Please enter exam percentage (out of 100): ");
		examPercentage = input.nextDouble();
		
		if (labPercentage + examPercentage != 100)
		{
			System.out.print("Percentages must add up to 100. Terminating program.");
			return ;	
		}
		
		finalMark = (examMarks * examPercentage/100) + (labMarks * labPercentage/100);
		System.out.println("Final mark is : " + finalMark);
	}
	
}