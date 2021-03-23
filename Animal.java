/*
 * This class is the class that defines 
 * @Author Dylan Diedrich
 * @Version 1.0
 * @Since 22 March 2021
 */
public abstract class Animal {
    private int simID;
    protected Location location;
    private boolean full;
    private boolean rested;
    
//This is the default constructor
    public Animal(){
        this.simID = 0;
        int[] temp ={0,0};
        this.location = new Location(temp);
        this.full = false;
        this.rested = true;
    }
//This is the preferred constructor for the class 
    public Animal(int simID, Location location) {
        this.simID = simID;
        this.location = location;
        full = false;
        rested = true;
    }
 //Getter for simID
 //@return simID
    public int getSimID() {
        return simID;
    }//end getter

    //setter for simID
    //@param simID
    public void setSimID(int simID) {
         try  {
           if( simID <= 0)
           {
               throw new InvalidSimIDException("ID is less than or equal to zero!");
           } else {
                this.simID = simID;
           }
        } catch (InvalidSimIDException e) {
           System.out.println(e); 
        }

    }//end setter

    //getter for location
    //@return location
    public Location getLocation() {
        return this.location;
    }//end getter

    //setter for location
    //@param location
    public void setLocation(Location location) {
        this.location = location;
    }//end setter

    //getter for isFull method
    //@return full
    public boolean getIsFull() {
        return full;
    }

    //setter for is full method
    //@param full
    public void setIsFull(boolean full) {
        this.full = full;
    }

    //getter for isResting method
    //@return rested
    public boolean getIsResting() {
        return rested;
    }

    //setter for isResting method
    //@param rested
    public void setIsResting(boolean rested) {
        this.rested = rested;
    }

    /*
     * constructor that generates a random number to determine if the animal object is full or not
     */
    public boolean eat() {
        double random = Math.random();

        if (random < 0.5) {
            this.full = false;
        } else {
            this.full = true;
        }

        return this.full;
    }

    /*
     * constructor that generates a random number to determine if the animal object is tested or not
     */
    public boolean sleep() {
        double random = Math.random();

        if (random < 0.5) {
            this.rested = false;
        } else {
            this.rested = true;
        }

        return this.rested;
    }
}//end class