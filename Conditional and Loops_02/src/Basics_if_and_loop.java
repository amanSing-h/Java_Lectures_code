public class Basics_if_and_loop {
    public static void main(String[] args) {
        if (true) {   // here we are explicitly giving the value as true
            System.out.println("Hello World");
        }
        int  a = 10;
        if ( a == 10){   // giving the condition
            System.out.println("Hello");
        }

        int count = 1;
        while (count != 5){
            System.out.println(count);
            count++;
            //  System.out.println(count);
            // put a debug pointer and then check step by step
        }
        // for loop
        for (int count_ = 1; count_ != 5; count_++) {
            System.out.println(count_);
        }

        // NOW   when we will use while loop and when we use for loop
        /*
        when we don't know how many times the loop is going to run use the while loop
         and when we know how many times the loop is going to run use the for loop
         */

    }
}
