package star2codes.chap5;

public class q5_7 {
    public static void main(String[] args) {
        double tuition=10000;
        double t10=0;
        double sum=0;
        for (int i = 1; i <= 14; i++) {
           tuition*=1.05;
           if (i==10){
               t10=tuition;
           }
           if (i>10){
               sum=sum+tuition;
           }
        }

    System.out.println("tution after 10 years: \t$ "+(int) t10);
        System.out.println("tution for 4 years: \t$ "+(int)sum);
    }
}
