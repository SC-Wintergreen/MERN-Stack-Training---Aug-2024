import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert fist number");
        int num1 = sc.nextInt();
        System.out.println("insert second number");
        int num2 = sc.nextInt();

        System.out.println("Enter Operator");
        System.out.println("For Addition : +");
        System.out.println("For Substraction : -");
        System.out.println("For Multiplication : *");
        System.out.println("For Division : /");
        System.out.println("For Modulation : %");
        System.out.println("For Exponentiation : ^");

        char op = sc.nextLine().charAt(0);

        switch (op) {

            case '+':
                System.out.println("The Result is " + (num1 + num2));
                break;
            case '-':
                System.out.println("The Result is " + (num1 - num2));
                break;
            case '*':
                System.out.println("The Result is " + (num1 * num2));
                break;
            case '/':
                System.out.println("The Result is " + (num1 / num2));
                break;
            case '%':
                System.out.println("The Result is " + (num1 % num2));
                break;
            case '^':
                System.out.println("The Result is " + Math.pow(num1, num2));
                break;

            default:
                System.out.println("Invalid Input");
        }

    }
}
