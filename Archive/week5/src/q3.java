
import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

//		importing scanner
        Scanner s=new Scanner(System.in) ;
        System.out.print("check if ");
//		string to look for
        String lookforStr = s.nextLine();
//		paragraph string
        System.out.println("is in ");
        String str =s.nextLine();

        s.close();

        int previous_Index = 0;   //	old index
        int count = 0;			//		count
//      the while loop
        while (previous_Index != -1) {

            previous_Index = str.indexOf(lookforStr, previous_Index);

            if (previous_Index != -1) {
                System.out.println( lookforStr +" appears at index "+previous_Index+"," );
                //increase count
                count++;

                previous_Index += lookforStr.length();
                /*
                 * Suppose lookforStr.length()=2 and the gets a match with the first character in the string
                 * it would not be efficient to repeat the the loop for the next character because it has already been done.
                 * #notrunninginfite

                 */
            }


        }
        System.out.println("count:"+count);
    }


}
