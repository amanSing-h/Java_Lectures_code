import java.util.Arrays;
public class Arrays_passing_in_Function {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(nums); // it will print something else
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){ // here this arr is pointing towards the same object nums
        arr[0] = 99; // 3 changed to 99
        // here original value will be changed because strings are mutable in java

    }
}
