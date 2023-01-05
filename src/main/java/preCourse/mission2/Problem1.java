package preCourse.mission2;

public class Problem1 {
    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass();
        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(basicClass.getTen(), basicClass.getTwo()));
        System.out.println(calculator.minus(basicClass.getTen(), basicClass.getTwo()));
        System.out.println(calculator.multiply(basicClass.getTen(), basicClass.getTwo()));
        System.out.println(calculator.divide(basicClass.getTen(), basicClass.getTwo()));
    }
}

class BasicClass {
    private int ten = 10;
    private int two = 2;

    public int getTen() {
        return ten;
    }

    public int getTwo() {
        return two;
    }
}

class Calculator {
    int plus(int a, int b) {
        return a + b;
    }

    int minus(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}
