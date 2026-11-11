import java.util.Scanner;

public class IT26102558Lab4Q2 {
	 public static void main(String[] args) {
		
		int examMarks, labMarks, labPrecentage, examPrecentage, finalMarks;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter examMarks(out of 100): ");
		examMarks=input.nextInt();
		
	    if (examMarks < 0 || examMarks > 100){
    
	        System.out.print("Invalid input for exam marks.Terminating program.");
            return;
	    }	
  	
        System.out.print("Please enter labMarks (out of 100): ");
        labMarks=input.nextInt();	
    
        if (labMarks < 0 || labMarks > 100){

            System.out.print("Invalid input for lab marks.Terminatingprogram.");
            return;	   
        }		
	
	    System.out.print("Please enter labPrecentage(out of 100): ");
        labPrecentage=input.nextInt();
		
        System.out.print("Please enter examPrecentage (out of 100): ");
	    examPrecentage=input.nextInt();
		
		if (labPrecentage + examPrecentage != 100){
			
			System.out.print("The precentage must add up to 100.Terminatingthe program");
			return;
		}
		
	    finalMarks = (examMarks * examPrecentage/100) + (labMarks * labPrecentage/100);
		
        System.out.println("Final marks is:" + finalMarks);
		
		
	 }
}