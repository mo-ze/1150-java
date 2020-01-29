package star2codes.chap7;

public class q7_5 {
//    distinct numbers
    public static void main(String[] args) {
      int[] a=myarrays.quickarr()  ;


        myarrays.displayarr(a);
        myarrays.displayarr( myarrays.selectionsort(a));

        for (int i = 0; i <a.length-1 ; i++) {
            if (a[i] != a[i+1]) {
                System.out.print(a[i]+" ");

            }


        }

//     todo   trick print last number

        System.out.print(a[a.length-1]);

    }


}

