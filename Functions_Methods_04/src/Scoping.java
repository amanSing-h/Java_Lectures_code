import java.util.Enumeration;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //System.out.println(num); // we  can't access this variable here, it is out of scope
        // only accessible in random method or function
    }
    static void random(){
        //System.out.println(a); if we do this then it will show an error
        // because this is not in this scope of random function it is outside of this
        //this variable will be accessible in the main() only because declared and initiallised in that scope only
        int num = 67;
    }
   //  SCOPING - we can access a variable in their scope only
    // means in the same class or function in which they are defined
    // we can define a variable with the same name they will work according to
    // their scope. e.g.
    /*
    classs1{
    int a, int b}
    classs2 {
    int a, int b}

    these both classes have variables with same name but these both will be
    accessible in their respective scope only, we can't access outside their scope or outside their
    respective class
     */

    /*
    these scope are also same for the arguments also
     */

    static void random1(int marks){
        System.out.println( marks);// this one is also accessible in this scope only
    }

    /*
    for primitives : int, short, char, byte......-> just passing the values

    for non-primitives ( objects and stuff): -> passing value of reference variable
     */
}
