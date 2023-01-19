public class Scoping_01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
      //  int a = 25; // this will give error because it is already defined
      //  a =25; // we can modify
        System.out.println("a= "+a + " inside fxn but outside and above block");

        {
            // block scoping
           // int a = 30; // this will also give error because it is already defined in main() means outside the block
            // we can modify only
            //a =45; thiss will work
            a = 100; // reassign the original reference variable to some other value
            // we are not creating the new one , in order to create new one we need to reintiallised with diff name
            int c = 99;
            // values intiallised in the block will remain in the block
            System.out.println("a= "+a + " inside fxn and  block both");
        }
        int c = 50; // this can be done because it is outside the  block
        // System.out.println(c); this will give an error because it is outside of the block

        /*  means if a variable is initiallised in a block that will be accessible in that block only
        AND
        if  a variable is intiaallised in a function/method/class then it will be accessible in that class
        as well as the block defined in that class only not outside that class
        vice-versa is not true

         */
        System.out.println("a= "+a + " inside fxn but outside and below block");

        for(int i=0 ; i<4; i++){
            System.out.println(i);
            // int a = 39; // will give error already defined
            // a = 39; // this will update value of a  as 39
        }
        // System.out.println(i); will give error
        // here we cannot access this i outside the for loop scope


    }

}
