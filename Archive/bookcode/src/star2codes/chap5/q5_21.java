package star2codes.chap5;

public class q5_21 {
    public static void main(String[] args) {
        int loan=10000;
        int year=5;
        System.out.println("loan: "+loan);
        System.out.println("year: "+year);

        System.out.println("interest rate \t montly payment \t total payment ");
        for (double i = 5; i <= 8; i=i+0.125) {
//            System.out.println(i%10);
            // TODO: 2019-08-10 monthly interest rate 
           double monthlyInterest=i/1200;
//           System.out.println(monthlyInterest);
            // TODO: 2019-08-09 tricky formula
           double ans=mymath.interestR(loan,monthlyInterest,year);

            double totalpayment=ans*12*year;
            ans=mymath.myround(ans,2);
            totalpayment=mymath.myround(totalpayment,3);
           System.out.println(i+" \t"+"\t"+ans+" \t\t "+totalpayment);

        }
    }


}
