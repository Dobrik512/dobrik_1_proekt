package ex2_static;

public class Calculator {
    public static void main(String[] args) {
        Operation operation = new Operation();
        System.out.println(operation.sum(45, 23));          // 68
        System.out.println(Operation.subtract(45, 23));     // 22
        System.out.println(Operation.multiply(4, 23));      // 92
    }
}

class Operation {

     int sum(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }
}
