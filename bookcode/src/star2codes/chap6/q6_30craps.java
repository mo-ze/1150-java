package star2codes.chap6;

public class q6_30craps {
/*
    Roll two dice. Each die has six faces representing values 1, 2, ..., and 6, respectively.
    Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you lose;
    if the sum is 7 or 11 (called natural), you win;
    if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10),
    a point is established.
    Continue to roll the dice until either a 7 or the same point value is rolled.
    If 7 is rolled, you lose. Otherwise, you win.
 */

    public static void main(String[] args) {

    playgame();
    }
    public static void playgame(){
        System.out.println("_________________________"+" new game _________________________ \n");;
        // first roll find the point number
        int point = rollTwoDice(); int r = getresult(point);
        //find if sum is 7 or 11 (called natural)
        if (isNaturalOrCraps(r)){
            //if 7 or 11 (called natural) print you win
            printResult(r);

        }
        else {
            //else run the loop
            rollTillWinOrLose(r);

        }
    }


    /** rolls the Dice
     * @param
     * @return random number between 1-6
     */
    public static int rollDice() {
        int max=6;
        int min =1;
        int x= (int) ((Math.random() * ((max - min) + 1)) + min);
        return x;
    }

    /** rolls the Dice twice
     * @param
     * @return the sum of  randomnumber between 1-6
     *
     *
     */
    public static int rollTwoDice() {
        int dice1 = rollDice();
        int dice2 = rollDice();

        int sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        System.out.println();
        return sum;
    }


    /** @purpose this get the point from roll2dices then computes to check if thenumber is losing or winning
     * @param point from the sum of roll two dices
     * @return point
     *
     */
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

    /** displays if the player wins or lose
     *@param result that was passed from getresult
     * @return
     */
    public static void printResult(int result) {
        if (result == 0)
            System.out.println("You lose");
        else if (result == 1){
            System.out.println("You win");
        }
    }




    /**  naturalOrCraps returns true if you won lost False otherwise
     * @param result
     * @return boolean
     * */
    public static boolean isNaturalOrCraps(int result) {

        return result == 0 || result == 1;
    }


    /**  rollTillWinOrLose repeats rolling two dice until either
     a 7 or the same point value is rolled. then prints the result
     @param point
     @return
     */

    public static void rollTillWinOrLose(int point) {
        int result;

        do {
            result = rollTwoDice();
        }
        while (result != point && result != 7);

        if (result == 7){
            printResult(0);}
        else{
            printResult(1);
        }

    }



}



