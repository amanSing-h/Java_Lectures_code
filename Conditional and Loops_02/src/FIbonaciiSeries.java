import java.util.Scanner;

public class FIbonaciiSeries {

    // 0,1,1,2,3,5,8,13....
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int p = 0;  // p -> previous
        int c = 1;  // c -> current

        int count = 2;

        while(count <= n){
            int temp = c;
            c = c + p;
            p = temp;
            count++;

        }
        System.out.println(c);

    }
}
