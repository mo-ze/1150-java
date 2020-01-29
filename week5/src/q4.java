

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        /*
         * redo Exercise 3 however you cannot use ANY indexOf methods
         * (i.e. indexOf or lastIndexOf) in your code.
         *
         * ok here is what i am going to do
         * 1. copy my code from q3
         * 2. Change a few things
         * 3. all done.
         */
//		init scanner
        Scanner s=new Scanner(System.in) ;
        System.out.print("check if ");
//		string to look for
        String lookforStr = s.nextLine();
//		paragraph string
        System.out.println("is in ");
        String str =s.nextLine();
//
        s.close();

        int previous_Index = 0;    //	old index
        int count = 0;     //count
//       the while loop
        while (previous_Index != -1) {
//		see comment int findme funchion
            previous_Index = findme(lookforStr, str,previous_Index);

            if (previous_Index != -1) {
                System.out.println( lookforStr +" appears at index "+previous_Index+"," );
                //increase count
                count++;

                previous_Index += lookforStr.length();
                /*

                 * suppose lookforStr.length()=2 and this class gets a match with the first character in the string
                 * it would not be efficient to repeat the the loop for the next character because it has already been done.
                 * #notrunninginfite

                 */
            }


        }
        System.out.println("count:"+count);
    }


    public static int findme(String look,String Main,int start) {
//		try catch for exception handling
        try {
//			  start a for loop
            for(int i=start;i<Main.length();i++) {
//				 this substring method can possibly give an error
                if(Main.substring(start,i+look.length()).contains(look)) {
                    return i ;
                }
            }
        }
        catch (IndexOutOfBoundsException error)  {
//		print out error in a normal form
            System.out.println("index are out of bounds");
//			  returning -1 to stop the while loop
            return -1 ;
        }
        return  -1 ;
    }
}
