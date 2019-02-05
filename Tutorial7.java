import java.util.Scanner;

public class Tutorial7 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Output the prompt
        System.out.println("Enter an floating point value: ");

        // Wait for the user to enter a lsomethung
       double value = input.nextDouble();

        // Tell them what they entered
        System.out.println("You entered: " + value);
    }
}
