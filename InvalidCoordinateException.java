/*
 * This is a class to allow the project to throw coordinate exceptions
 * @Author Dylan Diedrich
 * @Version 1.0
 * @Since 22 March 2021
 */
public class InvalidCoordinateException extends RuntimeException {

  public InvalidCoordinateException(){}

 
  public InvalidCoordinateException(String message) {
    super(message);
}
}