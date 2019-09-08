package star2codes.chap7;

import java.util.Scanner;

public class myarrays5 {

//    display
    public static void displayarr(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(i==0) {
                System.out.print(" { " + arr[i] + " , ");
            }
            else if(i== arr.length-1){
                System.out.print(  arr[i] + " }");
            }
            else{
                System.out.print(  arr[i] + " , ");
            }


        }
        System.out.println("");

    }
//    arrays
    public static int[] quickarr(){

        return new int[]{2,4,9,1,6,9,9,5,2,1};
    }
    public static int[] RandomArrp(int N,int max,int min){
        int[] arr=new int[N];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= (int) ((Math.random()*(1+(max-min)))+min);
        }

        return arr;
    }
    public static int[] reverse(int[] A) {
            int[] B = new int[A.length];

            for (int i = 0; i < A.length; i++) {
                B[A.length - 1 - i] = A[i];
            }

            for (int i = 0; i < A.length; i++) {
                A[i] = B[i];
            }

         return A;
        }
    public static int[] merge(int[] a, int[] b){

        int[] c=new int[a.length+b.length];

        //    trick  2 induvisual for loops
        for (int j = 0; j < a.length; j++) {
            c[j]=a[j];
        }
        for (int i = 0; i <b.length ; i++) {
            c[i+a.length]=b[i];
        }


        return c;
    }




    public static int[] copy(int[] src,int Spos , int[] destination,
                             int dpos,int itemcount){

            if      (Spos>=0 && (Spos<src.length) && ((Spos+itemcount-1)<src.length) &&
                    (dpos>=0 && dpos<destination.length)
                    && (dpos+itemcount-1)<destination.length ) {

                for (int i = 0; i < itemcount ; i++) {
                    destination[dpos+i]=src[Spos+i];
                }
                return destination;
            }
            else return destination;
    }
    public static int[] copy(int[] src){
        int[] destination=new int[src.length];
        for (int i = 0; i < src.length ; i++) {
                destination[i]=src[i];
        }
            return destination;
    }
    public static boolean checkitemsinArray(String[] arr){
        boolean dublicateitemsExists=true;
     // if duplicate does not exist return true else return false
        for (int i = 0; i < arr.length-1; i++) {
            for ( int j=i+1; j <arr.length ; j++) {
                if ((arr[i].equals( arr[j]))){
                    dublicateitemsExists=false;
                }
            }
        }
        return dublicateitemsExists;
    }
    public static int[] userinputs(Scanner s,int n){
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" enter integer value at array ["+i+"]");
            arr[i]=s.nextInt();
        }

        return arr;
    }

    //sorting
    public static int[] bubblesort(int[] X){
        int n=X.length;
        int temp=0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-1 ; j++) {
                if (X[j] > X[j+1]){
                    temp = X[j];
                    X[j]=X[j+1];
                    X[j+1]=temp;
                }
                temp=0;
            }
        }
        return X;
    }
    public static void swap(int[] arr,int pos1,int pos2){
        int temp=arr[pos2];
        arr[pos2]=arr[pos1];
        arr[pos1]=temp;


    }



    public static int[] selectionsort(int[]X){
        int n=X.length;
        for (int j = 0; j < n-1; j++) {
            int minpos = j;

            for (int i = j+1; i < n; i++) {
                if (X[i] < X[minpos]) {  //condition
                    minpos = i;
                }
            }
//           todo  last part
            int temp = X[minpos];
            X[minpos] = X[j];
            X[j] = temp;
        }
        return X;
    }

    public static void quicksort(int[] arr,int pivot,int low, int high){

        while(low<=high){
            if(arr[low]<arr[high]){low++;}
            if(arr[high]>arr[pivot]){high--;}
            if (arr[low] >= arr[pivot] && arr[high]<=arr[pivot]&&low<high) {
                swap(arr,low,high);
            }

        }
//        pivot swap
        swap(arr,pivot,high);
    }


}

