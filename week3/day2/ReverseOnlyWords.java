package week3.day2;

public class ReverseOnlyWords {

	public static void main(String[] args) {
	
		String s="Testleaf Learning";
		String[] split = s.split(" ");
		//faeltseT gninraeL
		//T ->0
		//stl-->1
		//af L-->2
		//3
		System.out.println(split.length);		
		//System.out.println(split[1]);
		for(int i=0;i<split.length;i++) {
			//split[i] -->tocharArray
			//for(to iterate into charater with stating index length)
			//print the character 
			System.out.println(split[i]);
		}
		

	}

}
