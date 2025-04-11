package BasicJava.InputOuput;

import java.util.Scanner;

public class Variable {
    String username; //install variable or object variable or non-static variable

   static final String role = "Student"; // static field or class variable //final is constant variable that not allow to assign value

    public static void main(String[] args) { // next into main everything that os declares inside ()  we call parameter

        Variable user = new Variable();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        user.username = scanner.nextLine();
        System.out.println(user.username); // access to instant variable via object
        System.out.println(Variable.role); // access to class variable
    }
}
