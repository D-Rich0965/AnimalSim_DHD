/*
 * This is the BrownBear class which will be the class that creates the variables and constructors and methods for the 
 * bear animal object
 * @Author Dylan Diedrich
 * @Version 1.0
 * @Since 22 March 2021
 */
public class BrownBear extends Animal implements Walkable, Swimmable {
  
    private String subSpecies;
    private int simID;
    private Location location;
    private boolean full;
    private boolean rested;

    //This is the default constructor used to set variables to their base state
    public BrownBear() {
        simID = 0;
        location = new Location();
        full = false;
        rested = true;
        subSpecies = "Alaskan";
    }

    //This is the preferred constructor 
    public BrownBear(String subSpecies, int simID, Location location, boolean full, boolean rested) throws InvalidSubspeciesException {
        try {
            this.subSpecies = subSpecies;
        } catch (Exception ex) {
            throw new InvalidSubspeciesException();
        }
        this.simID = simID;
        this.location = location;
        this.full = full;
        this.rested = rested;
    }

    //this is the getter method for SubSpecies
    //@return subSpecies
    public String getSubSpecies() {
        return subSpecies;
    }

    //this is the setter method for subSpecies
    //@param subSpecies
    public void setSubSpecies(String subSpecies) {
        this.subSpecies = subSpecies;
    }

    //this is the getter method for simID
    //@return simID
    public int getSimID() {
        return simID;
    }

    //this is the setter method for simID
    //@param simID
    public void setSimID(int simID) {
        this.simID = simID;
    }

    //this is the getter method for location
    //@return location
    public Location getLocation() {
        return location;
    }

    //this is the setter method for location
    //@param location
    public void setLocation(Location location) {
        this.location = location;
    }

    //This is the getter method for isFull
    //@return full
    public boolean isFull() {
        return full;
    }

    //this is the setter method for isFull
    //@param full
    public void setFull(boolean full) {
        this.full = full;
    }

    //this is the getter method for isRested
    //@return rested
    public boolean isRested() {
        return rested;
    }

    //this is the setter method for isRested
    //@param rested
    public void setRested(boolean rested) {
        this.rested = rested;
       }
  
    
    	public void walk(String direction) {
    		if (direction.equalsIgnoreCase("N")) {
    			int y = location.getCoordinates()[1]+3;
    			int x = location.getCoordinates()[0];
    		}
    		else if (direction.equalsIgnoreCase("E")) {
    			int y = location.getCoordinates()[1];
    			int x = location.getCoordinates()[0]+3;
    		}
    		else if (direction.equalsIgnoreCase("S")) {
    			int y = location.getCoordinates()[1]-3;
    			int x = location.getCoordinates()[0];
    		}
    		else if (direction.equalsIgnoreCase("W")) {
    			int y = location.getCoordinates()[1];
    			int x = location.getCoordinates()[0]-3;
    		}
    }
    
    
    	public void swim(String direction) {
    		if (direction.equalsIgnoreCase("N")) {
    			int y = location.getCoordinates()[1]+2;
    			int x = location.getCoordinates()[0];
    		}
    		else if (direction.equalsIgnoreCase("E")) {
    			int y = location.getCoordinates()[1];
    			int x = location.getCoordinates()[0]+2;
    		}
    		else if (direction.equalsIgnoreCase("S")) {
    			int y = location.getCoordinates()[1]-2;
    			int x = location.getCoordinates()[0];
    		}
    		else if (direction.equalsIgnoreCase("W")) {
    			int y = location.getCoordinates()[1];
    			int x = location.getCoordinates()[0]-2;
    		}
    }

}//end class