package star2codes.chap7;

public class q7_31 {
//    (Merge two sorted lists) Write the following method that merges two sorted lists into a new sorted list.
//    public static int[] merge(int[] list1, int[] list2)

    public static void main(String[] args) {
       int[]r= myarrays.RandomArrp(5,100,5);
       int[] m=myarrays.RandomArrp(5,100,5);
        myarrays.displayarr(r);
        myarrays.displayarr(m);
       myarrays.displayarr( myarrays.selectionsort( myarrays.merge(r,m))  );

    }
}
