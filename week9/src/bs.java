public class bs {

    public static void main(String[] args) {

//        a.	Bubble sort an array X with N items
//        1.	For i=0 to i=n-1 with i=i+1 do 2-6
//        2.	For j=0 to j=N-2 with j=j+1 do 3-6
//        3.	If X[j] > X[j+1] do 4 - 6
//        4.	    Temp = X[j]
//        5.	    X[j]=X[j+1]
//        6.	    X[j+1]=temp

        int[] newarr= new  int[]{72, 37, 18, 72, 16, 94, 97, 6, 44, 36, 51, 11};
       int[] bs= bublesort(newarr);
    displayarr(bs);
    }


    public static void displayarr(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(i==0) {
                System.out.print(" { " + arr[i] + " , ");
            }
            else if(i== arr.length-1){
                    System.out.print(  arr[i] + " }");
            }
            else{ System.out.print(  arr[i] + " , ");}


        }
        System.out.println("");

    }


    public static int[] bublesort(int[] X){
        int n=X.length;
        int temp=0;
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-2 ; j++) {
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
}
