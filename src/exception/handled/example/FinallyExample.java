package exception.handled.example;

public class FinallyExample {

    public static void main(String[] args) {

        int  a = 10;
        int b = 10;
        int res = 0;

        try {
            System.out.println("inside try block before division operation occurs");
            res = a / b;
            System.out.println("inside try block after division operation occurs");
        } catch (ArithmeticException e) {
            System.out.println("Exception Occured : " + e.getMessage() + " --- " + e.getClass());
        }
        finally {
            System.out.println("a is : " + a);
            System.out.println("b is : " + b);
            System.out.println("res is : " + res);
        }

    }
}
