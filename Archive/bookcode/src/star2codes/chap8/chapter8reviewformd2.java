package star2codes.chap8;

public class chapter8reviewformd2 {

    public static void main(String[] args) {

        int[][] a = makearray(2);

        display2d(pushrandom(a));
       System.out.println("major difference "+ getMajordiffence(a));
       System.out.println("minor difference "+getMinordifference(a));

    }

    public static int[][] makearray(int size) {
        int[][] ar = new int[size][size];
        return ar;
    }

    public static int[][] pushrandom(int[][] ar) {
        for (int rows = 0; rows < ar.length; rows++) {
            for (int colunm = 0; colunm < ar[rows].length; colunm++) {
                ar[rows][colunm] = (int) (Math.random() * 20);
            }

        }
        return ar;
    }

    public static void display2d(int[][] a) {
        for (int rows = 0; rows < a.length; rows++) {
            for (int columns = 0; columns < a[rows].length; columns++) {
                System.out.print(a[rows][columns] + " ");
            }
            System.out.println();
        }
    }

    public static int getMajordiffence(int ar[][]) {
        int min = ar[0][0], max = ar[0][0];

        for (int i = 1; i < ar.length; i++) {
            if(ar[i][i]<min){
                min=ar[i][i];
            }
            max=(ar[i][i]>max)?ar[i][i]:max;

        }

        return max-min;
    }

    public static int getMinordifference(int ar[][]) {
        int min=ar[0][ar.length-1],max=ar[0][ar.length-1];
        // matrix.lenght-1-row
        for (int row = 0,col=ar.length-1 ; row < ar.length&& col>=0; row++,col--) {
            if(ar[row][col]<min){
                min=ar[row][col];
            }
            max=(ar[row][col]>max)?ar[row][col]:max;
        }
        return max-min;
    }


}
