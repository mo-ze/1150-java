package star2codes.chap6;

public class q6_25convertMillis {
    public static void main(String[] args) {
/*


        (Convert milliseconds to hours, minutes, and seconds) Write a method that con- verts milliseconds to hours, minutes, and seconds using the following header:
        public static String convertMillis(long millis)
        The method returns a string as hours:minutes:seconds.
         For example, convertMillis(5500) returns a string 0:0:5,
          convertMillis(100000) returns a string 0:1:40, and
          convertMillis(555550000) returns a string 154:19:10.
   */

        System.out.println(conmilli(  555550000));
        System.out.println(conmilli(  100000000));
        System.out.println(conmilli(  550000000));
//        555550000= 	154:19:10
    }
    public static String conmilli(long x){
    System.out.print(x+  "= \t");
        long millisHours=60l*60l*1000l;
        long milisMin=60l*1000l;
        long mininsec=1000l;

//    todo     tricky calculation
        int hours= (int) (x/millisHours);
        int remmili= (int) (x%millisHours);
        int minutes= (int) ( remmili/milisMin);
         int remmilim= (int) (remmili%milisMin);
        int seconds= (int) (remmilim/mininsec);


        String m=hours+":"+minutes+":" +seconds;
        return m;
    }
}
