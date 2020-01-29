public class q4craps {

    public static void main(String[] args) {

        int point = rollTwoDice();
        int r = getresult(point);

         if (isNaturalOrCraps(r))
            printResult(r);
        else {
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
        System.out.println();;
        return sum;
    }




    /** @purpose this get the point from roll2dices then computes to check if thenumber is losing or winning
     * @param point from the sum of roll two dices
     * @return point
     *
     */
    public static int getresult(int point) {
       switch (point) {
            case 2  :
            case 3  :
            case 7  :
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
        else if (result == 1)
            System.out.println("You win");
    }

    /**  naturalOrCraps returns true if you won lost. False otherwise
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
        else
            printResult(1);
    }
}



