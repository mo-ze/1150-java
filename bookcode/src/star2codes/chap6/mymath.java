package star2codes.chap6;

public class mymath {

    public static boolean isPrime(int number) {
        if (number==1||number==0){
            if(number==1){System.out.println("1 is not a prime due to the fundamental theorem of arithmetics ");}
            return false;
        }else{
            for (int divisor = 2; divisor <= number/2; divisor++) {
                if (number % divisor == 0) {
                    return false;
                }
            }
            return true;
        }}

    public static double myround(double val,int dp){
        double scale = Math.pow(10, dp);
        return Math.round(val * scale) / scale;

    }
    public static double squared(double val){
        double s = Math.pow(val, 2);
        return s;

    }
    public static double cube(double val){
        double s = Math.pow(val, 3);
        return s;

    }
    public  static  int myrandom(int min, int max ){
        return (int)(Math.random() * ((max - min) + 1)) + min;

    }


}
