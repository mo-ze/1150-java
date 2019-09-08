package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;






    public class q12_20 {

        public static void main(String[] args) throws FileNotFoundException {
            //trick the file name
            String path="aaa/srcRootDirectory/";
            File parentfile =new File(path);
            String[] pf= parentfile.list();


            for (int i = 0; i <pf.length ; i++){
                File child =new File(path+pf[i]);
                String[] childf= child.list();
                String m="";

                for (int j=0;j<childf.length;j++) {
                    m = pf[i] + "/" + childf[j];
                    String filename = path + m;
                    File file =new File(filename);
                    filepath(file);

                    String a[]=GetData(filename);
                    replace(a,0,"//");

                    WriteData(filename,a);
                }
            }

        }
        public static String[] replace(String[] a,int pos,String with ){
            a[pos]=a[pos].replace(a[pos],with);

            return a;
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

        public static String filepath(File f)throws FileNotFoundException{


            String fp=f.getParentFile().toString();
            String gp=fp.substring(4,fp.length()-6);
            String dp=fp.substring(fp.length()-5);
//            System.out.println(gp);

            String p= gp+"."+dp;

            return p;

        }
        public static String[] GetData(String fileName /*int lineCount */) throws FileNotFoundException
        {
            File file=new File(fileName);
            String p=filepath(file);
            int  lineCount=CountLines(fileName);
            String[] arr=new String[lineCount+1];
            Scanner s = new Scanner(file);
//            String a[0]=
            for (int i = 1; i < arr.length; i++) {

                arr[i]=s.nextLine();
            }
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
            PrintWriter pw=new PrintWriter(new File(fileName));
            for (String e:data) {
                pw.println(e);
            }
            System.out.println("saving complete");
            pw.close();
            return;
        }




    }


