package star2codes.Other;
import java.util.Scanner;

public class question221 {
    public static void main(String[] args) {
//		(Financial application: calculate future investment value)
//		Write a program that reads in investment amount,
//		annual interest rate, and number of years, and displays the future
//		investment value using the following formula:
//		futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
//		For example, if you enter amount 1000, annual interest rate 3.25%,
//		and number of years 1, the future investment value is 1032.98.

        Scanner s = new Scanner(System.in);
        System.out.println("please enter amount");
        double invamm=s.nextDouble();
        System.out.println("please enter monthly rate");
        double rate=s.nextDouble();
        System.out.println("please enter years");
        int years=s.nextInt();
        s.close();


        int months=years*12;

        double futureInvestmentValue = invamm * Math.pow((1 + (rate/1200)),months);

        System.out.println(futureInvestmentValue+ invamm);




    }
}
