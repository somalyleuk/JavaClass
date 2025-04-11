package BasicJava.InputOuput;

import java.util.Scanner;

public class Input {
    String name; // global variable it is allowing to not assign value or instant variable
    public static void main(String[] args) {


        // =============== InPut and OutPut ===============
        System.out.print("Print without new line"); // print without new line
        System.out.println("Print with new line"); // print with new line
        System.out.printf("Print format - My name is %S, I'd %d", "somaly", 24);  // print format


        // =============== Print concatenated string ===============
        double salary = 1000;
        System.out.printf("%nMy salary is %.2f %n", salary);

        // =============== scanner ===============
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");

        String username = input.nextLine();
        System.out.print("Enter age: ");

        int age = input.nextInt();
        System.out.println("Username: " + username + ", Age : " + age);


        // =============== Variables ===============
        String name = "Somaly"; // local variable it is mush assign value
        String Name = "Somaly"; // Uppercase and  are different variable
        String $name = "Somaly"; //
        String my_name = "Somaly"; //
        String myName = "Somaly"; //
        System.out.println(name);
    }
}

//compile to byte code //
// javac filename.java

// interpret to machine code
// java filename
