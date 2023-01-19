public class Passing_values {
    public static void main(String[] args) {
        String bro = "Pravesh";
        greet(bro);
    }
/*
 here internally naam value doesn't care about which variable name(bro) we are giving and
 passing in function, it is replaced by naam automatically means Pravesh is assigned to naam variable

 in java there is no pass by reference,
 java is having pass by value only

 means here reference varibles (naam and name) are copy of the same object = Pravesh
 both are pointing towards same object
 */
    static void greet(String naam) {
        System.out.println(naam);
    }
    // SCOPING - we can access a variable in their scope only
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
    for primitives : int, short, char, byte......-> just passing the values

    for non-primitives ( objects and stuff): -> passing value of reference variable
     */
}
