public class If_Else {

    /*
    Syntax for if statement L :
    if (boolean expression T or F){
    body
    }else {
    //do this
    }

     */

    public static void main(String[] args) {

        // 1st way
        int salary = 18000;
        if (salary > 20000){
            System.out.println(salary + 2000);
        } else {
            System.out.println(salary+1000);
        }
        // 2nd way
        int salary1 = 1000;
        if (salary1 > 20000){
            salary1 = salary1 + 1000;
        } else{
            salary1 = salary1 + 500;
        }
        System.out.println(salary1);

        // multiple if else statement
        if (salary1> 10000){ // salary1 = 1500
            salary1+= 2000; //salary1 = salary1 + 2000
        }else  if ( salary1 > 20000){
            salary1+=4000;
        }else{
            salary1+=1000;
        }
        System.out.println(salary1);


    }}
