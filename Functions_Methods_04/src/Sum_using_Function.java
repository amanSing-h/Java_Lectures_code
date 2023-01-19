import java.util.Scanner;

public class Sum_using_Function {
    public static void main(String[] args) {
        // anything we want to use in static that also has to be static

        // return type -> void -> don't return anything just display whatever given in function

        sum(); // calling the function
        sum();

    }
    /* 1st
    access modifier(discuss in oop) return_type name() {
        //body
        return statement;
    }
     */
     /* 2nd
     return_type name() {
        //body
        return statement;
    }
     */
    static void  sum() {  // this one should be static because we wil be accessing this from static(psvm)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }

}

// main function is the 1st function which is going to be run
// then it will ask to run the sum() method and we can call it as many times we want

