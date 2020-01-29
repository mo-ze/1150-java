package star2codes.chap6;

public class q6_32playcraps10000times {
    /*
    public class q6_32playcraps10000times {
 (Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times and display the number of winning games.

   */

    public static void main(String[] args) {
        int count=0;
        int playtimes=100;
        for (int i = 0; i < playtimes; i++) {

        if (playgame()){
            count++;
        }}
        System.out.println( "You win "+ count+" times ");
    }
    public static boolean playgame(){
        boolean game1;
        int point = rollTwoDice();
        int r = getresult(point);

        if (isNaturalOrCraps(r)){
            game1=printResult(r);
        }
        else {

            game1=rollTillWinOrLose(r);
        }
        return game1;
    }



    public static int rollDice() {
        int max=6;
        int min =1;
        int x= (int) ((Math.random() * ((max - min) + 1)) + min);
        return x;
    }


    public static int rollTwoDice() {
        int dice1 = rollDice();
        int dice2 = rollDice();

        int sum = dice1 + dice2;

        return sum;
    }


    public static int getresult(int point) {
        switch (point) {
            case 2  : point = 0; break;
            case 3  : point = 0; break;
            case 7  : point = 1; break;
            case 12 : point = 0; break;
            case 11 : point = 1; break;
        }
        return point;
    }

    public static boolean printResult(int result) {

       if (result == 1){
            return true;
        }else   return false;

    }
    public static boolean isNaturalOrCraps(int result) {

        return result == 0 || result == 1;
    }



    public static boolean rollTillWinOrLose(int point) {
        int result;
    boolean r=false;
        do {
            result = rollTwoDice();
        }
        while (result != point && result != 7);

        if (result == 7){
           r= printResult(0);}
        else{
           r= printResult(1);
        }
        return r;

    }






}



