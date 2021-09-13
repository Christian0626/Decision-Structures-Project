import java.util.Scanner;

/**
 *
 * @author cp219413
 */
public class DecisionStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String number;
        System.out.println("Welcome to the unhelpful menu!");
        System.out.println("Enter any number between 1 and 8 to get feedback");
        int parsedString;
        do
        {

            while(!input.hasNextInt())
            {
                System.out.println("That is not a number!");
                // Takes input from user IF the user tyes in a character or string it will go back through the loop!
                number = input.next();

            }

            number = input.nextLine();
            parsedString = Integer.parseInt(number);
            //Redeclared variable so that the scope of the do while loop can see the variable!
            if(parsedString == 1)
            {
                System.out.println("You asked for little to no help!");
            }
            else if(parsedString == 2)
            {
                System.out.println("wait!");
            }
            else if(parsedString == 3)
            {
                System.out.println("You dont need help do you?");
            }
            else if(parsedString == 4)
            {
                System.out.println("You obviously dont need help!");
            }
            else if(parsedString == 5)
            {
                System.out.println("Try again if you want help!");
            }







        } while(parsedString <= 0);


    }

}
