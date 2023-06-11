package week3.day2;

public class LearnString {

	public static void main(String[] args) {
	
		//String-->Sequence of characters
		//Dec string in literal way
		//Memory allocation
		String str="Testleaf"; //special memory -->string pool
		String s="Testleaf";
		
		
		String name=new String("TestLeaf"); //-->Heap Memory
		//== will always compares the String memory location
		if(s==name) {
			System.out.println("Same Location");
		}else {
			System.out.println("Differnet location");
		}
		
		
		//compare the values of the String
		
		if(s.equals(name)) {
			System.out.println("Values are same");
		}else {
			System.out.println("Values are diff");
		}
		
		
		if(s.equalsIgnoreCase(name)) {
			System.out.println("Same values");
		}else {
			System.out.println("diff Values");
		}
		
		
		
		

	}

}
