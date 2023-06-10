package week3.day1;

public class StudentDetails extends LearnMethodOverloading{

	public void studentdetails(String name, int id) {
		
	//	System.out.println("Department Info :"+name +":" +id);
	}
	
	
	
	public static void main(String[] args) {
		
		
		StudentDetails obj=new StudentDetails();
		obj.studentdetails(934034220l, "Chennai");
		obj.studentdetails("Silambarasan", 20);//from child class
		
	
		
	}
	
	
	
	
	
}
