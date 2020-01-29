package star2codes.chap6;

public class q6_27emirps {

//    emirps prime spelled backwards
    public static boolean isPrimeNumber(int x) {
        if (x == 2 ) {
            return true;
        }
        if (x % 2 == 0) {
//            System.out.println("not prime");
            return false;
        }

        for (int i = 3; i < x/2; i += 2) {
            if (x % i == 0) {
//                System.out.println("not prime");

                return false;

            }
        }
        return true;
    }
    public static int reverse(int x){
        String y=Integer.toString(x);
        String rev="";
        int l=y.length();
//        for(i=l-1 to 0 with i--)
//        rev=+y[i]

        for(int i=l-1;i>=0;i--){
            rev=rev+ y.charAt(i);

        }
        return Integer.parseInt(rev);
    }
    public static boolean ispalindrome(int x) {
        int y=reverse(x);
        int z=reverse(y);


        return y==z;
    }
    public static boolean isemirp(int x){
        if(!ispalindrome(x)&&isPrimeNumber(x)&&isPrimeNumber( reverse(x))){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {

        int count=0;
        int max=100;
        for (int i = 0;i<100000 ; i++) {
            if (isemirp(i)){
                count++;
                if(count%10==0){
                    System.out.println(i);
                }else
                System.out.print(i+" ");
            }
            if (count==max){
                break;
            }
        }
    }
}
