import java.util.Scanner;

public class Enhanced_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
//        if (fruit.equals("mango")){
//            System.out.println("King of fruit");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }
// key your pointer on switch ide automatically suggest to go for enhanced switch
        // break is not required over here
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
// if break is not provided then all the below execution will be done till break
    }
}
