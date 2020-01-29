import java.util.Arrays;
import java.util.Scanner;

public class q1 {
/*

    (Palindromic prime) A palindromic prime is a prime number and also palindromic.
    For example, 131 is a prime and also a palindromic prime, as are 313 and 757.
    Write a program that displays the first x palindromic prime numbers.

        Add another method named Emirps to that class that
        outputs all Emirps between 1 and N.
        Recall that Emirps are numbers that are not Palindromes
        but the reverse of the number is prime

 */
// TODO: 2019-06-29 documentation
    /*
    *
     * @purpose
     * that is the main method helping the class to run
     * @param
     * //String[] args
     * @return
     * ;
     **/
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();

        emirps(a);

        return;

    }

// TODO: 2019-06-29 documentation
    /*
    *
     * @purpose to produce emirps
//     * @param N as the greatest number
     * @return
     * nothing (this is a void method)
     **/
    public static void emirps(int N){
        int myarr[]=new int[countprimes(N)];
        int count=0;
        for (int i =1;i<=N-1;i++){
            if(!ispalindrome(i)&& isPrimeNumber(reverse(i))){
                myarr[count]=i;
                count++;
            }


        }
        System.out.print(Arrays.toString(myarr));
    }
    // TODO: 2019-06-29 documentation
    /*
    *
     * @purpose to count total number of emirps in from 1-x
//     * @param x the max num
     * @return count of  total number of emirps in from 1-x
     **/

    public static int countprimes(int x){
        int count=0;
        for (int i=0;i<x;i++){
            if(!ispalindrome(i)&& isPrimeNumber(reverse(i))){
                count++;

            }

        }
        System.out.println("total number of reverse primes and not palindrones "+count);

        return count;
    }

// TODO: 2019-06-29 documentation
    /*
    *
     * @purpose to find if x is PallindromicPrime
     * @param x
     * @return boolean true
     **/

    public static boolean IsPallindromicPrime(int x ) {
        if (isPrimeNumber(x)&&ispalindrome(x)){return true;
        }else{return false;}
    }

// TODO: 2019-06-29 documentation
    /**
     * @purpose to check if x isPrimeNumber
     * @param x
     * @return true or false
     **/
    public static boolean isPrimeNumber(int x) {
        if (x == 2 ) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }

        for (int i = 3; i < x/2; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

// TODO: 2019-06-29 documentation
    /**
     * @purpose to reverse x
     * @param x
     * @return reverse value as an int
     **/

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
    // TODO: 2019-06-29 documentation
    /**
     * @purpose to check if x is a pallindrone
     * @param x
     * @return true or false depending on purpose
     **/
    public static boolean ispalindrome(int x) {
        int y=reverse(x);
        int z=reverse(y);
        return y==z;
    }
}

