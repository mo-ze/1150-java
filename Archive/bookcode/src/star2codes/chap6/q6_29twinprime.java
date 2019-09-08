package star2codes.chap6;

public class q6_29twinprime {
    public static void main(String[] args) {
       int  n=100;
       int count=0;
        for (int i = 0; i < n; i++) {
            if (twinprime(i)){
                System.out.println(i+","+(i+2));
                count++;
            }
        }
        System.out.println("count = "+count);
    }
    
    public static boolean twinprime(int i){
        if(mymath.isPrime(i)&&mymath.isPrime(i+2)){
            return true;
        }
        else return false;
    }

        
}
