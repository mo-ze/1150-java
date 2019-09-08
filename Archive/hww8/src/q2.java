public class q2 {
// @note if you are seeing this, the professor said that it is not supposed to be
//    efficient as any other random number generators in java
//    the description also did not say that
//    we have to ask the user to input max and min #

// TODO: 2019-06-29 documentation needed
/*
 *@purpose main method
 *@param  string[] args
 *@return
 *
 */
    public static void main(String[] args) {
        int  min=9;
        int max=100;
        int random=(int)randomgen( min, max);
        System.out.println(random );
        return;

    }



    // TODO: 2019-06-29 documentation needed
    /*
     *@purpose to generate a random num between min and max
     *@param min; max
     *@return the randomnumber
     *
     */
    public static int randomgen(int min, int max){
//        int a=(int)   ((System.currentTimeMillis()/10)%10l);

        double a= (double) (System.currentTimeMillis()%max)+min;
//                %10l)  * ((max - min) )) + min)   ;
    int b= (int) a;
        return b;
    }
}
