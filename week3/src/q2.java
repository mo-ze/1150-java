

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a num");
        int u = s.nextInt();

        int sum=0;
        int max=0;
        int count=0;
        int countneg=0;
        int countpos=0;
        while(u!= 0) {
            count++;
            sum=sum+u;
            if (u>max) {
                max=u;
            }
            else if (u<0)
            {
                countneg++;
            }
            else if (u>0)
            {
                countpos++;
            }
            System.out.println(u);
            System.out.println("enter a num");
            u = s.nextInt();

        }
        s.close();
        float av=sum/count;
        System.out.println("sum= "+sum +"; max=" +max +"; count="+count +"; Average= "+ av);
        System.out.println("negativecount= "+countneg +" postivecount= "+countpos);


    }

}
