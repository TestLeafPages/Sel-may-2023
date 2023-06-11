package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
	
		Set<String> mentors =new HashSet<String>();
		
		mentors.add("Aravind");
		mentors.add("Aravind");
		mentors.add("Princila");
		mentors.add("Raghu");
		mentors.add("subraja");
		
		System.out.println(mentors);
		
        Set<String> mentors2 =new LinkedHashSet<String>();
		
		mentors2.add("Aravind");
		mentors2.add("Aravind");
		mentors2.add("Princila");
		mentors2.add("Raghu");
		mentors2.add("subraja");
		
		System.out.println(mentors2);
		
		 Set<String> mentors3 =new TreeSet<String>();
			
			mentors3.add("Aravind");
			mentors3.add("Vidya");
			mentors3.add("Princila");
			mentors3.add("Raghu");
			mentors3.add("subraja");
			
			System.out.println(mentors3);
			/*
			 * for(int i=0;i<mentors.size();i++) {
			 * 
			 * }
			 */
			
			//for(wrapperClass variable : element in the set)
			for (String m : mentors3) {
				System.out.println(m);
			}
			
			List<String> uniq=new ArrayList<String>(mentors3);
			System.out.println(uniq.get(3));
			
			

	}

}
