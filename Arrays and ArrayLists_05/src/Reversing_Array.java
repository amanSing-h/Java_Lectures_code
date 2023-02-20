import java.util.Arrays;

public class Reversing_Array {
        public static void main(String[] args) {
            int[] arr = {1,3,23,9,18};
            //swap(arr, 1,3); // 3 and 9 will be swapped

            reverse(arr);

            System.out.println(Arrays.toString(arr));
        }

        static void reverse(int[] arr){
            // we will use the technique of the swap here
            /*
            1,3,23,9,18 => then 1 will be swapped from 18
            and then 3 will be swapped from 9
            and so on
             */
            // this method is known as two pointers method

            int start = 0;
            int end = arr.length-1;

            while (start<end){
                // swap
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        static void swap(int[] arr, int index1, int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
