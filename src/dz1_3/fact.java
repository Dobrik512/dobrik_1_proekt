package dz1_3;

import java.util.Enumeration;
import java.util.Scanner;

public class fact {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, для которого нужно вычислить факториал:");
        int num = scanner.nextInt();
        fact.calculateFactorial(num);
        }
    static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа "+n+"="+result);
        //System.out.println(result);
        return result;
    }

}



