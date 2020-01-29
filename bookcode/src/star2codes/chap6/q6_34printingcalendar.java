package star2codes.chap6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q6_34printingcalendar {
    public static void main(String[] args) {
        String daysofweek[] =new String[]{"S", "S", "M", "T","W","T","F"};

        Scanner s = new Scanner(System.in);
                System.out.println("type month in mm-yyyy format");
                String a=s.nextLine();
        s.close();


        if(a.charAt(0)!='0'&&a.charAt(0)!='1'||a.length()!=7 ||a.charAt(2)!='-'){
            System.out.println(a.length());
            throw new InputMismatchException("invalid format");
        }

        if(a.substring(0,2).equals("00") ||Integer.parseInt( a.substring(0,2))>12  ){
            System.out.println(a.substring(0,2));
            throw new InputMismatchException("Month cant be 0 or biiger than 12");
        }




        printarr(daysofweek);
        makecal("01-"+a);




    }
    public static void printarr(String arr[]){
        for (String z:arr) {
        System.out.print(z+"\t");
        }
        System.out.println();
    }

    public static void printcal(String [][] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==null){System.out.print(" "+"\t");}
                else System.out.print(arr[i][j]+"\t");

            }
            System.out.println();
        }
    }
    public static void makecal(String a){
       int month=Integer.parseInt( a.substring(3,5));
      int startfrom= zeller(a);
        String[][] cal=new String[5][7];
        int count=1;
        for (int i = 0; i <cal.length ; i++) {
            for (int j = startfrom; j < cal[i].length; j++) {

                cal[i][j]=count+"";
//               todo  trick placement
                if(count==totaldayinmonth(month)){break;}
                count++;
                

            }
            startfrom=0;


        }
        printcal(cal);
    };
    public static int zeller(String a){
        String[] ar=a.split("-");
        int d= Integer.parseInt(ar[0]);
        int m= Integer.parseInt(ar[1]);
        int y= Integer.parseInt(ar[2]);
// TODO: 2019-08-04 trick condition
        if(m<3){
            m+=12;
            y-=1;
        }

        int k = y % 100;
        int j = y / 100;
        int h=((((d+(((m+1)*26)/10)+k+(k/4)+(j/4))+5*j))%7);
        return (h);

    }
    public static int totaldayinmonth(int m ){
       switch (m){
           case 1:return 31;
           case 2:return 28;
           case 3:return 31;
           case 4: return 30;
           case 5:return 31;
           case 6:return 30;
           case 7: return 31;
           case 8:return 31;
           case 9:return 30;
           case 10: return 31;
           case 11:return 30;
           case 12: return 31;
       }

        return 0;
    }
}
