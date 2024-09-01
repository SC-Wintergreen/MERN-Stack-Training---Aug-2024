import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Day");
        String day = sc.next();

        // Switch Statement Syntax

        // Cascading Problem

        switch (day) {
            case "Monday":

                System.out.println("Today is Hilsha Day");
                break;

            case "Tuesday":

                System.out.println("Today is Chicken Day");
                break;

            case "Wednesday":
                System.out.println("Today is Mutton Day");
                break;

            case "Thursday":
                System.out.println("Today Is Prawn Day");
                break;

            case "Friday":
                System.out.println("Today Is Pomfret Day");
                break;

            case "Saturday":
                System.out.println("Today Is Turkey Day");
                break;

            case "Sunday":
                System.out.println("Today is Egg Day");
                break;

            default:
                System.out.println("Invalid Input!");
        }

    }

}
