

public class MAX {

    public static int max(int x,int y){

        if (x<y) return y;
        else return x;
    }
    public static double max(double a,double b){
        return a>b?a:b;
    }


    public static void main(String[] args){
    int x= 10;
    int y=20;

    System.out.println(max(x,y));
    }
}
