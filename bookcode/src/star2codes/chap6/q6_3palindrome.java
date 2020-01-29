package star2codes.chap6;

// (Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
//        public static int reverse(int number)
// Return true if number is a palindrome
//        public static boolean isPalindrome(int number)
//        Use the reverse method to implement isPalindrome.
//        A number is a palin- drome if its reversal is the same as itself.
//        Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.


public class q6_3palindrome {
//    assume the number is 3 digits
public static void main(String[] args) {

    System.out.println("is 121 a pallindrome "+isPalindrome(121));
    System.out.println("is 122 a pallindrome "+isPalindrome(122));

}




    public static int reverse(int number){

        int x=number%10; //4
        number=number/10;
        int y=number%10; //6
        number=number/10;
        int w=number%10; //5

        int reverse=x*100+y*10+w;

        return reverse;
    }

    public static boolean isPalindrome(int number){

        return number == reverse(number);



    }





    }

