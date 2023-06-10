package week3.day1;

public class LearnMethodOverloading {
	
	/*
	 * public void add(int a ,int b) { System.out.println(a+b); }
	 * 
	 * 
	 * public void add(float a, float b) {
	 * 
	 * }
	 */
	
	
	public void studentdetails(String name, int id) {
		System.out.println(name +" "+id);
	}
	
	public void studentdetails(long phno,String City) {
		System.out.println(phno +" "+City);

	}	
	
   public void studentdetails(String state,String name, int id) {
		System.out.println(state +" "+name +" " +id);

	}
   
   public void studentdetails(String name, int id,String state) {
		System.out.println(name+" "+ id+" "+state);
	}

	public static void main(String[] args) {
		
		LearnMethodOverloading stu=new LearnMethodOverloading();
		stu.studentdetails(4550204582l, "Chennai");
		stu.studentdetails(89494330201l, "Madurai");
		stu.studentdetails("Steffi", 10);
		stu.studentdetails("Bhuvineshwari", 20, "TamilNadu");
		stu.studentdetails("Kerala", 30, "Nasrin");
		
	}
   
   
   

}
