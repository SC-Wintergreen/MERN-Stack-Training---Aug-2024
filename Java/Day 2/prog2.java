import java.util.Scanner;

public class prog2 {

    public static void main(String[] args) {

        // Scanner Class-
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert A Number");
        int a = sc.nextInt();

        System.out.println("Your Input is " + a);

        System.out.println("Enter A Decimal Number");
        float b = sc.nextFloat();
        System.out.println("Your Input is " + b);

        System.out.println("Enter A Short Number");
        short c = sc.nextShort();
        System.out.println("Your Input is " + c);

        System.out.println("Enter A Double Value");
        double d = sc.nextDouble();
        System.out.println("Your Input is " + d);

        // When input has a single word
        System.out.println("Enter A Long Value");
        long e = sc.nextLong();
        System.out.println("Your Input is " + e);

        // When input has multiple words
        System.out.println("Enter A Name");
        String name = sc.nextLine();
        System.out.println("Your Input " + name);

        // Character

        System.out.println("Enter A Character");
        char f = sc.nextLine().charAt(0);
        System.out.println("The Input Is " + f);

    }

}
