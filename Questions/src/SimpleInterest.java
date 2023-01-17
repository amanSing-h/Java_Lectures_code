
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principle = ");
        float principle = input.nextFloat();
        System.out.print("Time in years = ");
        float time = input.nextFloat();
        System.out.print("Rate = ");
        float rate = input.nextFloat();

        float simpleInterest = (principle *time*rate)/100l;

        System.out.println("Simple Interest = " +simpleInterest);

    }
}
