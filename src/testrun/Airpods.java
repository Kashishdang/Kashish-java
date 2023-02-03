package testrun;
import java.util.Scanner;
public class Airpods {
    public static void main(String[] args) {
        System.out.println("Multiplication");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int number1 = scanner.nextInt();

        System.out.println("enter your second number :");
        int number2 = scanner.nextInt();

        int sum = number1 * number2;
        System.out.println("Product of these will be  :"+ sum);
    }

}

