package star2codes.Other;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        /* reproduce the following
         * lines=4
         *  ...1
         *  ..12
         *  .123
         *  1234
         *
         */
//	Scanner s=new Scanner(System.in);
//	int line= s.nextInt();
//	s.close();

        int lines=5;

        for(int line=1; line<=lines; line++) {
            for (int dash=1;dash<=(lines-line);dash++) {
                System.out.print(".");
            }

            for (int num=1;num<=line;num++) {
                System.out.print(num+" ");

            }
            System.out.println();
        }

    }
}
