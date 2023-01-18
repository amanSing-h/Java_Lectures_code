import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employeeId = input.nextInt();
        String department = input.next();

//        switch (employeeId){
//            case 1:
//                System.out.println("Aman");
//                break;
//            case 2:
//                System.out.println("Pravesh");
//                break; // will take both input but print only one in both above cases
//            case 3:
//                System.out.println("Employee 3");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No Department Elected");
//
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmployeeID");
//        }
        // enhanced switch
        switch (employeeId) {
            case 1 -> System.out.println("Aman");
            case 2 -> System.out.println("Pravesh");
            // will take both input(2nd anything) but print only one in both above cases
            case 3 -> {
                System.out.println("Employee 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Elected");
                }
            }
            default -> System.out.println("Enter correct EmployeeID");
        }
    }
}
