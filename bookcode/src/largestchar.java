import java.util.Scanner;
public class largestchar {

    public static void main(String[] args) {

//		finding the max char in a given string;
        Scanner myObj = new Scanner(System.in);
        System.out.print("enter a string: ");
        String x = myObj.nextLine();
        myObj.close();
        int n=x.length();
        char max=x.charAt(0);
        for (int i=0;i<n;i++) {
            if ((int )x.charAt(i)>max) {
                max=x.charAt(i);
            }

        }System.out.print(max);


    }

}
