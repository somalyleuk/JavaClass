package HomeWork;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("Welcome to DIN home stay");
        System.out.println("========================");

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Number of room (30$/room) : ");
        int numberOfRooms = scanner.nextInt();

        int costPerRoom = 30;
        int totalPayment = numberOfRooms * costPerRoom;

        System.out.println("=================================");
        System.out.println("TOTAL payment of " + numberOfRooms + " rooms = " + totalPayment + "$");
        System.out.println("Booking phone number: " + phoneNumber);

        scanner.close();
    }
}
