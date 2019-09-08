
import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

// name: thewhilecode
// 1.	ask for n as userinput
// 2.	ask for b as userinput
// 3.	sum=0
// 4.	q=0
// 5.	r=0

// 6.	while ( n is not equal to 0) do 7-10
// 7.q= n/b
// 8.r= n mod b
// 9. sum=sum + r
// 10.n=q
// .

// 11.display sum



//(assume UserInputs are positive )

        Scanner s = new Scanner(System.in);
        System.out.println("enter n");
        int n = s.nextInt();
        System.out.println("enter b");
        int b = s.nextInt();
        int sum=0;
        int q=0;
        int r=0;
        while (n>0) {
            q=n/b;
            r=n%b;
            sum=sum+r;
            n=q;

        }

        s.close();
        System.out.println("sum= "+ sum );
    }

}
