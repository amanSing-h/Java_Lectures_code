import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
//        switch (day){
//            case 1 -> {      // this is also valid
//                System.out.println("Monday");
//            }
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please enter valid Day");
//        }
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please enter valid Day");
//        }
//        if (day == 1) {
//            System.out.println("Monday");
//        } else if (day == 2) {
//            System.out.println("Tuesday");
//        } else if (day == 3) {
//            System.out.println("Wednesday");
//        } else if (day == 4) {
//            System.out.println("Thursday");
//        } else if (day == 5) {
//            System.out.println("Friday");
//        } else if (day == 6) {
//            System.out.println("Saturday");
//        } else if (day == 7) {
//            System.out.println("Sunday");
//        } else {
//            System.out.println("Please enter valid Day");
//        }
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Please enter valid Day");
//                break;
//        }
//        switch (day) {
//            case 1:
//
//            case 2:
//
//            case 3:
//
//            case 4:
//
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Please enter valid Day");
//                break;
//        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Please enter valid Day");
        }
    }
}
