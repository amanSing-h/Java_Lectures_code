import java.util.ArrayList;
public class ArrayLists_Basic {
/*
Arrays are of fixed size or we have to give the size of the array
but
what if we don't know how much size we need then here comes Array Lists
*/
public static void main(String[] args) {


    // syntax -> first import ArrayList;
    ArrayList<Integer> list = new ArrayList<>(); // we can also write the datatype
    // in the RHS but it is not mandatory like -> new ArrayList<Integer>();

    // Array list is slower than the standard Array

    /*
    in Array list we cannot pass primitives, we have to pass wrapper classes
     like we cannot do like this -> ArrayList<int> -> it will give error
     */

    ArrayList<Integer> list1 = new ArrayList<>();
    // RHS datatype is not mandatory to mention
    ArrayList<Integer> list2 = new ArrayList<>(10);
    // here we can pass the default size also

    ArrayList list3 = new ArrayList();
    // This will also work but this is not a good practice
    // This will take the default value


}
}
