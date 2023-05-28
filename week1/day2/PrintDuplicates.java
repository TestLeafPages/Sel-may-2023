package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] num= {2,5,7,6,8,7,7,2,5};
        
   //2-->all the value
   //5-->all other values
     
   //
   
   for(int i=0;i<num.length;i++) {
	   for(int j=i+1;j<num.length;j++) {
		   if(num[i]==num[j]) {
			   System.out.println(num[i]);
			   break;
			   		   }
	   }
   }
   
   
	/*
	 * //way2 Arrays.sort(num); for(int i=0;i<num.length-1;i++) {
	 * if(num[i]==num[i+1]) { System.out.println(num[i]); }
	 * 
	 * }
	 */
   
   
   
   
   
	/*
	 * for(int i=0;i<num.length;i++) {
	 * 
	 * for(int j=i+1;j<num.length;j++) { if(num[i]==num[j]) {
	 * System.out.println(num[i]); } }
	 * 
	 * }
	 */}
	
}
