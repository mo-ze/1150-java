package star2codes.chap7;

public class q7_19 {
    public static void main(String[] args) {

//        (Sorted?) Write the following method that returns true if the list is already sorted in increasing order.

    int[] r=myarrays.quickarr();
        myarrays.displayarr( r);
     System.out.println( IsSort(r));
        int[] e=(myarrays.selectionsort(r));
        myarrays.displayarr(e);
       System.out.println( IsSort(e));

    }
    public static boolean IsSort(int[] X){
        int n=X.length;
        int count=0;
        for (int i = 0; i <n-1 ; i++) {
            if(X[i]<=X[i+1]){}
            else {
                count=-1;
                break;
            }
        }
        return count >= 0;
    }
}
