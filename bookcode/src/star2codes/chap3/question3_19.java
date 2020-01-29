package star2codes.chap3;

import java.util.Scanner;

public class question3_19 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * (Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and
         * computes the perimeter if the input is valid.
         * Otherwise, displayArray that the input is invalid.
         * The input is valid if the sum of every pair of two edges is greater than the remaining edge.
         */

        Scanner s=new Scanner(System.in);
        System.out.print("enter side 1");
        int x = s.nextInt();
        System.out.print("enter side 2");
        int y = s.nextInt();
        System.out.print("enter side 3");
        int z = s.nextInt();


        if (sum(x,y)>z&&sum(x,z)>y&&sum(y,z)>x) {
            System.out.println(x+y+z);


        }
        else {
            System.out.println("input  invalid ");
        }
    }
    public static int sum(int x,int y) {
        return x+y;

    }

}
