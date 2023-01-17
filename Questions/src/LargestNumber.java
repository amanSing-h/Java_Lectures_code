import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if ( num1 < num2){
            System.out.println(num2 + " is greater than " + num1);
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than "+ num2);
        }
        else {
            System.out.println(num1 + " is equal to "+ num2);
        }

    }
}

