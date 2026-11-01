package exception.unhandled.example;
public class Demo {
    public static void main(String[] args) {

        int  a = 1;
        int b = 0;
        int res = 0;

        res = a / b;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        System.out.println("res is : " + res);
    }
}