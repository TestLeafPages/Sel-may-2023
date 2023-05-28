package week1.day2;

public class Restaurant {	
	
	public void windowShopping() {
			System.out.println("Scan through the pdts");	
		}
		
	//inputArg-->0 to n
	public String orderFood(String foodItem,String drinks) {	
		return foodItem +" "+ drinks;
	}
	
	
	public boolean orderMore() {
		return false;
	}
	
	
	public int billPayment(int billAmt) {		
		return billAmt;
	}
	
	
	public static void main(String[] args) {//entry point for the execution 
	//it will not return anything
		
		
		//To creating a reference-->object
		
		//ClassName obj=new ClassName();//constructor-->instantiate the object
		
		Restaurant table=new Restaurant();
		//to call the fun/method -->obj.methodName();
		System.out.println(table.orderFood("Dosa","LemonSoda")); 
		String foo = table.orderFood("Fried rice","Sprite");//ctrl +2L
		System.out.println(foo);
		
		
		System.out.println(table.billPayment(1000));
		
		
		
	}
	
	
	
	

	
	
}
