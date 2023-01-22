import java.util.Arrays;

public class VarArgs { // variable length arguments
    public static void main(String[] args) {
        /*
        when we create a method that takes a variable length of arguments
        that is known as variable length arguments(VarArgs)

        like when we do not know how many inputs we are going to give
        e.g.,
        static void fun(int...v){    // here v is variable name we can take anything
                                                 // internally it is taking it as an array or collection of integer as int is there
        }
  */
        fun(4,5,6,4,3,6);
        fun1("aman","singh");
        fun1("Aman Singh");
        fun1(); // empty array
        multiple(2,3,"aman");

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun1(String ...a ){
        System.out.println(Arrays.toString(a));
    }
    /*
    Now what if we want mixed argument as our input like keyword, string and integer all at a time
     */
    static void multiple(int a, int b, String ...r){ // these values must be in order
                                                                            // and variable length variable must  be at last in the list
        System.out.println(a+" "+b);
        System.out.println(a+""+b);
        System.out.println(a+b);
        System.out.println(Arrays.toString(r));

    }



}
