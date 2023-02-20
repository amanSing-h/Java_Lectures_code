public class Max_item {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2,4));

    }

    // let assume array is not empty
    // for array being null we need to define that separately
    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }

        int maxVal = arr[0]; // assume that max is on 0th index
        for ( int i = 0; i< arr.length; i++){
            if (  arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end){

        // for null or edge cases
        if (end < start){
            return -1;
        }
        if(arr == null){
            return -1;
        }

        int maxRange = arr[start]; // assume that max is on 0th index
        for ( int i = start; i<= end; i++){
            if (  arr[i] > maxRange){
                maxRange = arr[i];
            }
        }
        return maxRange;
    }
}
