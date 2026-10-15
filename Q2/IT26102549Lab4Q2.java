import java.util.Scanner;

public class IT26102549Lab4Q2{
	
	public static void main(String[] args){
		
		double examMarks,labSub,examPercentage,labPercentage,finalmark;
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Please enter exam marks (out of 100):");
		examMarks = sc.nextDouble();
		if (examMarks < 0 || 100 < examMarks){
			System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		
		System.out.println("Please enter lab submission marks (out of 100):");
		labSub = sc.nextDouble();
		if (labSub < 0 || 100 < labSub){
			System.out.println("Invalid input for lab marks. Terminating program.");
			return;
		}
		
		System.out.println("Please enter the percentage given for the exam :");
		examPercentage = sc.nextDouble();
		
		System.out.println("Please enter the percentage given for the lab submission :");
		labPercentage = sc.nextDouble();
		
		if (labPercentage+examPercentage>100){
			System.out.println("The percentages must add up to 100. Terminating program.");
			return;
		}
		
		
		finalmark=(examMarks*examPercentage + labPercentage*labSub)/(100);
		System.out.println("Final exam mark is: "+finalmark);
		
	}
	
	
}