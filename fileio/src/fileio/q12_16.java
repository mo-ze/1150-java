package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class q12_16 {

        public static void main(String[] args) throws FileNotFoundException {
            String whattoreplace="a";
            String filename="out12";
            String with="";

            String a[]=GetData(filename);
            String[] data=RemoveText(a,whattoreplace,with);
            for(String s : data)
            {
                System.out.println(s);
            }
            WriteData(filename,data);
            System.out.println("the data is saved to file "+filename);


        }







        public static int CountLines(String fileName) throws FileNotFoundException
        {
            Scanner s = new Scanner(new File(fileName));
            int count =0;
            while (s.hasNextLine()){
                s.nextLine();
                count++;
            }
            s.close();
            return count;
        }

        public static String[] GetData(String fileName /*int lineCount */) throws FileNotFoundException
        {
            // todo use the CountLines to count the lines in the file and
//          REMOVE the lineCount parameter
            int  lineCount=CountLines(fileName);
            // create an array of strings of size lineCount
            String[] arr=new String[lineCount];
            //open the file
            Scanner s = new Scanner(new File(fileName));
            //get the lines as individual strings in the array
            for (int i = 0; i < arr.length; i++) {
                arr[i]=s.nextLine();

            }
            //close the file
            s.close();
            return arr;
        }

        public static String[] RemoveText(String[] lines, String text,String with)
        {

            for (int i = 0; i < lines.length; i++) {
                lines[i]=lines[i].replace(text,with);
            }
            return lines;
        }

        public static void WriteData(String fileName, String[] data) throws FileNotFoundException {
            //open the file
            PrintWriter pw=new PrintWriter(new File(fileName));
            //write data to the file
            for (int i = 0; i < data.length; i++) {
                pw.println(data[i]);

            }
            System.out.println("saving complete");
            //close the file
            pw.close();
            return;
        }





}
