package Methods;

public class Calculator {
    public static void sum(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Sum: " + result); 
    }

    public static void sub(int num1, int num2){
        int result = num1 - num2;
        System.out.println("Subtraction: " + result);
    }

    public static void mult(int num1, int num2){
        int result = num1 * num2;
        System.out.println("Multiplication: " + result);
    }

    public static void div(int num1, int num2){
        int result = num1 / num2;
        System.out.println("Division: " + result);
    }
    public static void main(String[] args){
        sum(2,2);
        sub(5,2);
        mult(4,4);
        div(10,2);
    }
}
