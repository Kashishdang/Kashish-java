import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("****Calculator****");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulas");
        System.out.println();
        System.out.println("Enter your choice");

        Scanner scanner=new Scanner(System.in);
        int choice= scanner.nextInt();

        float number1=0;
        float number2=0;

        switch(choice){
            case 1:
                System.out.println("choose your first number");
                number1= scanner.nextInt();
                System.out.println("choose your second number");
                number2= scanner.nextInt();
               float sum =number1 + number2;
                System.out.println("sum of two number " +sum);


                break;
            case 2:
                System.out.println("choose your first number");
                number1= scanner.nextInt();
                System.out.println("choose your second number");
                number2= scanner.nextInt();
                float sub=number1-number2;
                System.out.println("sub of two number "+sub);

                break;
            case 3:
                System.out.println("choose your first number");
                number1= scanner.nextInt();
                System.out.println("choose your second number");
                number2= scanner.nextInt();
                float mult=number1*number2;
                System.out.println("mult of two number "  +mult);
                break;

            case 4:
                System.out.println("choose your first number");
                number1= scanner.nextInt();
                System.out.println("choose your second number");
                number2= scanner.nextInt();
                float div=number1/number2;
                System.out.println("Division of two number "  +div);

                break;
            case 5:
                System.out.println("choose your first number");
                number1= scanner.nextInt();
                System.out.println("choose your second number");
                number2= scanner.nextInt();
                float mod=number1%number2;
                System.out.println("Remainder of two number "  +mod);
                break;






        }
    }



}
