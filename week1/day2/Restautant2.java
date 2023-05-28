package week1.day2;

public class Restautant2 {	

	public static void main(String[] args) {
		
		Restaurant tab=new Restaurant();
		int bill = tab.billPayment(1000);
		System.out.println(bill);
		tab.windowShopping();
		boolean orderMore = tab.orderMore();//ctrl +2l
		System.out.println(orderMore);
		
		int billPayment = tab.billPayment(1000);
		
		//Class Maths
		// 3 Methods
		//add, sub,div
		//call the all the methods in mainmethod
		
		
	}

}
