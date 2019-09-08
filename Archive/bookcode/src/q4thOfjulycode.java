
import java.util.Scanner;

public class q4thOfjulycode {
    public static void main(String[] args) {
        int y[]=pushrandom(arrayinit(10));
        displayArray( y);
       displayArray( reverse( y));

//        Scanner s = new Scanner(System.in);

//        pusharray( arrayinit(10),s);
//        s.close();
    }

    public static int[] arrayinit(int len){
        int ar[]=new int[len];
        return ar;
    }

    public static int[] pusharray(int ar[],Scanner s ){

        for (int i = 0; i <ar.length ; i++) {
            System.out.println("enter value for position "+i);
            int input=s.nextInt();
            ar[i]=input;

        }
        displayArray(ar);
        System.out.println( count5(ar));
        return ar;
    }

    public static int[] pushrandom(int[]ar) {
        int max =50;
        int min=1;
        for (int i = 0; i <ar.length ; i++) {
            ar[i]= (int) (Math.random()*(max-min+1)+min);

        }
        return ar;
    }

    public static int[] reverse(int[] oldar){
        int[] arr=new int[oldar.length];

        for (int i = oldar.length-1,  count=0;count<arr.length && i >=0 ;count++, i--) {

            arr[count]=oldar[i];


        }
        return arr;
    }

    public static void displayArray(int ar[]){
//        System.out.println(Arrays.toString(ar));
        for (int i = 0; i <ar.length ; i++) {
            System.out.print(ar[i]+" , ");

        }
        System.out.println();
    }

    public static int count5(int[]ar){
       int count=0;

        for (int i = 0; i <ar.length ; i++) {
            if (ar[i]==5){
                count++;
            }
        }
        return count;
    }


}
