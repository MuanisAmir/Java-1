

public class SolarParkTest {

	public static void main(String[] args) {
		// THIS CODE MUST NOT BE CHANGED IN ANY WAY!!!
		
		// The code below will be used to test the SolarPlant class
		// created by Environment Woman's lead developer for Lab 2.
		
		// THIS CODE MUST NOT BE CHANGED IN ANY WAY!!!
		
		// Use constructors to create two SolarParks
		SolarPark park1 = new SolarPark("Baltimore", 2.5);
		SolarPark park2 = new SolarPark("Chicago", 2.1);
		
		// Display the initial values of the SolarPlants
		System.out.printf("park1 is located in : %s%n", park1.getCity());
		System.out.printf("park1 has a peak power of : %.2f%n%n", park1.getPeakPower());
		System.out.printf("park2 is located in : %s%n", park2.getCity());
		System.out.printf("park2 has a peak power of : %.2f%n%n", park2.getPeakPower());
		
		
		// Update the objects
		park1.setCity("Columbia");
		park1.setPeakPower(3.2);
		park2.setPeakPower(1.5);
		
		//Display the updated values in the objects
		System.out.printf("park1 is located in : %s%n", park1.getCity());
		System.out.printf("park1 has a peak power of : %.2f%n%n", park1.getPeakPower());
		System.out.printf("park2 is located in : %s%n", park2.getCity());
		System.out.printf("park2 has a peak power of : %.2f%n%n", park2.getPeakPower());
				
	} // end of main

} // end of class
