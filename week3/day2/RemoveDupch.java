package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupch {

	public static void main(String[] args) {
		String s="hello";
		char[] charArray = s.toCharArray();
	//	h,e,l,l,o
		Set<Character> ch=new LinkedHashSet<Character>();
		Set<Character> duch=new LinkedHashSet<Character>();
		
		for(Character c:charArray) {			
			if(!ch.add(c)) {
				duch.add(c);
			}
		}
		System.out.println(ch);
		System.out.println(duch);
	}

}
