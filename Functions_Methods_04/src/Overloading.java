import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Arrays;

public class Overloading {
    // function overloading ??
    /*
    Let's we are having 2 functions with the same name
     */
    public static void main(String[] args) {
        fun(1);
        // fun("Aman"); now after commenting this first will run only

        // here  the question arises that how is it determining which function to call
        // This is known as function overloading


        /*
        means here two things we need to consider in order to have the same function name
        1. either the number of arguments should be different
        2. or the type of arguments should be different

        we can have this one -> fun(int a)
                                                 fun( int a, int b)

 but we can't have this one -> fun(int a)
                                                   fun(int b)


  so now let's see how it is happening -
  so this is happening when the program is complied means at compile time
  this is going to decide which one to run

  function overloading decides at compile time which function to run

  function overriding happens at run time
         */

        System.out.println(sum(1,2)); // 1st
        System.out.println(sum(1,2,3));// 2nd

        demo(1,2,3,4);
        demo("Aman","Singh");
        // demo(); it cannot be empty in case of overloading, we must have give some parameters

    }

    static void fun(int a){
        System.out.println("first");
        System.out.println(a);
    }
    static void fun (String b){
        System.out.println("second");
        System.out.println(b);
    }

    static int sum(int x, int y){
        System.out.print("1st");
        return x+y;
    }
    static int sum(int x, int y, int z){
        System.out.print("2nd");
        return x+y+z;
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

}
