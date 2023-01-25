import java.util.Scanner;
import java.util.Arrays;

public class Input_and_Enhanced_for_loop {
    public static void main(String[] args) {
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 12;
        arr[2]  = 34;
        arr[3] = 75;
        arr[4] = 87;
        // internally-> [23, 12, 34, 75, 87]
        System.out.println(arr[3]);

        // Input using for loops
        Scanner input = new Scanner(System.in);
        // when we have the length of the array
//        for ( int i = 0; i < 5; i++){
//
//        }
        // when we do not have the length of array
//        for (int i = 0; i< arr.length; i++){
//            arr[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr)); // first import Arrays then do this
        /*
        when we give an array to this it converts it into string and print that string
        like here taking an integer and printing as a string
         */

//        // printing the array
//        for( int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//
//        // enhanced for loop
//        for(int num : arr){ // for every element in the array, print the element
//            System.out.println(num + " "); // here num represents element of array
//
//        }
//
//        System.out.println(arr[5]); // gives runtime error or exception index out of bound

        // arrays of objects
        String[] str = new String[4];
        for( int i = 0; i < str.length; i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "aman";
        System.out.println(Arrays.toString(str));



    }
}
