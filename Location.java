/*
 * This class is used to generate the location of each animal object also is able to throw an exception 
 * if coordinate entered is negative
 * @Author Dylan Diedrich
 * @Version 1.0
 * @Since 22 March 2021
 */
	public class Location {
		  private int xCoord;
		  private int yCoord;

		  //Default Constructor
		  public Location(int[] temp){
		    xCoord = 0;
		    yCoord = 0;
		  }

		  //Preferred constructor, is able to throw exception for values less than zero
		  public Location(int xCoord, int yCoord){
		    if (xCoord < 0 || yCoord < 0) {
		      throw new InvalidCoordinateException("Coordinate can't be less than zero");
		    }
		    this.xCoord = xCoord;
		    this.yCoord = yCoord;
		  }

		  public Location() {
		}

		//constructor used to update new coordinates also is able to throw exception
		  public void update(int x, int y){
		    if (x < 0 || y < 0) {
		      throw new InvalidCoordinateException("Coordinate can't be less than zero");
		    }
		    xCoord = x;
		    yCoord = y;
		  }

		  //getter for coordinates of location
		  //@return xCoord, yCoord
		  public int[] getCoordinates() {
		    return new int[] {xCoord, yCoord};
		  }
		}
