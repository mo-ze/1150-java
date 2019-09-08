import java.io.*;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) throws FileNotFoundException {
        int line= linecount();

        System.out.println("I am using IntelliJ here, Other IDEs might be different in  terms of File/io \n Thanks "+"\n");


        Scanner infile = new Scanner (new File("Contacts.txt"));

            int col=2;
            String[][] data=new String[line][col];

            char delimeter='-';
        for (int i = 0; i <line ; i++) {
            String s1=infile.nextLine();
            String s11=s1.substring(0,s1.indexOf(delimeter));
            String s12=s1.substring(s1.indexOf(delimeter)+1);
            data[i][0]=s11;
            data[i][1]=s12;

        }
        
        parr(data,"unsorted data");


        String namearr[]= oned(data,0);
        String numarr[]= oned(data,1);


        sort2arr(namearr,numarr);
       String[][] sortbyname= make2d(namearr,numarr);
        putintofiles(sortbyname,"sortedbyname.txt","\n\nsorted by name ");
        sort2arr(numarr,namearr);
       String[][] sortbynum= make2d(namearr,numarr);
        putintofiles(sortbynum,"sortedbynumber.txt","\n\nsorted by number");
        infile.close();
    }

    public static int  linecount() throws FileNotFoundException{
        Scanner in = new Scanner (new File("Contacts.txt"));

        int count=0;
        while(in.hasNext()){
            count++;
             in.nextLine();
        }
        in.close();
        return count;
    }
    public static void parr(String[][] a, String prompt ){
        System.out.println(prompt);
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j] +"\t\t");
            }
            System.out.println();
        }
    }
    public static String[] oned(String data[][],int colnum){
    String[] a =new String[data.length];
        for (int i = 0; i < a.length; i++) {
            a[i]=data[i][colnum];
        }
//       System.out.println( Arrays.toString(a));
        return a;
    }

    public static void sort2arr(String a[],String[] b ){

        for (int i = 0; i <a.length ; i++) {
            int minpos = i;
            for (int j = i+1; j <a.length ; j++) {
                if (lessthan(a[j], a[minpos]) ) {
                    minpos = j;
                }


            }
            String temp = a[minpos];
            a[minpos] = a[i];
            a[i] = temp;

            String temp2=b[minpos];
            b[minpos]=b[i];
            b[i]=temp2;

        }
//        System.out.println("==============");
//        System.out.println( Arrays.toString(a));
//        System.out.println(  Arrays.toString(b));
    }
    public static boolean lessthan(String a , String b ){
       return a.compareToIgnoreCase(b) < 0;

    }


    public static String[][] make2d(String[] a,String [] b ){
        String[][] ab=new String[a.length][2];
        for (int i = 0; i < a.length; i++) {
           ab[i][0]= a[i];
        }
        for (int i = 0; i < b.length; i++) {
            ab[i][1]= b[i];
        }
        return  ab;

    }

    public static  void putintofiles( String data[][],String filename,String prompt) throws FileNotFoundException {
        PrintWriter  out = new PrintWriter(new File(filename));


        for (int i = 0; i <data.length ; i++) {
            for (int j = 0; j < data[i].length; j++) {
                out.print(data[i][j]+"\t\t");
            }
            out.println();
        }

        out.close();
        parr(data,prompt);
        System.out.println("save to file :"+filename);
    }
}
