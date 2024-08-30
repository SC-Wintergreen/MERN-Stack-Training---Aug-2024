import java.util.Scanner;

public class prog6 {

    public static void main(String[] args) {

        // Take an input of an integer. Check if it is even or odd

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

    }

}
