import java.util.Arrays;

public class Change_Value {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 45,6};
        change(arr); // here this refrence varible itself is passed via call by value
        // means the values that is being passed that refers to the object
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 99; // here we are modifying, not creating the object that's why
    }// here value will be changed to nums and arr both because both are pointing towards the same array
    // and also strings are immutable we cannot modify a string->go to Passing_Values and Swapping_nums
}
