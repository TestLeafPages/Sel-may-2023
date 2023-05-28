package week1.day2;

public class Maths {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int c, int d) {
		return c - d;
	}

	public int div(int e, int f) {
		return e / f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths cal=new Maths();
		int add = cal.add(10, 5);
		System.out.println(add);	
		int sub=20;
		System.out.println(cal.sub(sub,2));
		System.out.println(cal.div(add, 3));		
		
		

	}

}
