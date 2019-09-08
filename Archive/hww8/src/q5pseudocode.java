import java.util.Scanner;

public class q5pseudocode {
    /*
pseudocode
    count=0
    for i=0 to n-2 with i=+1 do 4-5
       if(arr[i]==arr[i+1]) do 5
                    count=+1
    print count to user

     */
      /*
      * main method
      * @params
      * @return */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println( val(pusharray(s)));

    }
    /*
     * get input from user and push them into array
     * @params Scanner s
     * @return array */


    public static int[] pusharray(Scanner s){
        int[] arr = new int[6];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();
        }

    return arr;
    }

    /*
     * count how many neighbors are the same.
     * @params arr
     * @return  count */
    public static int val(int[] arr) {

        int N = arr.length;
        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }
        return (count);

    }
}
