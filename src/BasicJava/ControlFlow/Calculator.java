package BasicJava.ControlFlow;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        int result;
        char operator;

        System.out.print("Enter x = ");
        x = scanner.nextInt();

        System.out.print("Enter operator = ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter y = ");
        y = scanner.nextInt();


        switch (operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                result = 0;
                System.out.println("Invalid operator");
        }
        System.out.println("Your result is : " + result);
        System.out.println("End of program");

    }
}
