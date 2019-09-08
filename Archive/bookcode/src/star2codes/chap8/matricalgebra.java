package star2codes.chap8;
import star2codes.chap7.myarrays;
public class matricalgebra {
    public static void main(String[] args) {

    int r=2;
    int c=2;
    int[][] a=getmatrix(r,c);
    int b[][]=getmatrix(r,c);
    display("matrix a",a);
    display("matrix b",b);

    int[][] s=sum(a,b);

    display("sum",s);
        int[][] n={{5,6,1,2},{1,2,5,3}};
        display("n",n);
        sortrows(n);
        display("n",n);

    }
    public static void sortrows(int[][] a){
        for (int i = 0; i <a.length ; i++) {
            myarrays.selectionsort(a[i]);
        }

    }

    public static int[][] getmatrix(int r,int c){

        int[][] a=new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                 a[i][j]=(int)(Math.random() * ((50 - -50) + 1)) + -50;

            }

        }

        return a;
    }
    public static int[][] sum(int[][] a,int[][] b ) {
        if(a==null){throw new ArithmeticException("you cant add a null matrix ");}
        else if(a.length<0){ throw  new ArithmeticException("a has no lenght"); }
        else{
        int[][] s = new int[a.length][a[0].length];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = a[i][j] + b[i][j];
            }

        }

        return s;
    }
    }
    public static void display(String b, int[][] a ){
        System.out.println(b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
              System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void display( int[][] a ){

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}