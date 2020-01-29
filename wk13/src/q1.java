public class q1 {

    public static void main(String[] args)
    {
        int arr[] = {1,15, 6, 3};
        System.out.println(NameMe(arr, 0));
        System.out.println(NameMe(arr, 2));
    }

    public static int NameMe(int[] arr, int start)
    {
        if (start < 0)
        {
            System.out.println("Invalid Start!");
            return 0;
        }
        if (start == arr.length - 1)
        {
            return arr[start];
        }
        int m = NameMe(arr, start + 1);
        if(m > arr[start])
        {
            return m;
        }
        else
        {
            return arr[start];
        }
    }

}
