package star2codes.chap7;
import java.util.Scanner;
////(Count occurrence of numbers) Write a program that reads the integers between 1 and 100
// and counts the occurrences of each.
// Assume the input ends with 0.
// TODO: 2019-07-10 (Count occurrence of numbers)
public class q7_3 {
    public static void main(String[] args) {

        int[] i=myarrays.quickarr();
        System.out.println("Your inputs are:");
        myarrays.displayarr(i);

        int[] x=myarrays.selectionsort(i,i.length-1);
        System.out.println("Your inputs sorted are:");
        myarrays.displayarr(x);
       count(x);
    }
        public static void count(int[] arr) {
           int count=1;
           System.out.println("\n");
            for (int i = 1; i <arr.length ; i++) {
                    if (arr[i] != arr[i - 1]) {
                        System.out.println(arr[i-1] + " apears " + count+" times");
                        count=1;
                    }
                    else
                    {
                         count++;
                    }



            }
        }
}




