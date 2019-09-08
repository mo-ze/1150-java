import java.io.*;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) throws  FileNotFoundException{
        System.out.println("I am using IntelliJ here, Other IDEs might be different\n Thanks "+"\n");

        doubles(10);

read();

//System.out.println("----------------------------");
//        System.out.println(FractionDigits(12.0)); //output: 0
//        System.out.println(FractionDigits(12.1230000)); //output: 3
//        System.out.println(FractionDigits(12.01204000)); //output: 5
//        System.out.println(FractionDigits(12.12345678)); //output: 6
//        System.out.println(FractionDigits(12.99999999)); //output: 0
//        System.out.println(FractionDigits(12.99999919)); //output: 6

    }



    public static void read() throws  FileNotFoundException{

        Scanner in=new Scanner(new File("double.txt"));
        while (in.hasNextDouble()){
            double val=in.nextDouble();
            System.out.println( FractionDigits(val));
        }

    }

    public static int FractionDigits(double val){
        int count=0;
        val=val-(int)val;
        val=round(val,6);


//        System.out.println((int) val);
//        double tval=val-(int)val;

        String sval=val+"";
        for (int i =sval.indexOf('.')+1; i < sval.length(); i++) {
            count++;
        }
        System.out.print(sval+"\t output\t");
//        System.out.println(count);
       return count;
    }


    public static void doubles(int n) throws  FileNotFoundException{
        PrintWriter pw=new PrintWriter(new File("double.txt"));
        for (int i = 0; i <n ; i++) {
            double r=Math.random();
            pw.println(r);
//            System.out.println(r);
        }

    pw.close();

    }


    public static double round(double val,int dp){

            double scale = Math.pow(10, dp);
            return Math.round(val * scale) / scale;

    }
}
