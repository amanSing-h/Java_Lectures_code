import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter 1st number");
        num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        num2 = input.nextInt();

        sum = num1 + num2;
        System.out.println(sum);

        System.out.println("Enter 1st number");
        num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        num2 = input.nextInt();

        sum = num1 + num2;
        System.out.println(sum);

        /* what if we  want to entire thing 10 times then
         then it is vey much tedious to copy paste again and again and change the things
         so we need to bundle this repeated code in some short of  format and use that format
         at many many places. so we can use functions and methods in java;
         methods and functions are same thing in java because everything in java is defined under class.

         for other than java : when we have any function in a class that is known as methods.
         */



    }
}
