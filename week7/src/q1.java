import java.util.Scanner;

public class q1 {
    public static String readobj(Scanner s,String prompt) {



        // take inputs with appropriate prompts
        System.out.println(prompt);
        String s1 = s.nextLine();

        return s1;

    }
    public static boolean substring(String s1,String s2) {
        int counter;

        boolean found = false;

        for (int index1 = 0; index1 < s1.length() - s2.length() + 1; index1++)
        { counter = 0;
            for (int index2 = 0; index2 < s2.length(); index2++){
                if (s1.charAt(index1 + index2) == s2.charAt(index2)){
                    counter++;
                }
            }

            if (counter == s2.length())
            {
                found = true;
                break;
            }
        }

        if (found)
        {
            System.out.println(s2 + " is a substring of " + s1);
        }
        else
        {
            System.out.println(s2 + " is not a substring of " + s1);
        }
        return found;








    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String s1=readobj(s,"enter s1");
        String s2=readobj(s,"enter s2");
        substring(s1,s2)
        ;
    }


}
