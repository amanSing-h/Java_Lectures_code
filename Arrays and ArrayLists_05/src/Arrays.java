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
        int[] arr = new int[5];  // create an array of size 5
        (compile time ::
        int[] -> datatype
        arr -> reference variable)
        (runtime :: dynamic memory allocation-> memory allocated at runtime
        new int[5] -> creating the object in heap memory)

        continuous memory allocation

        Array or all the objects are in heap memory
         and heap objects may  not be continuous ( in java) depends on JVM

         Index of an array which starts form zero

         arr = [3, 8, 19, 12, 7, 28, 33
         arr[0] = 3
         arr[1] = 1

         arr[3] = 99 then 12 changed to 99


         new keyword: It is used to create an object
         if we are directly creating and assigning values to arrays then java will be
         doing these new operations internally

              */
        System.out.println(ros[1]); // as we have assigned nothing to the array then
        // by default it will be zero for integer and null for string

        String[] arr = new String[4];
        System.out.println(arr[0]); // by default null

        /*
        null is a special literal
        we can cast it to any particular reference type ( can't do in primitives)
        but we can not create and assign it as anything of null type

        all reference variable point to null

        arr[0] -> null //arr[0] reference variable for an object or element

         */
        /*
        primitives are stored in stack memory only but all the other objects
        like string type, array type, hashmap, etc are stored in heap memory
         */
        

    }
}
