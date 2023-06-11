package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
			
		//To create a list
		List<String> mentors=new ArrayList<String>();
		//arrayList-->abstractList-->List
		System.out.println(mentors);
		
		mentors.add("Aravind");
		mentors.add("Princila");
		mentors.add("subraja");
		mentors.add("Raghu");
		
		System.out.println(mentors);
		
		//add values of one list to other list
//		List<String> newMentors=new ArrayList<String>();
//		newMentors.addAll(mentors);
		List<String> newMentors=new ArrayList<String>(mentors);
		System.out.println(newMentors);
		
		//to retreive the specific value from the list -->using index
		String name = newMentors.get(2);		
		System.out.println(name); 
		
		//to return the count of elements in the list
		int size = newMentors.size();
		System.out.println(size);
		
		//insert any values inside the list in a particular position
		newMentors.set(3, "Vidya");
		System.out.println(newMentors);
		
		newMentors.add("Raghu");
		System.out.println(newMentors);
		System.out.println(newMentors.size());
		
		
		//to reterive all the values as string 
		for(int i=0;i<newMentors.size();i++) {
			System.out.println(newMentors.get(i));
		}
		
		
		//to remove the data from the particular index
		String remove = newMentors.remove(4);
		System.out.println(remove);
		System.out.println(newMentors);
		
		//to remove all the data in compared with other list
		newMentors.removeAll(mentors);
		System.out.println(newMentors);
		
		//to empty /delete all the datas in the list
		newMentors.clear();
		System.out.println(newMentors);
		
		//to check any values present inside a list
		boolean contains = mentors.contains("Vidya");
		System.out.println(contains);
		
		mentors.add(3,"Arshad");
		System.out.println(mentors);
		
	//	Object[] array = mentors.toArray();
		
		Collections.sort(mentors);
		System.out.println(mentors);
		
		Collections.reverse(mentors);
		System.out.println(mentors);
		
		//to get the min
		String max = Collections.min(mentors);
		System.out.println(max);
	}

}
