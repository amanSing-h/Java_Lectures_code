import java.util.Scanner;

public class arg_parameter_in_Sum {
    public static void main(String[] args) {
        // calling
        int ans = sum1(21,4); // here we have to give the values or parameters
        // we have to pass these values in the order of declaration like 1st a then b
        System.out.println(ans);

    }
    /*
    what if we don't want to add scanner again and again or
    we want to pass the value when we are calling the function.
    Pass the vlaue of numbers when we are calling the method in the main()
    we do that by adding parameters
    # arguments
     */
    static  int sum1(int a , int b){
        int sum1 = a + b;
        return sum1;
    }

    static void  sum() {

        Scanner input = new Scanner(System.in);

        // here we are having two parameters num1 and num2

        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }
}
