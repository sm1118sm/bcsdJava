import java.util.Scanner;

public class Main{
    int add(int a, int b){
        return a + b;
    }

    int subtract(int a, int b){
        return a-b;
    }

    int multiply(int a, int b){
        return a*b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Main k = new Main();

        System.out.println(k.add(3,4));
        System.out.println(k.subtract(5,4));
        System.out.println(k.multiply(2,6));
        System.out.println(k.divide(8,4));
    }
}