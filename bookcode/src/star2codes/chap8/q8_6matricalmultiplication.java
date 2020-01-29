package star2codes.chap8;

import java.util.Scanner;

public class q8_6matricalmultiplication {
//3*3 matrixs
//    3:25
public static void main(String[] args) {
    double a[][]= new double[3][3];
    double b[][]= new double[3][3];
    Scanner s = new Scanner(System.in);
  put(s,a,"a ");
    put(s,b,"b ");
    System.out.println("\n\n\n\n");
    
    System.out.println("arrays are ready to be multiplied ");
    two_DArrays.Display(a);
    System.out.println("-----------------");
    two_DArrays.Display(b);
    System.out.println("-----------------");
    two_DArrays.Display(multiply(a,b));

    s.close();
}
public static void   put(Scanner s, double b [][],String x){
    for (int i = 0; i < b.length; i++) {
        for (int j = 0; j <b[i].length ; j++) {
            System.out.println(x+"enter in to row "+i+" enter in to col "+j);
            b[i][j]= s.nextDouble();
        }
    }
    System.out.println(x);
    two_DArrays.Display(b);

}
public static double[][] multiply(double[][]a,double[][] b){
    double sum=0;
    double[][] sol=new  double[3][3];
    for (int i = 0; i < 3; i++) { //row in resultant
        for (int j = 0; j < 3; j++) { //col of resultant
            for (int k = 0; k < 3; k++) { //columns in the first matrix
                sum=sum+a[i][k]* a[k][j];
            }
            sol[i][j]=sum;
            sum=0;
        }
        
    }
    return sol;
    }
}



