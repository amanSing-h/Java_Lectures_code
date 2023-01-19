import java.util.Scanner;

public class Returning_String {
    public static void main(String[] args) { // main is the first method that will run
        Scanner input = new Scanner(System.in);
        String naam = input.next();
        // try to keep the variable name different from argument or passed parameters
        // if we keep same it will not give error by keep it different, we will see the reason
        // for this further

        System.out.println(greet());
        String message = myGreet("Aman");
        System.out.println(message);

        System.out.println(myGreet(naam));
    }
    static String myGreet(String name) {
        String message = "Hello" + name;
        return message;
    }
    static String greet(){
        String greeting = "Hi, How are you ?";
        return greeting;
    }
}
