import java.util.Scanner;

public class SwitchDescisions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the unhelpful menu!");
        System.out.println("Enter any number between 1 and 5");
        int storedInput = input.nextInt();

        //This is an enhanced switch statement that works the same as a regular switch statement!
        switch (storedInput) {
            case 1 -> System.out.println("Do you need help?");
            case 2 -> System.out.println("We thought you didnt need help?");
            case 3 -> System.out.println("This menu is not supposed to be helpul!");
            case 4 -> System.out.println("Are we supposed to help you?");
            case 5 -> System.out.println("This menu is the greatest help ever!");
            default -> System.out.println("You did not choose any of the options above!");
        }
    }
}
