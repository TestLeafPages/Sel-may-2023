package base;

public class LearnConstructor {

	int x;
	
	public LearnConstructor() {
		System.out.println("I m from constructor");
	}
	
	public LearnConstructor(int x) {
		this();//constructor chaining
		//gloabl =local
		this.x=x;
		
		System.out.println("I m from parametrized constructor" +this.x);
	}
	
	
	public static void m1() {
		System.out.println("From static");
	}
	
	public static void main(String[] args) {	
		m1();
		LearnConstructor pc = new LearnConstructor(5);
	}

}
//Hirerachy of execution will be
//static //constructor//normal method

//carries the same as class name 
//it doesnot have any return type