package dz1_3;
import java.util.Scanner;
public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        var mult=1;
        var digit=0;
        while (n>0)  {
            digit = n % 10;
            mult = mult * digit;
            n = n / 10;
        }
        System.out.println("Произведение цифр данного числа равно "+mult);
    }
}

