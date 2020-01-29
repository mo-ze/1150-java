import java.util.Date;

public class listing2_7 {

        public static void main(String[] args) {

            // Obtain the total milliseconds since midnight, Jan 1, 1970
            long totalMilliseconds = System.currentTimeMillis();


            // get the total number second passed since midnight, Jan 1, 1970
            long totalSeconds = totalMilliseconds / 1000;
            long currentSecond = totalSeconds % 60;

            // Obtain the total minutes
            long totalMinutes = totalSeconds / 60;

            // Compute the current minute in the hour
            long currentMinute = totalMinutes % 60;

            // Obtain the total hours
            long totalHours = totalMinutes / 60;
            long currentHour = totalHours % 24;


            //
            long millisInDay = 24l*60l*60l*1000l;

            long millisInYear = 365l*24l*60l*60l*1000l;// + 12*millisInDay;


            long years = totalMilliseconds / (millisInYear);
            long currentyear=years+1970l;
            long leapyears=leapyear((int)currentyear,1970);;
//        todo show professor


            long remMillisYear = totalMilliseconds % millisInYear;
            long days = (remMillisYear / millisInDay)-leapyears;
            long date=  (days%30) ;
            int month= (int) (1+(days/30.416));



//            System.out.println("years = "+years);



            System.out.println("today's date: "+date+"-"+month+"-"+currentyear);
            System.out.println("Current time is "
                    + currentHour + ":"
                     + currentMinute + ":"
                    + currentSecond + " GMT");

//            System.out.println(totalday+"  |||| "+day );


        }


        public static int leapyear(int cyear, int startyear){
            int count=0;
            for (int i = startyear; i <=cyear ; i++) {
                if(i % 4 == 0&& (!(i%100==0))||  i%400==0 ){
                    count++;
//                    System.out.println(i+ " ");
                }

            }
            return count;
        }

}