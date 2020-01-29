

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
//		check if the circles are overlapping
//		input the center coordinates (x,y)
//		and radii of two circle.

        Scanner s = new Scanner(System.in);
        System.out.println("x1 coordinate");
        int x1 = s.nextInt();
        System.out.println("y1 coordinate");
        int y1 = s.nextInt();
        System.out.println("radius");
        int r1 = s.nextInt();

        System.out.println("x2 coordinate");
        int x2 = s.nextInt();
        System.out.println("y2 coordinate");
        int y2 = s.nextInt();
        System.out.println("radius");
        int r2 = s.nextInt();
        s.close();


        int Tr=r1+r2;//total radius
        double d=dist(x1,y1,x2,y2); //get distance between two radius

        if ( d>Tr ) {
            System.out.println("they dont overlap");
        }
        else if(d<Tr) {
            System.out.println("they overlap");
        }
        else if(d==Tr) {
            System.out.println("they touch");
        }

    }
    public static double  dist( int x, int y, int a, int z) {
        // 	y2 as a 	x2 as z
        // 	x1 as x 	y1 as y
        return Math.sqrt((Math.pow(z-x,2)+Math.pow(a-y,2)));
    }

}
