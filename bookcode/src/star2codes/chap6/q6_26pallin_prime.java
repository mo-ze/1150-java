package star2codes.chap6;

import java.util.Scanner;

public class q6_26pallin_prime {
/*
    (Palindromic prime) A palindromic prime is a prime number and also palindro- mic.
    For example, 131 is a prime and also a palindromic prime, as are 313 and 757.
    Write a program that displays the first 100 palindromic prime numbers.
        Display 10 numbers per line, separated by exactly one space, as follows:
 */

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);

    int a=s.nextInt();

    System.out.println(IsPallindromicPrime(a));

    }



    public static boolean IsPallindromicPrime(int x ) {

        return mymath.isPrime(x) && ispalindrome(x);
    }

    public static int reverse(int x){
        String y=Integer.toString(x);
        String rev="";
        int l=y.length();
//        for(i=l-1 to 0 with i--)
//        rev=+y[i]

        for(int i=l-1;i>=0;i--){
            rev=rev+ y.charAt(i);

        }
        return Integer.parseInt(rev);
    }
    public static boolean ispalindrome(int x) {
        int y=reverse(x);
        int z=reverse(y);
        String s= (y==z)?"palindrome":"not a pallindrome";

        return y==z;
    }
}

