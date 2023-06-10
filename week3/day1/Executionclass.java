package week3.day1;

public class Executionclass {

	public static void main(String[] args) {
		
		Car maruthi=new Car();
		maruthi.noOfSeats();
		maruthi.noOfWheels();
		maruthi.applyGear();
		maruthi.soundHorn();
		
		
		
		Auto au=new Auto();
		au.fuelType();
		au.applyGear();
		au.fuelType();
		System.out.println(au.wippers);
		
		
		/*
		 * Vehicle v=new Vehicle(); v.applyGear(); v.soundHorn();
		 */
		
		
		
		BMW bmw=new BMW();
		bmw.applyGear();
		bmw.noOfSeats();
		bmw.soundHorn();
		bmw.noOfWheels();
		bmw.openRoof();

	}

}
