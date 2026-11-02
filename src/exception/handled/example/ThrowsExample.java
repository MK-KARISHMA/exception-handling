package exception.handled.example;

public class ThrowsExample {


    public static void demo() throws InterruptedException, IllegalAccessException{
        int a = 20;

        if(a == 10) {
            throw new ArithmeticException("a is 10 , it is unchecked exception");
        }

        if (a == 20) {
            throw new InterruptedException("a is 20 , it is checked exception");
        }
        if (a == 30) {
            throw new InterruptedException("a is 30 , it is unchecked exception");
        }
        if (a == 40) {
            throw new IllegalAccessException("a is 40 , it is checked exception");
        }

    }
    public static void main(String[] args) {

       try {
           ThrowsExample.demo();
       } catch (Exception e) {
           System.out.println(" Exception : " + e.getMessage() + " --- " + e.getClass());
       }

    }
}
