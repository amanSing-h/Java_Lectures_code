import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println(5+6);

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1+num2);

        float num3 = input.nextInt();
        float num4 = input.nextInt();
        System.out.println(num3+num4);
        float num5 = input.nextFloat();
        float num6 = input.nextFloat();
        System.out.println(num4+num5);
        // Here we are not getting error because of type conversion or casting


    }
}
