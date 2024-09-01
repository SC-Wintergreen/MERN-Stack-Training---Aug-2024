import java.util.Scanner;

public class switchcase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number");
        int rollNumber = sc.nextInt();
        switch (rollNumber) {
            case 1:
            case 4:
            case 6:
                System.out.println("group A");
                break;
            case 2:
            case 5:
                System.out.println("group B");
                break;
            case 7:
            case 8:
                System.out.println("group C");
                   break;
            case 3:
            case 9:
            case 10:
                System.out.println("group D");
                break;

            default:
                System.out.println("Invalid");

        }
    }
}