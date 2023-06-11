package week3.day2;

public class StringMethods {

	public static void main(String[] args) {
		String cName="Testleaf ";
		
		//to get the count of characters in the string
		int length = cName.length();
		System.out.println(length);
		
		//index starts with zero
		char charAt = cName.charAt(8);		
		System.out.println(charAt);
		
		
		//to convert my string into character
		char[] charArray = cName.toCharArray();
		//to print the array directly
		//Arrays.toString(charArray)
		
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		
		for(Character c:charArray) {
			System.out.println(c);
		}
		
		//to reverse
	//	conver to charArray
	//take the length of array as the sttart and dec
		//print the character
		
		

	}

}
