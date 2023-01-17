import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World ~!");

        Scanner input = new Scanner(System.in);
        System.out.println(input.next());  // here next or first word will be taken only
        System.out.println(input.nextLine()); // here the whole line will be taken
    }
}
