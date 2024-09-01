import java.util.Scanner;

public class switchCase3 {

    public static void main(String[] args) {

        // Old Syntax

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Roll Number");
        int rollNumber = sc.nextInt();

        switch (rollNumber) {

            case 1:
            case 4:
            case 6:
                System.out.println("Group A");
                break;

            case 2:
            case 5:
                System.out.println("Group B");
                break;

            case 7:
            case 8:
                System.out.println("Group C");
                break;

            case 3:
            case 9:
            case 10:
                System.out.println("Group D");
                break;

            default:
                System.out.println("Group Not Avaialble. Please Go To Hell!");

        }

    }

}
