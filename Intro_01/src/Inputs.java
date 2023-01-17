

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some input ");
        int rollno = input.nextInt();
        System.out.println("Your roll no. is " + rollno);

        int a = 10;
        // here 10 is known as literal
        // a is known as identifier ( name of fxn, variable , packages,etc,etc)

        // int a = 10,000,00 // this will give an error
        int q = 10_000_000; // here in this underscores will be ignored
        System.out.println(q);

        String name = input.next(); // it willl print the next or first word only
        String ss = input.nextLine(); // it will print the next whole line

        float marks = input.nextFloat();


    }
}
// we can use debugger to see the line by line implementation