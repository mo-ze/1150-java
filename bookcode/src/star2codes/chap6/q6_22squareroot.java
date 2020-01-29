package star2codes.chap6;

import java.util.Scanner;

public class q6_22squareroot {

    /*// 
    **6.22 (Math: approximate the square root)
    * There are several techniques for implement- ing the sqrt method in the Math class.
    * One such technique is known as the Babylonian method.
    *  It approximates the square root of a number, n,
    * by repeatedly performing a calculation
    * using the following formula:
        nextGuess = (lastGuess + n / lastGuess) / 2
    When nextGuess and lastGuess are almost identical,
     nextGuess is the approximated square root.
     The initial guess can be any positive value (e.g., 1).
     This value will be the starting value for lastGuess.
     If the difference between nextGuess and lastGuess
     is less than a very small number, such as 0.0001,
     you can claim that nextGuess is the approximated square root of n.
      If not, nextGuess becomes lastGuess and the approximation process continues.
      * Implement the following method that returns the square root of n.
    public static double sqrt(long n)
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        System.out.println("type an  int");
//        int x =s.nextInt();
        System.out.println("type a double");
        double x =s.nextDouble();
//        System.out.println("type an  string");
//        String a=s.nextLine();
        s.close();
        
        System.out.println( "the square root of "+x+" is "+  sqrt(x));
    }









    public static double sqrt(double n){
        double lastguess=Math.random();

        double nextguess=0;

        int count=0;
        double result=0.0;
       double ReallyLowNumber= 0.000001;
        while (true){
            count++;
            nextguess = (lastguess + n / lastguess) / 2.0;




//            trick condition 0.0000001
            if(Math.abs(lastguess - nextguess) < ReallyLowNumber)
            {

                result=nextguess;
//              break the loop  if true
                break;
            }
//            trick activate the last guess to be new guess
            lastguess = nextguess;


        }

        return mymath.myround( result,3);
    }
}
