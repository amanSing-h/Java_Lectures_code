import java.util.Scanner;

public class Swapping_nums {
    public static void main(String[] args) {
        int a= 10;
        int b = 20;
        //Scanner input = new Scanner(System.in);
//        a = input.nextInt();
//        b = input.nextInt();
        // 1st
//        temp =b;
//        b = a;
//        a = temp;
        /* 2nd
        temp =a;
        a = b;
        b = temp;
       */
//        a = a+b;
//        b = a - b;
//        a = a-b;
//
//        System.out.println(a + " "+b);
        swap(a, b);
        System.out.println(a + " "+b);  // this will print the original values of a and b
        // this will not print the swapped numbers because we are just calling
        // the function not printing it

        String name = "Pravesh";
        changeName(name);
        System.out.println(name); // this will print Pravesh
        // here again we are calling the function but not printing it
    }
    static void changeName(String naam){  // here naam and name are pointing towards same object(Pravesh)
        // for better understanding go to passing_values
        naam = "Aman"; // not changing,  creating a new object
        // means this one is only be accessible in this scope only or in this method only not outside it
        // to understand this line first go to pass by value and read

    }

        static void swap(int a, int b){

            int temp =a;
            a = b;
            b = temp;
            // here values are swapped in this scope but not in main()
        }


}
