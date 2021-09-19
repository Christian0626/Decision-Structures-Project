import java.util.Scanner;

public class SwitchDescisions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the unhelpful menu!");
        System.out.println("Enter any number between 1 and 5");
        int storedInput = input.nextInt();






        switch(storedInput)
        {
            case 1:
                System.out.println("Do you need help?");
                break;
            case 2:
                System.out.println("We thought you didnt need help?");
                break;
            case 3:
                System.out.println("This menu is not supposed to be helpul!");
                break;
            case 4:
                System.out.println("Are we supposed to help you?");
                break;
            case 5:
                System.out.println("This menu is the greatest help ever!");
                break;
            default:
                System.out.println("You did not choose any of the options above!");
        }


    }


}
