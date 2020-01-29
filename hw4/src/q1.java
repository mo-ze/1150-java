
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        //see if a point lies in circle
        Scanner s = new Scanner(System.in);
        System.out.println("x coordinate");
        int x = s.nextInt();
        System.out.println("y coordinate");
        int y = s.nextInt();
        System.out.println("radius");
        int r = s.nextInt();
        s.close();

        double d=dist(0,0,y,x);

        if (d<r){
            System.out.println("inside the circle ");
        }
        else {
            System.out.println("outside outside the circle");
        }
    }
    public static double  dist( int x, int y, int a, int z) {
        //	x2 as z
        // 	x1 as x =0
        // 	y2 as a
        // 	y1 as y =0
        return Math.sqrt((Math.pow(z-x,2)+Math.pow(a-y,2)));
    }



}
