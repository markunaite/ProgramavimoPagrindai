import java.util.Scanner;

/**
 * In this exercise we create a program that asks the user for a password. If the password is right, a secret
 * message is shown to the user.
 * Type the password: turnip
 * Wrong!
 * Type the password: beetroot
 * Wrong!
 * Type the password: carrot Right!
 * The secret is: jryy qbar!
 */

public class Uzd22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

            while (true) {
                System.out.println("Type the password");
                String command = reader.nextLine();
                System.out.println("Wrong");

            if (command.equals("Carrot")) {
                System.out.println("Right!");

                break;

            }
        }
        System.out.println("The secret is jryy qbar!");
            reader.close();
    }
}
