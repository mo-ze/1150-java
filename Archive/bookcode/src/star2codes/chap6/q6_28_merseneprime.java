package star2codes.chap6;

public class q6_28_merseneprime {
    public static void main(String[] args) {
        System.out.println("I"+"\t|\t"+"(2^I)-1");
        System.out.println("____|__________");
        for (int i = 1; ; i++) {
        if (mersene(i)>31) break;
        
        if(checkmersene(i)){
               System.out.println(i+"\t\t"+mersene(i));
        }
        ;

    }}
    public static int mersene( double x){
        return (int) (Math.pow(2,x)-1);
    }
    public static boolean  checkmersene(double x ){

      if (mymath.isPrime(mersene(x))){
          return true;
      }else return false;

    }








}
