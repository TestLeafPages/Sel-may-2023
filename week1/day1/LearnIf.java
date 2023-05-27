package week1.day1;

public class LearnIf {

	public static void main(String[] args) {

		//check the given number is positive
		int number=0;
		
		if(number>0) 
		{//-5>0
			System.out.println("The given number "+number+" is positive");
		}
		else if(number<0)
		{
			System.out.println("The given number "+number + " is negative");
		}else {
			System.out.println("The given number "+number +" is neutral");
		}
		
		
		
	}

}
