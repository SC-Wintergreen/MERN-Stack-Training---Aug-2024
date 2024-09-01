import java.util.Scanner;

public class switchCase2 {

    public static void main(String[] args) {

        // New Syntax

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Roll Number");
        int rollNumber = sc.nextInt();

        switch (rollNumber) {
            case 1, 4, 6:
                System.out.println("Group A");
                break;

            case 2, 5:
                System.out.println("Group B");
                break;

            case 7, 8:
                System.out.println("Group C");
                break;

            case 3, 9, 10:
                System.out.println("Group D");
                break;

            default:
                System.out.println("Group Not Availble. Please Go To Hell!");

        }

    }

}
