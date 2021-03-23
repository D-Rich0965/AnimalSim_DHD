/*
 * This is a class to test each class within the project
 * @Author Dylan Diedrich
 * @Version 1.0
 * @Since 22 March 2021
 */
public class Application {

	//Main method used to test each class and print the output
	public static void main(String[] args) {
		
		System.out.println("-------------");
		System.out.println("Location Test");
		System.out.println("-------------");
		
	Location location0 = new Location();
		System.out.println("\nPosition of empty constructor object: [" + location0.getCoordinates()[0] + "," + location0.getCoordinates()[1] + "]");
		
	Location location1 = new Location(15,25);
		System.out.println("Position of new constructor object is: [" + location1.getCoordinates()[0] + "," +location1.getCoordinates()[1] + "]");
			location1.update(45, 72);
			System.out.println("Position of updated constructor object is: [" + location1.getCoordinates()[0] + "," +location1.getCoordinates()[1] + "]");
		
	/*
	 * Demonstrating invalid coordinate exception
	 * Location location1 = new location(-9,3)
	 * System.out.println("Position of new constructor object is: [" + location1.getCoordinates()[0] + "," +location1.getCoordinates()[1] + "]");
	 */
			System.out.println("\n-------------");
			System.out.println("Animal Test");
			System.out.println("-------------");
			
		Goldfinch gf = new Goldfinch();
			System.out.println("Goldfinch ID = " +gf.getSimID());
			System.out.println("Goldfinch wingspan = " + gf.getWingSpan());
			System.out.println("Goldfinch location = " + gf.getLocation().getCoordinates()[0]);
			System.out.println("Goldfinch is full = " + gf.getIsFull());
			System.out.println("Goldfinch is resting = " + gf.getIsResting());
			
		System.out.println("\n-------------");
		System.out.println("Goldfinch Test");
		System.out.println("-------------");
	
			Goldfinch gf1 = new Goldfinch(33, new Location (13,67), 5.1);
			System.out.println("Goldfinch ID = " +gf1.getSimID());
			System.out.println("Goldfinch wingspan = " + gf1.getWingSpan());
			System.out.println("Goldfinch location = " + gf1.getLocation().getCoordinates()[0]);
			System.out.println("Goldfinch is full = " + gf1.getIsFull());
			System.out.println("Goldfinch is resting = " + gf1.getIsResting());
			
				gf1.setSimID(53);
				gf1.setLocation(new Location(27,29));
				gf1.setWingSpan(8.6);
				gf1.setIsFull(true);
				gf1.setIsResting(false);
				
				System.out.println("\nNew Goldfinch values are: ");
				System.out.println("New goldfinch ID = " + gf1.getSimID());
				System.out.println("New goldfinch location = [" + gf1.getLocation().getCoordinates()[0] + "," + gf1.getLocation().getCoordinates()[1] + "]");
				System.out.println("New goldfinch wingspan = " + gf1.getWingSpan());
				System.out.println("Is new goldfinch full? = " + gf1.getIsFull());
				System.out.println("Is new goldfinch resting? = " + gf1.getIsResting());
				
				/*
				 * Invalid simID
				 * Goldfinch gf1 = new Goldfinch(-7, newLocation(540,345), 9.3);
				 * System.out.println("InvalidIDException: ")
				 * System.out.println(gf1.getSimID());
				 */
				
				/*
				 * Invalid wingspan exception
				 * Goldfinch gf1 = new Goldfinch(7, newLocation(540,345), 4.3);
				 * System.out.println("InvalidWingSpanException: ")
				 * System.out.println(gf1.getWingSpan());
				 */
				
				System.out.println("\n-------------");
				System.out.println("BrownBear Test");
				System.out.println("-------------");
				
					BrownBear br = new BrownBear();
						System.out.println("BrownBear ID = " +br.getSimID());
						System.out.println("BrownBear SubSpecies = " + br.getSubSpecies());
						System.out.println("BrownBear Location = " + br.getLocation().getCoordinates()[0]);
						System.out.println("BrownBear is full = " + br.isFull());
						System.out.println("BrownBear is resting = " + br.isRested());
					
					BrownBear br1 = new BrownBear("Grizzly", 356, new Location(450, 789), false, true);
						System.out.println("New BrownBear ID = " +br1.getSimID());
						System.out.println("New BrownBear SubSpecies = " + br1.getSubSpecies());
						System.out.println("New BrownBear Location = " + br1.getLocation().getCoordinates()[0]);
						System.out.println("New BrownBear is full = " + br1.isFull());
						System.out.println("New BrownBear is resting = " + br1.isRested());
						
				br1.setSimID(632);
				br1.setLocation(new Location(273,299));
				br1.setSubSpecies("Alaskan");
				br1.setFull(true);
				br1.setRested(false);
				
			System.out.println("\nNew BrownBear values are: ");
			System.out.println("New Brownbear ID = " + br1.getSimID());
			System.out.println("New Browbear location = [" + br1.getLocation().getCoordinates()[0] + "," + gf1.getLocation().getCoordinates()[1] + "]");
			System.out.println("New BrownBear Subspecies = " + br1.getSubSpecies());				
			System.out.println("Is new BrownBear full? = " + br1.isFull());
			System.out.println("Is new Brownbear resting? = " + br1.isRested());
			
			
			/*
			 * Invalid subSpecies
			 * BrownBear br1 = new BrownBear (499, newLocation (86,395), "Panda");
			 * System.out.println(br2.getSubSpecies);
			 */
				
			br1.walk("N");
			System.out.println("\nBrownBear location after walking North: [" + br1.getLocation().getCoordinates()[0] + "," + br1.getLocation().getCoordinates()[1] + "]");
			br1.walk("E");
			System.out.println("\nBrownBear location after walking East: [" + br1.getLocation().getCoordinates()[0] + "," + br1.getLocation().getCoordinates()[1] + "]");
			br1.walk("S");
			System.out.println("\nBrownBear location after walking South: [" + br1.getLocation().getCoordinates()[0] + "," + br1.getLocation().getCoordinates()[1] + "]");
			br1.walk("W");
			System.out.println("\nBrownBear location after walking West: [" + br1.getLocation().getCoordinates()[0] + "," + br1.getLocation().getCoordinates()[1] + "]");
	}
}
