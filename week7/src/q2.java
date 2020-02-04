
import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Scanner s=new  Scanner(System.in);
//        String  m=readobj(s,"please enter string to compress ");
        String m="uuuiiiippbb";
        System.out.println("orignal:\t\t\t"+m);
        m+="~";
        System.out.println("compressed:\t\t\t"+ compress(m));
        String  n=decompress(compress(m));
        System.out.println( "decompressing:\t\t"+n);
        System.out.println( "Compression Ratio:\t"+ compressionratio(m,n));

    }

    public static String readobj(Scanner s,String prompt) {

        // take inputs with appropriate prompts
        System.out.println(prompt);
        String s1 = s.nextLine();
//        append a space to the end of the user input

        s1=s1+" ";

        return s1;

    }


    public static String compress(String orig) {
        //    TODO make it a more than 3
        //    The purpose of this function is to take as argument an uncompressed String
        //    and return the compressed version of the String using Run-length Encoding
        /*
         *
         */

//        orig = "uuuuueepppppmmm~";
//              012345678901234567
        orig.trim();

        String com = " ";

        int start = 0;

        for (int i = 0; i < orig.length() - 1; i++) {
            if (orig.charAt(i) != orig.charAt(i + 1)) {
//                break into pts, add points to array
//                System.out.println(start+""+orig.charAt(i)+""+i);
                int count=i-start;
//                System.out.println(count);
                if (count>=3){
                    com+="*"+orig.charAt(i)+count;
                }
                else {
                    if(i==2){com=""+orig.charAt(0);}
                    com+=orig.substring(start+1,i+1);
                }

                start=i;

            }

        }
//        System.out.println(com);
        return com;

    }
    public static String decompress(String comp) {

        char[] compar = comp.toCharArray();


//System.out.println(comp);
        String x="";
        for (int i = 0; i <compar.length ; i++) {
            if(compar[i]=='*'){
                x+=Rpl(compar[i+1]+"",Integer.parseInt(compar[i+2]+""));
                i+=2;
            }else{
                x+= compar[i];
            }

        }
//        System.out.println(x);

        return x;
    }


    public static int[] chartointarr(char[] arr){
        int[] in= new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {

            in[i]=Integer.parseInt(arr[i]+"");
            System.out.println(in[i]);
        }
        return  in;

    }
    public static String Rpl(String what, int howManyTimes) {
//        rpl stands for return pattern per line

        String a="";
        for(int j = 1; j <= howManyTimes; j++)
        {
            a+=    what;
        }
//        System.out.print(a);

        return a;

    }


    public static double compressionratio(String orig, String compressed) {
//        The purpose of this function is to take as argument an uncompressed String and
//        a compressed String and return the compression ratio as a double

        return (double) (orig.length()/compressed.length());

    }



}
