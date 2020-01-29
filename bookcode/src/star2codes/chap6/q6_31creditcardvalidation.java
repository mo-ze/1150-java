package star2codes.chap6;

import java.util.Scanner;

public class q6_31creditcardvalidation {
    /*
     *@purpose main method
     *@param  string[] args
     *@return
     *
     */
    public static void main(String[] args) {
        //here are number sample for Credit cards.
        // 5311525555653970;
        //4847352989263095 ;
        // 343375180827968;
        // 6011849132886155;
        //4847352989263094;

        System.out.println(main2());

    }

    /*
     *@purpose to return the correct statement depending on the condition; replication of the main
     *@param
     *@return String
     *
     */
    public static String main2(){
        try {

            Scanner s = new Scanner(System.in);
            long ccnum = getinput(s);
            if (check1(ccnum)){
                return (
                        "the "+ Type(ccnum)+ " card with the number: "+ccnum+" is " +luhncheckstr(ccnum)+"!!!"
                );
            }
            else
                return (ccnum +" is invalid");
        }
        catch (Exception InputMismatchException){
            return ("Not a Number");
        }

    }

    /*
     *@purpose to get the ccnum
     *@param scanner object
     *@return ccnum
     *
     */

    public static Long getinput(Scanner s){
        System.out.println("enter creditcard number wihtout hyphen and spaces ");
        return s.nextLong();

    }
    /*
     *@purpose to check if ccnum is the correct amount of number
     *@param ccnum
     *@return true or false
     *
     */

    public static boolean check1(long ccnum){

        String ccnumstr=Long.toString(ccnum);
        return (ccnumstr.length()==16)?true:false;

    }

    /*
     *@purpose convert luhncheck to string
     *@param ccnum
     *@return "valid"or"invalid"
     *
     */

    public static String luhncheckstr(long ccnum){
        return  luhncheck(ccnum)? "valid":"invalid";


    }

    /*
     *@purpose luhncheck validation (go and read about it )
     *@param ccnumber
     *@return true or false
     *
     */

    public static boolean luhncheck(long ccnum){

        return (sumofeverything(ccnum)%10==0)? true:false;
    }

    /*
     *@purpose takes from the oddplaces and add it to sumofevenplaces
     *@param long ccnumber
     *@return sum of everything
     *
     */
    public static int sumofeverything( long ccnum){

        return sumofevenplaces(ccnum)+sumofoddplaces(ccnum);
    }
    /*
     *@purpose add up oddplaces
     *@param ccnumber
     *@return sum of oddplaces
     *
     */
    public static int sumofoddplaces(long ccnum){
        String ccnumstr=Long.toString(ccnum);

        int sum=0;
        for (int i=0;i<=ccnumstr.length()-1;i++){
            if(i%2!=0){
                sum=sum+Integer.parseInt(""+ ccnumstr.charAt(i));
            }
        }
        return sum;
    }
    /*
     *@purpose  works with  cut down places to add even places
     *@param ccnumber
     *@return sum of evenplaces
     *
     */
    public static int sumofevenplaces(long ccnum){

        String ccnumstr=Long.toString(ccnum);



        int sum=0;

        for (int i=0;i<=ccnumstr.length()-1;i++){

            if(i%2==0){
                //even

                if (Integer.parseInt(""+  ccnumstr.charAt(i)) < 5){
                    //less than 5
                    sum=sum+ (Integer.parseInt(""+ ccnumstr.charAt(i))*2);

                }
                else{
                    sum=sum+cutdownplaces((Integer.parseInt(""+ ccnumstr.charAt(i))));

                }
            }
        }


        return sum;
    }

    /*
     *@purpose cut down the param and returns sum of number
     *@param even places of the  ccnumber which is greater than 5
     *@return sum of evenplaces
     *
     */
    public static int cutdownplaces(int  partofccnum){
        // 16 -->1+6=7
        int pccnum2=partofccnum*2;


        String pccnum=Integer.toString(pccnum2);

        int sum=0;
        char num1char=pccnum.charAt(0);
        char num2char= pccnum.charAt(1);

        int num1=Integer.parseInt( ""+ num1char ) ;
        int num2=  Integer.parseInt(""+num2char);

        sum=num1+num2;




        return sum;
    }
    /*
     *@purpose  works with  cut down places to add even places
     *@param ccnumber
     *@return type of cc depending on the first 2 number
     *
     */
    public static String Type(long  ccnum){
        String qq =ccnum+"";
        String qchar1=qq.charAt(0)+"";
        int a=Integer.parseInt(qchar1);
        int ifamex= Integer.parseInt( qq.charAt(1)+"");
        String b="";
        if (ifamex==7&&a==3){
            b="American Express";

        }else{
            switch (a){
                case 4:
                    b= "Visa" ;
                    break;

                case 6:
                    b= "Discover" ;
                    break;
                case 5:
                    b= "MasterCard" ;
                    break;


            }}
        return b;
    }

}
