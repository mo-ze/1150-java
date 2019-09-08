package star2codes.chap5;

public class q5_25 {

    public static void main(String[] args) {
        double pi=0;
        for (int i = 0; i <10000 ; i++) {
            pi=  (4*(1+Math.pow(-1,i+1)/2*i-1));
        }
        System.out.println(pi);

    }


}
