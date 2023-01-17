public class Primitives {
    public static void main(String[] args) {
        int roll = 54;

        // String is not a primitive datatype
        // Primitives means that can't be break even further
        String name = "Aman";
                 /* Now can i break this Name Aman even further ?
               So the answer is yes we can break this name into Characters or  letters
              like 'A', 'm', 'a', 'n'

              We can't break character datatype further

              Means the last datatype which can not be broken into any other
              data type is known as primitve e.g., int, char

              String starts with Double quotes and char Start with Single quote
              */
        char letter = 'I';
        // char letter_1 ="k";  this one will give an error

        float marks = 98.67f; // in this we have to add a 'f' at the last
       /* we are adding the 'f' at last because all the decimal values belongs to
            double , so we add f for the float and only reason of using these
             is one is storing larger values and other stores smaller values

             same for L(long)*/
        double largeDeicmalNumbers = 48674865.4874;

        long largeInteger = 29843943989548578L;
        // here we need to add L in the last

        boolean check = true;

        // we know that integer is a primitive datatype so
        // we  can creare a wrapper class for integers
        Integer rno = 64;// it is for adding more functionalites


    }
}
