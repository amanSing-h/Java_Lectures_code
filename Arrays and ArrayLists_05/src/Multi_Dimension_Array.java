import java.util.Scanner;
import java.util.Arrays;

public class Multi_Dimension_Array {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
        // here three rows and three columns

        int[] -> 1D- Array
        int[][] -> 2D-Array
*/

//        int[][] arr = new int[3][];
        // here adding the number of rows is mandatory
        // but  adding the number of columns is not mandatory but we want then we can

        // entering elements directly
        int[][] arr2D = {
                {1, 2, 3}, // 0th index
                {4, 5, 6}, // 1st index
                {7, 8, 9} //2nd index -> arr2D[2] ->{7, 8 ,9}
        };
        /*
        arr = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        imagine this as an array of array

        imagine like each indexes have an individual array
        index 0 = [1, 2, 3] -> row 1
        index 1 = [4, 5, 6] -> row 2
        index 2 = [7, 8, 9] -> row 3

        Size of individual rows doesn't matter that's why it is not mandatory
        to give the number of columns like each individual array size can vary
        here 3 elements, it can vary also e.g.,
        {
                {1, 2, 3},
                {4, 5,},
                {6, 7, 8, 9}
        }; it can be like this too that's why number of columns is not mandatory

        This is how 2d arrays are stored.

        arr[1] = [4, 5, 6]
        arr[1][0] = 4

         */

        Scanner input =  new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length); // this will print 3 only -> no. of rows
        // Input
        for ( int row =0; row < arr.length; row++){
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++){ //arr[row] -> array at that particular row
                // arr[row] -> number of  column can vary for every row(that's why not mandatory)
                arr[row][col] = input.nextInt();

                // for every row we are taking input for all the columns

                }
        }
        // Output
//        for (int row = 0; row < arr.length; row++){
//            for (int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " "); // it will not print in matrix form
//            }
//        }

//        for (int row = 0; row < arr.length; row++){
//            for (int col = 0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(); // now it will print in matrix form
//        }

//        // Enhanced for loop
//        for (int[] ints : arr) {
//            for (int col = 0; col < ints.length; col++) {
//                System.out.print(ints[col] + " ");
//            }
//            System.out.println(); // now it will print in matrix form
//        }

//        for (int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row])); // it will print same in matrix form
//        }

        //Enhance for loop 2
        for (int[] a : arr){ // all the elements are of int datatype so int
            System.out.println(Arrays.toString(a));
        }

    }


}
