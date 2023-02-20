import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(4);
        // here we have given capacity = 4 but it will take as  many as we input
        // does not depend on initial capacity
        /*
        working of this one is like :
        1. size is fixed internally
        2. say arraylist fills by some amount
        3. it will create a new arraylist of say, double the size
        4. old elements are copied in new one
        5. old one is deleted

        [1,2,3] => [1,2,3,4,5,...,...]
         */

        // adding
//        list.add(67);
//        list.add(34);
//        list.add(67);
//        list.add(84);
//        list.add(76);
//
//        System.out.println(list); // This internally calls its own toString
//
//        System.out.println(list.contains(655));
//        // contains check that element is available in the list or not
//        // then gives boolean output as true or false
//
//        list.set(0,1);
//        System.out.println(list);
//        // 0th index will be changed or updated to 1
//
//        list.remove(2);
//        System.out.println(list);
//        // this will remove element of index 2

        //  taking input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 5 values");
        for( int i = 0; i < 5; i++){
            list.add(input.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i)); // pass the index here,
            // list[index] -> this will not work here
        }
        System.out.println(list);

    }
}
