import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Year For Leap Year Check");
        int year = sc.nextInt();

        // Check For Centurial Year
        if (year % 100 == 0) {

            // Check Leap YEar

            if (year % 400 == 0)
                System.out.println("THis is a leap year");

            else
                System.out.println("Not Leap Year");

        }
        // Non Centurial Year
        else {

            if (year % 4 == 0)
                System.out.println("This is a leap year");
            else
                System.out.println("Not A Leap Year");

        }

    }

}