import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


//        Scanner s=new  Scanner(System.in);
//        String  m=readobj(s,"please enter string to compress ");
        String m="uuuuiiiiippppp"+"~";
       String n = compress(m);
        System.out.println("compressed: "+ n);


        System.out.println( "decompressing: "+decompress(compress(m)));
System.out.println( compressionratio(m,n));

    }


    public static String readobj(Scanner s,String prompt) {

        // take inputs with appropriate prompts
        System.out.println(prompt);
        String s1 = s.nextLine();
//		append a space to the end of the user input

        s1=s1+" ";

        return s1;

    }


    public static String compress(String orig) {
//	TODO make it a more than 3
//	The purpose of this function is to take as argument an uncompressed String
//	and return the compressed version of the String using Run-length Encoding
        /*
         *
         */
        orig.trim();
        int count=1;
        String com=" ";
        String temp="";
        int start = 0;


        for (int i = 1;i<orig.length();i++) {


            if(orig.charAt(i)!=orig.charAt(i-1)){
                orig.trim();
                temp=orig.substring(start, i);

//					System.out.println(start+","+i+","+count+','+temp+",  "+temp.length());
                if (temp.length()>3) {


                    com= com+("*"+temp.charAt(3)+count);
                    start += count ;

                    temp="";
                    count=1;
                }
                else {
                    com=com+temp;

//						break;
//						System.out.println (temp);
                }
            }
            else  {
                count++;
            }
        }
        return com;





    }
    public static String decompress(String comp) {

//	The purpose of this function is to take as argument a compressed String
//	and return the decompressed version of the String using Run-length Decode
   int[] allstars= allindex(comp,'*');
   String rpl="";
   String sublast=comp.substring(comp.lastIndexOf('*'));
        char charlast=sublast.charAt(1);     
        String numlast=sublast.substring(2);
        int numberlast= Integer.valueOf( numlast);
        String rplLast=Rpl(charlast+"",numberlast);
        

        for (int i = 0; i < allstars.length-1; i++) {
        String sub=comp.substring(allstars[i],allstars[i+1]);

        char sub1=sub.charAt(1);
            String num=sub.substring(2);
//            System.out.println("sub: "+sub);
//        System.out.println("char: "+sub1);
//        System.out.println("num: "+num);
        int number= Integer.valueOf( num);
       rpl=rpl+ Rpl(sub1+"",number);
        
        }
      rpl=rpl+rplLast;


        return rpl;

    }
    public static String Rpl(String what, int howManyTimes) {
//		rpl stands for return pattern per line
        String a="";

        for(int j = 1; j <= howManyTimes; j++)
        {
            a+=	what;
        }
//		System.out.print(a);

        return a;

    }


    public static double compressionratio(String orig,String compressed) {
//		The purpose of this function is to take as argument an uncompressed String and
//		a compressed String and return the compression ratio as a double

        return (double) (orig.length()/compressed.length());

    }

    public static int[] allindex(String string,char cahr){
        int a[]=new int[countcharinastr(string,cahr)];
        for(int i=0 ,c=0; i<string.length();i++){
            if(string.charAt(i)==cahr){
                a[c]=i;
                c++;
            }
        }
//        for (int b:a) {
//            System.out.print(b+" ");
//            System.out.println();
//        }


        return a;
    }
    public static int countcharinastr(String s, char a){
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==a){
                count++;
            }
        }
//        System.out.println(count);
        return count;
    }
}
