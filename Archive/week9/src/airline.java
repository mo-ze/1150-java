import java.util.Scanner;

public class airline {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max= maxprice(s);
        String source=getcity(s,"city to fly from: ");
        String destinationcity=getcity(s,"city to fly to");
        int maxstop= maxstop(s);


        s.close();
        int n=3;
        System.out.println("from "+source+" to "+destinationcity );
        int[] prices=RandomArr(n,1200,250);
        int[] stop=RandomArr(n,4,0);
        System.out.println("unsorted");;
        displayarr(prices,stop);
        bublesort(prices,stop,max);
        System.out.println("here are prices by price in your range ");
        displayarr(prices,max);
        System.out.println();
        System.out.println("sorted by stops according to your stop");


        selsort(prices,stop,maxstop);
        displayarr(prices,stop);


    }
    public static void displayarr(int[] x,int[] y){
        displayarr(x);displayarr(y);
    }

    public static void bublesort(int[] prices,int[] stops,int max){

        int pl=prices.length;
        int sl=stops.length;
        int temp=0;
        int temp2=0;

        for (int i = 0; i <pl-1; i++) {
            for (int j = 0; j <pl-2 ; j++) {
                if (prices[j] > prices[j+1]){
                    temp = prices[j];
                    temp2=stops[j];



                    prices[j]=prices[j+1];
                    stops[j]=stops[j+1];

                    prices[j+1]=temp;
                    stops[j+1]=temp2;
                }
                temp=0;
            }

        }


    }

    public static int[] RandomArr(int N,int max,int min){
        int[] arr=new int[N];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= (int) ((Math.random()*(1+(max-min)))+min);

        }


        return arr;
    }
    public  static int maxprice(Scanner s){
                System.out.println("type your max bugdet");
                int max =s.nextInt();
                s.nextLine();




        return max;

    }

    public static String getcity(Scanner s,String ss){


                System.out.println(ss);
                String a=s.nextLine();

        return a;

    }


    public  static int maxstop(Scanner s){

        System.out.println("type max stop during this trip");
        int x =s.nextInt();
        s.nextLine();
        return x;

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

    public static void displayarr(int[] arr,int l){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<=l) {
                if (i == 0) {
                    System.out.print(" { " + arr[i] + " , ");
                } else if (i ==arr.length-1) {
                    System.out.print(arr[i] + " }");
                } else {
                    System.out.print(arr[i] + " , ");
                }
            }

        }
        System.out.print("}");

    }
    public static void selsort(int[]X, int[] m,int mstop){

        int n=X.length;

        for (int j = 0; j < n-1; j++) {
            int minpos = j;

            for (int i = j+1; i < n; i++) {
                if (m[i] < m[minpos] ) {
                    minpos = i;

                }
            }

            int temp = X[minpos];
            int temp2=m[minpos];
            X[minpos] = X[j];
            m[minpos]=m[j];
            X[j] = temp;
            m[j]=temp2;
        }

    }
}


