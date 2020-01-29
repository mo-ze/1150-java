package star2codes.chap7;

import java.util.Scanner;

public class q7_34 {

    /*
    (Sort characters in a string) Write a method that returns a sorted string using the following header:
    public static String sort(String s) For example, sort("acb") returns abc.
    Write a test program that prompts the user to enter a string and displays the sorted string.
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("type an string");
        String useri=s.nextLine();
        s.close();
        System.out.println(
        putback(myarrays.selectionsort(pullcharout(useri))));
    }

    public static char[] pullcharout(String a){
        char[]c=new char[a.length()];
       for (int i = 0; i <a.length() ; i++) {
           c[i]=a.charAt(i);
       }



       return c;
   }

    public static String putback(char[] a){

        String s= "";
        for (int i = 0; i < a.length; i++) {
            s+=a[i]   ;
        }

        return s;

    }


}
