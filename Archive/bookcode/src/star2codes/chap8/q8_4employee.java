package star2codes.chap8;


public class q8_4employee {
    public static void main(String[] args) {
    String[]head={"m","t","w","t","f"," t"};

    int [][] a=new int[5][5];
    fill(a);
       myarrays.displayarr(head);
    two_DArrays.Display(a);
    myarrays.displayarr(  sum(a));


    System.out.println("_______SWAP______________");
    int [] b= myarrays.selectionsort(sum(a));
    myarrays.displayarr(b);
    swap(b,a);
        two_DArrays.Display(a);



    }



    public static void fill(int a[][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            a[i][j]=mymath.myrandom(1,10) ;

            }

        }
    }


    public static int[] sum(int a[][]){
        int[] sum=new int[a.length];
        int sum1=0;

            for (int j = 0; j <a.length ; j++) {
                for (int k = 0; k < a[j].length; k++) {
                    sum1=sum1+a[j][k];
                }
                sum[j]=sum1;
                sum1=0;

            }
        return sum ;
    }
    public static  void swap(int a[],int[][] b ){
    int n =b.length;
        for (int j = 0; j < n; j++) {
            int maxpos=j;
            for (int i = 0; i < n; i++) {
                if (a[i]<a[maxpos]){
                maxpos=i;}
            }
            for (int k = 0; k <b.length ; k++) {
                int temp[]=new int[6];
                temp[k]=b[k][j];
                b[maxpos][j]=b[k][j];

                b[k][j]=temp[k];
            }
        }
    }

}
