import star2codes.chap7.myarrays;

public class q9thjulycode {
    public static void main(String[] args) {
        int[] a = myarrays.quickarr();
        int[] d = new int[a.length];
        myarrays.copy(a, 0, d, 0, a.length);
        myarrays.displayarr(d);
    }



}
