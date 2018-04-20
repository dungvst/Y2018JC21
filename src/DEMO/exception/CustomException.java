package DEMO.exception;

public class CustomException {
    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("Invalid");
        else
            System.out.println("Valid");
    }

    public static void main(String args[]) {
        try{
            validate(13);
        }catch(Exception m){System.out.println("Exception: "+m);}
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}