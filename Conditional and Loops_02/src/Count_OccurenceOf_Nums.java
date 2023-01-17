
// counting the occurence of an integer in a number
public class Count_OccurenceOf_Nums {
    public static void main(String[] args) {
        int n = 455365;

        int count = 0;
        while(n>0){
            int remainder = n%10;  // last digit
            if(remainder == 5){
                count++;
            }
            n = n/10;     //removing last digit
        }
        System.out.println(count);
    }
}
