package week1.day2;

public class LearnArrays {

	public static void main(String[] args) {

		//int num=75,98,100;
		
		//store the marks 
		//can be int -->5 sub marks
		//can be string -->sub names
		//Declare an array
		
		//datatype[] variable={values};
		
		int[] marks= {70,90,100,59,77};	//element -->takes position from 0	-->index
		//fixed in size
		
	//	System.out.println(marks[5]);-->ArrayIndexOutOfBoundsException
		//Arrays->class -->predefined ->actions 
		//Count of elements in the array-length-->property of the array
		int length = marks.length;
		
		System.out.println(length);
		//to get the value from the array -->length as n-1		
		System.out.println(marks[0]);
		
		for (int i = 0; i < length; i++) {
			//0 to 4
			System.out.println(marks[i]);
			}		
		
		System.out.println("*******************");
		
		for(int i=length-1;i>=0;i--) {
			System.out.println(marks[i]);
			//marks[4] -->77
			//marks[3]-->100
		}
		//4 3 2 1 0  
		
		
		
	}

}
