package week1.day2;

public class Samplearray {

	public static void main(String[] args) {

		// how to use nested forloop

		String[] week = { "Week1", "Week2" };
		String[] day = { "Mon", "Tue", "Wed", "Thu", "Fri" };

		// Week1
		// Mon
		// Tue
		// Week2
		// Mon

		for (int i = 0; i < week.length; i++) {// outer loop
			System.out.println(week[i]);
			for (int j = 0; j < day.length; j++) {// innerloop
				System.out.println(day[j]);
			}
			System.out.println("***********");
		}

	}

}
