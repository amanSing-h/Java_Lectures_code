import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
//        if (fruit.equals("mango")){
//            System.out.println("King of fruit");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }
// if break is not provided then all the below execution will be done till break
    }
}
