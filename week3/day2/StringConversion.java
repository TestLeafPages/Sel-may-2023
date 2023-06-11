package week3.day2;

public class StringConversion {

	public static void main(String[] args) {
		
		String price="Product Price 1234";
		String replace2 = price.replace("d", "$");
		System.out.println(replace2);
		String replace = price.replaceAll("[^0-9]", "");
		System.out.println(replace);
		
		String letters = price.replaceAll("[^a-zA-z]", "");
		
		System.out.println(letters);
		
		String concat = replace.concat("5");
		System.out.println(concat);
		
		System.out.println(concat+6);
		
		
		//Converting String to integer
		int parseInt = Integer.parseInt(concat);
		System.out.println(parseInt+5);
		
		
		boolean contains = price.contains("duct");
       System.out.println(contains);
       //retreive the characters from the given index
       String substring = price.substring(2,5);//example for overloading
       System.out.println(substring);
       
       String lowerCase = price.toLowerCase();
       System.out.println(lowerCase);
       
       String upperCase = lowerCase.toUpperCase();
       System.out.println(upperCase);
	}

}
