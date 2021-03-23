/*
 * This is a class to allow the project to throw invalid wingspan exceptions
 * @Author Dylan Diedrich
 * @Version 1.0
 * @Since 22 March 2021
 */
public class InvalidWingspanException extends RuntimeException{
	InvalidWingspanException(String message){
		super(message);
	}
}
