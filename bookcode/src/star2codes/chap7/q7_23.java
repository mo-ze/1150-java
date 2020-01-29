package star2codes.chap7;


public class q7_23 {

    /*
    (Game: locker puzzle) A school has 100 lockers and 100 students.
    All lockers are closed on the first day of school.
     As the students enter, the first student, denoted S1, opens every locker.
      Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker.
      Student S3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if it was closed).
      Student S4 begins with locker L4 and changes every fourth locker. Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.
      After all the students have passed through the building and changed the lockers, which lockers are open?
      Write a program to find your answer and display all open locker numbers separated by exactly one space.
     */
    public static void main(String[] args) {

        boolean[] myx=new boolean[4];
        myarrays.displayarr(myx);
        boolean[] a =new boolean[100];
        //all locker close
        System.out.println("initially close");
        myarrays.displayarr(a);
//        first student, denoted S1, opens every locker.
        System.out.println("after s1");

        togglearr(a);
        myarrays.displayarr(a);

        System.out.println("after s"+a.length);
        looping (a);

         myarrays.displayarr(a);
         System.out.print("Opened locker: \t");
         findtrue(a);

    }
    public static boolean[] togglearr(boolean[] a) {
        for (int i = 0; i <a.length ; i++) {
            if (a[i])
                a[i]=false;
            else{
                a[i]=true;

            }
        }

        return a;
    }
    public static boolean toggle(boolean a) {

           if (a)
               return false;
           else{
            return true ;


        }

    }


    public static boolean[] looping(boolean[] a ){

        for (int student = 2; student <a.length ; student++) {
            for (int locker = student; locker <a.length ; locker++) {

                if(locker%student==0){
//            trick
                   a[locker]= toggle(a[locker]);
                }

            }

        }
        return a;
    }

    public static void findtrue(boolean[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]){
                System.out.print("L"+(i+1)+ " ");
            }

        }
    }
}




