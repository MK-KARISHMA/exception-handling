package exception.handled.example;

public class GenericCatchException {

    public static void main(String[] args) {

        int a = 10, b = 0, res = 0;

        try {
            res = a / b;
            System.out.println("res = " + res);
            String msg1 = "Hi Hello";
            String msg2 = null;
            System.out.println("length of msg1 : " + msg1.length());
            System.out.println("length of msg2 : " + msg2.length());
        } catch (Exception e) {
            System.out.println(" Exception : " + e.getMessage() + " --- " + e.getClass());
        }
    }
}
