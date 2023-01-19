public class Shadowing {
    /*
    Shadowing in java is a practice of using two variable with same names within the scope that overlaps
     */
    static int x = 10; // it is accessible in the whole scope of shadowing class
    // and anything we want to use in static that should be static
    public static void main(String[] args) {
        System.out.println(x); // 10
        int x =40;
        System.out.println(x); // 40 // this is the class variable at line 5 will be shadowed by this
        fun();                            // 10
    }
    /*
    basically when we add another variable with same name in the scope that overlaps->
    the higher level scope or the variable with the higher level scope is hidden means higher one will
    be shadowed( at line 10)

    lower level is over ridding the upper level
         */
    static void fun(){
        System.out.println(x); //  here 10 will be there because 40 is outside of this scope

        int a; // declaration
       // System.out.println(a); // error-> intialise first then use
        // MEANS scope will begin when the value is initialised
        a =60; // initiallisation
        System.out.println(a);

    }

}
