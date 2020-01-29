package fileio;

import java.io.*;
import java.util.Scanner;

public class q12_12 {
    public static void main(String[] args) throws FileNotFoundException {
        String filename="main.java";
        String what=") {";
        String by=")\n{";
        String[] data= getdata(filename);
        replace(data,what,by);
        writedata(filename,data);

    }
    public static int countlines(String filename) throws FileNotFoundException {
        Scanner s = new Scanner(new File(filename));
        int count=0;
       while (s.hasNextLine()){
           s.nextLine();
           count++;
       }


        s.close();
        return count;
    }
    public static String[] getdata(String filename) throws FileNotFoundException {
        String [] data=new String[countlines(filename)];

        Scanner s = new Scanner(new File(filename));
        for (int i = 0; i < data.length; i++) {
            data[i]=s.nextLine();
        }
        s.close();

        return data;
    }
    public static String[] replace(String[] data, String what,String with){

        for (int i = 0; i < data.length; i++) {
            data[i]=data[i].replace(what,with);
        }
        return data;
    }



    public static void  writedata(String filename,String[] data) throws FileNotFoundException {
        PrintWriter pw=new PrintWriter(new File(filename));
        for (int i = 0; i < data.length; i++) {
         pw.println(data[i]);
         System.out.println(data[i]);
        }
        System.out.println("done...");
        pw.close();
        return;
    }


}
