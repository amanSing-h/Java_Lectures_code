
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        // when one type of data  assigned with another type of variable
        // automatic conversions will take place if the following conditions met :

        Scanner input = new Scanner(System.in);

        float num = input.nextFloat();
        System.out.println(num);
        // it will not give me error when we will input integer values also
        // means it automatically gets converted
        // so the question arises when this thing happens

        /* so the type should be compatible,
        destination type  should be greater than the  source type (float > int)
         */
        int num1 = input.nextInt();
        System.out.println(num1);
        /* here if we are giving float values as output then it will give an error
        it will not automatically get converted because (int < float)
         */

        // Now the question arises how do we convert  float to integer then here casting comes

        /* Now there are two type of casting :
        1.  Narrowing e.g. Narrow the float into the integer
        syntax :  int num = (int)(76.74f);
        2. Widening e.g.
         */
        int num2 = (int)(76.74f); // so here all the decimal values will be excluded only int is there

        // AUTOMATIC  type promotion in expressions\
        int a = 257;
        byte b = (byte) (a); // max value we can store in byte is 256

        System.out.println(b); // here we will get output as 1
        /*  even after casting we can't store a values larger than range
        so the result is the remainder of the 257 and the maximum values which
        means 257 % 256 =1
         */

        byte c = 40;
        byte d = 50;
        byte e = 100;

        int f = (c*d)/e;
        System.out.println(f);

        /*
        Here we can see the c*d is 2000 which is outside or exceeds the range of character
        (then how byte is able to store this value)( as we know that byte * byte = byte,
        then it must give sum different answer but why it is giving the correct answer ?)
        but still  it is giving the correct answer, why ?

        so  to handle this kind of problem java automatically is promoting each byte (or short or whatever we take)
        to integer(...) for evaluating this expression

        so this is called automatic type promotion in expression

        Now if we will do like this :
        byte b = 50;
        b = b*2;
        it will give error because it exceeds from the range of byte
        so here we have to do explicitly do the casting into int
         */


        int number = 'a'; // here a  is character and we are taking in integer
        // integer and assigning a character and it will not give an error
        System.out.println(number); // output = 97
        /*
        Here we are giving a character and it is printing a number. so let's see why is this happening
         It is happening because of automatic conversion or typecasting
         It is printing the ASCII value of ''a".

         Java follows Unicode values

         System.out.println("नमस्ते") //output = नमस्ते
      */

        // TYPE promotion Rules :
        /*
        1. all the byte, short and character values are promoted to integer
        2. if any one of the operands is long then the whole operation will be promoted to long,
        if  it is float then the whole operation will be promoted to float
        if it is double then the whole will be promoted to double

        System.out.println(3 * 0.5f); // output will be in float

       */
        System.out.println(3 * 0.5f);

        byte i = 42;
        char j = 'a';
        short k = 1024;
        int l = 50000;
        float m = 5.67f;
        double n = 0.1234;

        double result = (m *i)+(l/j)-(n*k);
        // float + int - double = double // maximum will be the output form
        // means if we are having multiple data types then all other will be converted
        // into the biggest one on the basis of range

        System.out.println((m *i) +" "+ (l/j)+" "+(n*k));

        System.out.println(result);







    }
}