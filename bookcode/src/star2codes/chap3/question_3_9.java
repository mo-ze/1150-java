package star2codes.chap3;
import java.util.Scanner;
public class question_3_9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         *  An ISBN-10 (International Standard Book Number) consists of 10 digits:
         *    The last digit, d10, is a checksum, which is calculated from the other
         *    nine digits using the following formula:
         * 		#(d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9)%11
         * 	If the checksum is 10, the last digit is denoted as X
         * according to the ISBN-10 convention.
         * Write a program that prompts the user to enter the first 9 digits
         * and displays the 10-digit ISBN (including leading zeros).
         * Your program should read the input as an integer.
         * you can only use loops
         */
        /*
         * expected outcome
         * Enter the first 9 digits of an ISBN as integer: 013601267
         * The ISBN-10 number is 0136012671
         */
        try {
            Scanner s=new Scanner(System.in);
            System.out.print("enter first nine digits ");
            String x=s.nextLine();
            s.close();



            int m = 0;
            for(int i=0; i<x.length();i++) {

                m+=m;
                m= Integer.valueOf(x.substring(i,i+1))*(i);


            }
            m=m%11;
            String n=x+(""+m);
            System.out.println("the checksum is "+m);
            System.out.println(n);


        }catch (Exception e) {
            System.out.println("invalid user input");
        }

        /*
         * (d1 *1
         * +d2 *2
         * +d3 *3
         * +d4 *4
         * +d5 *5
         * +d6 *6
         * +d7 *7
         * +d8 *8
         * +d9 *9)
         * %11
         */
//



    }

}
