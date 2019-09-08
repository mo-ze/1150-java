
import java.util.Arrays;
public class q5 {

    public static void main(String[] args) {

//			1.	For i=0 to i=N-1 with i=i+1 do 2-6
//				2.	For j=0 to j=N-2 with j=j+1 do 3-6
//				3.	If X[j] > X[j+1] do 4 - 6
//				4.	    Temp = X[j]
//				5.	    X[j]=X[j+1]
//				6.	    X[j+1]=temp

        int X[] = new int[20];

        System.out.print("random array:  ");

        for(int i = 0; i < X.length; i++){
            X[i] = (int)(Math.random() * 65) + 5;

        }

        System.out.println(Arrays.toString(X));
        int newar[]= bubblesort(X.length, X);
        System.out.print("bubble sorted: ");
        System.out.print(Arrays.toString(newar));

    }
    public static int[] bubblesort( int n, int X[] ) {

        int temp;

        for (int i=0; i<=n-1;i++) {
            for (int j=0; j<=n-2;j++) {
                if (X[j] > X[j+1])	{
                    temp = X[j];
                    X[j]=X[j+1];
                    X[j+1]=temp;

                }
            }
        }

        return X ;
    }

}


