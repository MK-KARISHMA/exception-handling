package exception.handled.example;

public class ThrowExample {

    public static void main(String[] args) {

        try  {
            int a = 10;

            if (a == 20) {
                System.out.println("a is 20 hence exception is not thrown");
            } else {
                throw new RuntimeException("a is not 20 hence exception is thrown");
            }
        } catch (Exception e) {
            System.out.println(" Exception : " + e.getMessage() + " --- " + e.getClass());
        }
    }
}
