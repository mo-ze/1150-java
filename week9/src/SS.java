public class SS {
    public static void main(String[] args) {

/*
First find the smallest element in the array
and exchange it with the element in the first position,
then find the second smallest element
and exchange it with the element in the second position and
 continue in this way until the entire array is sorted.
 */

        int[] arr= new int[]{72, 37, 18, 72, 16, 94, 97, 6, 44, 36, 51, 11};
        bs.displayarr(arr);
        bs.displayarr(selectionsort (arr));
    }



    public static int[] selectionsort(int[]X){

        int n=X.length;


        for (int j = 0; j < n-1; j++) {
            int minpos = j;



            for (int i = j+1; i < n; i++) {
                if (X[i] < X[minpos]) {
                    minpos = i;
                }
            }
            int temp = X[minpos];
            X[minpos] = X[j];
            X[j] = temp;
        }
        return X;
    }


}


