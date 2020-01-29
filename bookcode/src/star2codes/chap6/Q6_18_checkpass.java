package star2codes.chap6;

import java.util.Scanner;

/*
Check password) Some websites impose certain rules for passwords. Write a method that checks whether a string is a valid password.
Suppose the password rules are as follows:
        ■ A password must have at least eight characters.
        ■ A password consists of only letters and digits.
        ■ A password must contain at least two digits
        Write a program that prompts the user to enter a password and displays Valid Password
        if the rules are followed or Invalid Password otherwise.
 */
public class Q6_18_checkpass {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter yourpassword");
        String pass=s.nextLine();
        s.close();
        if (allcondtion(pass)){
            System.out.println("valid pass");}
        else {
            System.out.println("invalid pass");}
    }

    public static boolean allcondtion(String pass){

        return check8char(pass) && checknumtxt(pass) && t2digits(pass);
    }
    public static boolean check8char(String pass){
//        must contain atleast 8 chars
        return pass.length() >= 8;

    }
    public static boolean checknumtxt(String pass){

//         A password consists of only letters and digits.
//         todo trick count

            int count = 0;
            for (int i = 0; i < pass.length(); i++) {
                if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z' ||
                        pass.charAt(i) >= '0' && pass.charAt(i) <= '9' ||
                        pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
                    count++;
                }
            }

        return count == pass.length();

    }

    public static  boolean  t2digits(String pass){
//        must contain atleast 2 digits
        int count=0;
        for(int i=0;i<pass.length();i++) {
            if( pass.charAt(i) >='0'&& pass.charAt(i) <='9'){
                count++;
            }

    }
        return count >= 2;

    }
}
