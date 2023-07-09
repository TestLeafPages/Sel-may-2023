package base;

public class LearnStatic {

	public static int x; //global variable/instance variable
	 
	
	public static void m1() {
		 x=10;
	}
	
	public static void main(String[] args) {
		
		LearnStatic obj=new LearnStatic();
		
		System.out.println(obj.x);
		obj.m1();
		
	}

}
