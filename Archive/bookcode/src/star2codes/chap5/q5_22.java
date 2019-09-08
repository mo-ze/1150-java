package star2codes.chap5;

public class q5_22 {
    public static void main(String[] args) {
       double loan=10000;
       double years=1;
       double monthly=years*12;
       double InterestRate=7;
//       todo trick annual interest rate.... annually


       double monthlyI=InterestRate/1200;
       double ans=mymath.interestR(loan,monthlyI,years);
       System.out.println("Monthly payment: "+ ans);
       double tpayment=ans*12;
       System.out.println("total payment: "+tpayment);
       System.out.println("payment# \t\t interest \t\t principal  \t\t balance");
      double  balance=loan;
      double interest=0;
      double principal=0;
        for (int i = 1; i <= monthly; i++) {
            interest=(balance*InterestRate/100)/12;
           principal=ans-interest;
           balance=balance-principal;

            System.out.print(i+" \t\t"+interest+" \t\t "+principal+" \t\t "+balance);
            System.out.println();



        }
    }
}
