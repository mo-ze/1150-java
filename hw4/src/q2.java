
import java.util.Scanner;
public class q2 {

    public static void main(String[] args) {
        //width and height of 2 rectangle and see overlapping;
        Scanner s=new Scanner(System.in);
        System.out.println("center X1 coordinate");
        int x1 = s.nextInt();
        System.out.println("center Y1 coordinate");
        int y1 = s.nextInt();
        System.out.println("Width1 coordinate");
        int W1 = s.nextInt();
        System.out.println("Height1 coordinate");
        int H1 = s.nextInt();
        System.out.println("center X2 coordinate");
        int x2 = s.nextInt();
        System.out.println("center Y2 coordinate");
        int y2 = s.nextInt();
        System.out.println("Width2 coordinate");
        int W2 = s.nextInt();
        System.out.println("Height2 coordinate");
        int H2 = s.nextInt();

        s.close();

//		getting some points on the line of width and height

//		width points.


        int x1right=x1+W1/2;		//Xcoordinate of Any point on the right side of R1
        int x2left=x2-W2/2;			//Xcoordinate of Any point on the left side of R2


        int x1left=x1-W1/2;			// Xcoordinate of Any point on the left side of R1
        int x2right=x2+W2/2;		// Xcoordinate of Any point on the right side of R2

//		height points

//
        int	y2bottom=y2+H2/2;	// Ycoordinate of Any point on the bottom side of R2
        int y1top=y1-H1/2;		// Ycoordinate of Any point on the top side of R1

//
        int	y1bottom=y1+H1/2; 	// Ycoordinate of Any point on the bottom side of R1
        int y2top=y2-H2/2;		// Ycoordinate of Any point on the top side of R2


//		case1 when R1 is on the left of R2
//		case2 when R1 is on the right of R2
//		case3 when R2 is above R1
//		case4 when R2 is below R1

        if (	  (y1bottom>y2top) //3
                ||(y2bottom>y1top) //4
                ||(x1right<x2left) //1
                ||(x1left>x2right))//2
        {
            System.out.println("not overlap");
        }else {
            System.out.println("overlap");
        }






    }


}
