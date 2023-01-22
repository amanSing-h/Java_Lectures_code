

public class Armstrong_No {
    /*
    Print all the three digit armstrong number

    a = 153
    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

     */
    public static void main(String[] args) {

        System.out.println(isArmstrong(153));

        // for all three digit numbers
        for(int i = 100; i < 1000; i++){
            if (isArmstrong(i))
                System.out.print(i + " ");
        }

    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int remainder = n % 10;
            n = n / 10;
            sum = sum + remainder * remainder * remainder;
        }

        // we can replace below loop with this - return sum == original

        if (sum == original) {
            return true;
        }
        return false;


    }
}
