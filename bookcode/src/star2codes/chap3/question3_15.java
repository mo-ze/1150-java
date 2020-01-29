
package star2codes.chap3;
import java.util.Scanner;

public class question3_15 {


    public static void main(String[] args) {
        /*
         * (Game: lottery) Revise Listing 3.8, Lottery.java,to generate a lottery of a three- digit number.
         * The program prompts the user to enter a three-digit number
         * ,and determines whether the user wins according to the following rules:
         * 1. If the user input matches the lottery number in the exact order, the award is $10,000.
         * 2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
         * 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
         */

        int x=   (int) (Math.random()*899+100);
//		System.out.println("x: "+x);
//		bigger  than 99 and lower than 1000
        int x3=x%10;
        x=x/10;
        int x2=x%10;
        x=x/10;
        int x1=x%10;
        x=x1*100+x2*10+x3;
        System.out.println("x "+x);
//		System.out.println("x1: "+x1);
//		System.out.println("x2: "+x2);
//		System.out.println("x3: "+x3);
//		System.out.println("x: "+x);
        Scanner s =new Scanner(System.in);
        int y=s.nextInt();
        s.close();

        int y3=y%10;
        y=y/10;
        int y2=y%10;
        y=y/10;
        int y1=y%10;

        y=y1*100+y2*10+y3;



//		System.out.println("y1: "+y1);
//		System.out.println("y2: "+y2);
//		System.out.println("y3: "+y3);
//		System.out.println(" y:  "+y);

//		exact order match 10,000
//		all match 3000
        //one match 1000


        if (x==y) {
            System.out.println("all match the award is $10,000");

        }else if((y1==x1||
                y1==x2||
                y1==x3)	&&

                (y2==x1||
                        y2==x2||
                        y2==x3)	&&

                (y3==x1||
                        y3==x2||
                        y3==x3)	) {
            System.out.println(" all match the award is $3,000");

        }
        else if(	(y1==x1||
                y1==x ||
                y1==x3)
                ||
                (y2==x1||
                        y2==x2||
                        y2==x3	)
                ||
                (y3==x1||
                        y3==x2||
                        y3==x3)

        ){
            //
            System.out.println("one match the award is $1,000");

        }


        System.out.println("y "+y);
        System.out.println("x "+x);

    }








}

