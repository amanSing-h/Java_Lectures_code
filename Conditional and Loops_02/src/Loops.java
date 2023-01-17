// package ConditionsAndLoops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // print numbers form 1 to 5
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
        // It is very much tedious task

        // LOOPS

        // 1. for loop
        /*
        for ( initialisation; condition; increment/decrement){
                   //body
                   }
         */

        // print numbers 1 to 5
//        for ( int num = 1; num <= 5; num++){ // num++ = num +=1 => num = num + 1
//            System.out.println(num);
//        }
//
//        int n = input.nextInt();
//        for (int num = 1; num < n; num++) {
//          //  System.out.print(num);
//            System.out.println("Hello world");
//
//        }

        // WHILE loop
        /*
            syntax :
                        while ( condition) {
                                // body;
                                }
         */
        int num = 1;
        while ( num<=5){
            //   System.out.println(num);
            num++;
        }


            /*
                  When to use while loop and when to use  for loop ?

                   We can use both these anytime we want, it is up to our preference
                   but usually we run a while loop when we don't know how many times
                   the loop gonna run and
                   we use for loop usually when we know the number of times the loop
                   gonna run.

                   e.g., :
                   if we have to print numbers from 1 to 10 then use for loop
                    and
                   if we have to print keep taking the input from the user till the user doesn't press x,
                   then in this case we use while loop
             */

        // DO WHILE loop
                /*
                   do  {
                   } while (condition);
                 */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <=5);

                    /*
                     do while loop will execute atleast once
                     means it will execute the body first and then it will check the condition
                     */
        int k = 1;
        do {
            System.out.println(k);
            n++;
        } while(k!=1);

        // here we can see the loop is executed one time then closed because condition is not satisfied.

                        /* means do this thing first after that check, if  condition is true or not .

                        so do while loop can be used where we want to run the loop atleset one time.

                         */

    }
}