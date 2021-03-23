/*
 * This is a class to allow the project to throw invalid simID exceptions
 * @Author Dylan Diedrich
 * @Version 1.0
 * @Since 22 March 2021
 */
public class InvalidSimIDException extends RuntimeException {
    String message;
    InvalidSimIDException(String str) {
        message = str;
    }
    public String toString() {
        return ("InvalidSimIDException Occurred :" + message);
    }
}
