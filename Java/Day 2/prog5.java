import java.util.Scanner;

public class prog5 {

    // Legal Age To Have A License Is 18 - Write a program that inputs the age of
    // the user and check if he/she can get a license or not

    public static void main(String[] args) {

        // Input users age

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("User can get a license");
        else
            System.out.println("User cannot get a license");

    }

}
