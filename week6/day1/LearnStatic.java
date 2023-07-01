package week5.day1;

public class LearnStatic {

	public void m1() {
		System.out.println("normal method");
	}
	
	public static void m2() {
		System.out.println("Static method");
	}
	
	
	public static void main(String[] args) {
		
		LearnStatic obj=new LearnStatic();
		obj.m1();
		m2();
	}

}
