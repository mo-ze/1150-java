package star2codes.chap6;

public class q6_36 {
    public static void main(String[] args) {
   System.out.println( area(5,6.5));
    }
    public static double area(int n , double sides){
        double a;
        a=n*mymath.squared(sides);
         a=a/(4*Math.tan(Math.PI/n));
        a=mymath.myround(a,3);
        return a;
    }
}
