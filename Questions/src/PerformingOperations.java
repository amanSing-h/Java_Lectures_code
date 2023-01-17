import java.util.Scanner;

public class PerformingOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the operand : ");
        char operand = input.next() .charAt(0);
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        if ( operand =='+'){
            System.out.println(num1 + num2);
        }
        else if ( operand =='-'){
            System.out.println(num1 - num2);
        } else if (operand == '*' ) {
            System.out.println(num1 * num2);
        }
        else if (operand == '/') {
            System.out.println(num1/num2);
        }


    }
}
