import java.util.Scanner;


public class student {
    public static void main(String[] args) {
        System.out.println("Addition");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number :");
        float number1 = scanner.nextInt();

        System.out.println("enter your second number :");
        float number2 = scanner.nextInt();

        float sum = number1 + number2;
        System.out.println("sum is :"+ sum);
        }

    }
