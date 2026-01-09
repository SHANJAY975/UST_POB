package exception;

public class ExceptionHandlingDemo {

    static int getFactorial(int n) throws NegativeNumberException{

        if(n<0){
            throw new NegativeNumberException("Negative number not allowed");
        }
        int fact = 1;
        while (n>0){
            fact *= n;
            n--;
        }
        return fact;
    }
    public  static void main(String[] args){
        int n = -5;
        try {
            System.out.println(getFactorial(n));
        }
        catch (NegativeNumberException e){
            System.out.println(e);
        }

    }
}
