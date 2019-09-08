package star2codes.chap7;

public class q7_32 {
    // TODO: 2019-07-07 i do not understand.
    /*
    (Partition of a list) Write the following method that partitions the list using the first element, called a pivot.
    public static int partition(int[] list)
    After the partition, the elements in the list are rearranged so that all the elements
    before the pivot are less than or equal to the pivot and the elements after the pivot are greater than the pivot.
    The method returns the index where the pivot is located in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}.
    After the partition, the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at most list.length comparisons.
    Write a test program that prompts the user to enter a list and displays the list after the partition. Here is a sample run.
     Note that the first number in the input indicates the number of the elements in the list. This number is not part of the list.
 */
    public static void main(String[] args) {
        int[] arr={4,2,5,1,6};
        myarrays.displayarr(arr);
        int pivot=0,low=1,high=arr.length-1;
        myarrays.quicksort(arr,pivot,low,high);

        myarrays.displayarr(arr);

    }


}
