package week3.day1;

public class SmartPhone extends AndroidPhone{

	
	public void takeVideo() {
		System.out.println("From SmartPhone class");
	}
	
	
	public static void main(String[] args) {
		SmartPhone sm=new SmartPhone();
		sm.takeVideo();
	}
	
	
}
