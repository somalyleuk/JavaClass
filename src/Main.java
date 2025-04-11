import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter a number (0 to exit): ");
            choice = scanner.nextInt();
        } while (choice != 0);
        System.out.println("You exited!");
 
    }
}