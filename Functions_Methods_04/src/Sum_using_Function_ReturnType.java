import java.util.Scanner;

public class Sum_using_Function_ReturnType {
    /*
    what if i want to get the value of sum not just print it
    so the return type will change
     */
    public static void main(String[] args) {

        // sum(); //calling // it will give the value whatever we returning in the function(->body)
         // sum is returning values that is going to be stored in reference variable ans
        int ans = sum(); // we can do like this too.
        System.out.println(ans); // printing the ans

    }
    // return the vlaue
    static int  sum(){   // here the return value will be integer
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        //System.out.println(sum); // here at place of this we use return the sum
        return sum; // as sum is of integer that's why our return type is int
        //  return basically means this function will be over here
        //System.out.println("This will  never execute it is unreachable");

        /*
        in any function or method wherever the return statement is hit it basically means
        okay your work is done just come out of  here

        meaning if we put anything after return statement that will be unreachable and give error
        e.g., System.out.print("Unreachable");
        if we add this line after return statement it will give error


         */

    }
}
