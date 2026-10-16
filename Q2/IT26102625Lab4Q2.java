import java.util.Scanner;
public class IT26102625Lab4Q2{
	public static void main(String[]args){
	
	double exm , lsm , pex , plsm , fmr ;	
	Scanner input = new Scanner(System.in);
    
  	System.out.println("Please enter exam marks (out of 100)");
		exm = input.nextDouble();
	if(exm < 0 || exm > 100)
	{
		System.out.println("Invalid input for exam marks.Terminating program");		
	}	
	return ;
	
	System.out.println("Please enter lab submission marks (out of 100)");
		lsm = input.nextDouble();
	if(lsm < 0 || lsm > 100)
	{
		System.out.println("Invalid input for lab submission marks.Terminating program");		
	}	
	 return ;
	 
		
	System.out.println("Please enter the percentage given for the exam");
		pex = input.nextDouble();
	
	System.out.println("Please enter the percentage given for the lab submission ");
		plsm = input.nextDouble();
	

	
    if (pex + plsm != 100)
	{
		System.out.println("The percentages must add up to 100.Terminating program");		
	}	
		return ;
		
		
		fmr = (exm * pex /100) + (lsm * plsm/100);
		
		System.out.println("Final Exam mark is :" +fmr);
			
	}
}