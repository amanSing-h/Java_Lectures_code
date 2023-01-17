import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  System.out.println(input.next().trim());  // it will return string
        // .trim will remove extra spaces from both the sides
        char ch = input.next().trim().charAt(0); // it will return  character at 0th index

        if( ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }



    }
}
