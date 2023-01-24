public class Arrays {
    public static void main(String[] args) {
        // Q. store a roll number
        int a = 19;

        // Q. store a person's name
        String name = "aman";

        // Q. store 3 roll numbers
        int rno1 = 23;
        int rno2 = 24;
        int rno3 = 35;

        // Q. Now store 500 roll numbers
        // so here creating variables and declaring again and again is very tedious
        // so here comes Arrays

        /*
        syntax : datatype[] variable_name = new datatype[size]

         */
        // store 5 roll numbers
        int[] rnos = new int[5];
        // or directly
        int[] rnos2 = {23, 12, 45, 32, 15};

        /*
        here datatype represents what is the type of data store inside the array
        all the type of  data in the array should be same
         means if array is type of int then all the data in the array should be int
         or if string then string or if boolean then boolean and so on.

         */
        int[] ros; // declaration of array, ros is getting defined in the stack
        ros = new int[5]; //initialisation  or creating the object is being created in the memory(heap)
        // here 5 is the size of the array

        /*
        int[] arr = new int[5];
        (compile time ::
        int[] -> datatype
        arr -> reference variable)
        (runtime :: dynamic memory allocation-> memory allocated at runtime
        new int[5] -> creating the object in heap memory)
         */
        

    }
}
