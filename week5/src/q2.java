
import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {

        /*
         * Take input a String A from user. Output the string in all lowercase
         * from UPPER-CASE to lower-case
         */
//		init scanner
        Scanner s = new Scanner(System.in);
//		get ui uppercase
        String userinput=s.nextLine();

        s.close();
//					uppercase to lowercase
        for (int i = 0; i< userinput.length(); i++)
        {
//		 			geting char of user input
            char uiChar = userinput.charAt(i);
//		            char is within bounds
            if ( uiChar>= 'A' && uiChar<='Z')
            {
//		            change the char
                uiChar = (char)( (uiChar + 32) );
            }
//		            return the char
            System.out.print(uiChar);
        }
    }


}


