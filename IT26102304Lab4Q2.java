import java.util.Scanner;

public class IT26102304Lab4Q3{
	public static void main(String[] args){
		
		double e_marks,l_marks,e_perc,l_perc,finalmarks;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please Enter exam marks(out of 100):");
		e_marks=input.nextDouble();
		if(e_marks<0|| e_marks>100)
		{
			System.out.println("invalid input for exam marks,terminating program");
			return;
		}
		System.out.println("Please Enter lab submission marks(out of 100):");
		l_marks=input.nextDouble();
		if(l_marks<0|| l_marks>100)
		{
			System.out.println("invalid input for exam marks,terminating program");
			return;
		}
	    System.out.println("Please Enter the percentage given for the exam:");
		e_perc=input.nextDouble();
		System.out.println("Please Enter the percentage given for the lab submission:");
		l_perc=input.nextDouble();
		
		if (e_perc+l_perc!=100)
		{
			System.out.println("the percentage must  add up to 100, terminating program");
			return;
		}
		
		finalmarks=(e_marks*e_perc/100)+(l_marks*l_perc/100);
		
		System.out.println("final exam mark is :"+finalmarks);
		
	
		
	
		
	}
}