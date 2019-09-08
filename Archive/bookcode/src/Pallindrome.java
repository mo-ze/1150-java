import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("please enter number");

        String n=s.nextLine();

        s.close();

        String fnum=n.substring(0,1);

        String lnum=n.substring(2);

//		System.out.println(fnum +"," +lnum );

        if(Integer.parseInt(fnum)==Integer.parseInt(lnum)) {
            System.out.println("this is palindrone");

        }else {
            System.out.println("this is not a palindrone");}
    }
}
