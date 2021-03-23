/*
 * This is the class that will create the goldfinch object
 * This is one of the two classes that is a specific animal and will have paramters that are used to help define it
 * @Author Dylan Diedrich
 * @Version 1.0
 * @Since 22 March 2021
 */
public class Goldfinch extends Animal implements Walkable, Flyable{

private double wingSpan;

//This is the default constructor
	public Goldfinch()
	{
		super(0, new Location(0,0));
		this.wingSpan=0;
	}

//This is the preferred constructor
	public Goldfinch(int simID, Location location,double wingSpan) throws InvalidWingspanException {
		super(simID, location);
		setWingSpan(wingSpan);
	}

//this is the getter method for wing span
//@return wingSpan
	public double getWingSpan() {
		return wingSpan;
}
/*this is the setter method for wing span
*@param wingSpan
*this method is also able to throw an invalid wingspan exception
*/
	public void setWingSpan(double wingSpan) throws InvalidWingspanException {
		if(wingSpan>=5 && wingSpan<=11)
			this.wingSpan=wingSpan;
		else
			throw new InvalidWingspanException("Error! Invalid WingSpan!");
	}
	
	public void walk(String direction) {
		if (direction.equalsIgnoreCase("N")) {
			int y = location.getCoordinates()[1]+1;
			int x = location.getCoordinates()[0];
		}
		else if (direction.equalsIgnoreCase("E")) {
			int y = location.getCoordinates()[1];
			int x = location.getCoordinates()[0]+1;
		}
		else if (direction.equalsIgnoreCase("S")) {
			int y = location.getCoordinates()[1]-1;
			int x = location.getCoordinates()[0];
		}
		else if (direction.equalsIgnoreCase("W")) {
			int y = location.getCoordinates()[1];
			int x = location.getCoordinates()[0]-1;
		}
	}
	
	public void fly(Location l) {
		location = location;
	}

	@Override
	public void walk(int direction) {
		// TODO Auto-generated method stub
		
	}
		
}//end class