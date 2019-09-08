package star2codes.chap7;

import java.util.Arrays;

public class q7_24 {
    // TODO: 2019-07-07 the collector

    /*
    Simulation: coupon collector’s problem) Coupon collector is a classic statistics problem
    with many practical applications.
    The problem is to pick objects from a set of objects repeatedly
    and find out how many picks are needed for all the
    objects to be picked at least once.
    A variation of the problem is to pick cards from a shuffled deck of 52 cards repeatedly
    and find out how many picks are needed before you see one of each suit.
    Assume a picked card is placed back in the deck
    before picking another.
    Write a program to simulate the number of picks needed to get four cards from each suit
    and display the four cards picked
    (it is possible a card may be picked twice).

     */
    public static void main(String[] args) {
        int[] noar = new int[4];
        String[] suitar=new String[4];
        String[] resultarr = new String[4];
        looping(noar,resultarr,suitar);
        for (int i = 0; i < noar.length; i++) {
            resultarr[i] = cardtoString(noar[i]) + " of " + getsuit(noar[i]);
            suitar[i]=getsuit(noar[i]);
        }
        myarrays.displayarr(noar);
        myarrays.displayarr(suitar);
        myarrays.displayarr(resultarr);
    }


// TODO: 2019-07-10  trick the array to check if item already exists

    public static boolean checkitemsinArray(String tocheck,String[] arr){
        boolean dublicateitemsExists=true;

        // if tocheck does not exist return true else return false
        for (int i = 0; i < arr.length-1; i++) {
                if ((tocheck.equals( arr[i]))){
                    dublicateitemsExists=false;
                    break;
            }

        }
        return dublicateitemsExists;
    }

    public static  void looping(int[] noar,String[] arr,String[] suitar){
    int count=0;
        for (int i = 0; i < arr.length; i++) {
            count++;
                int r = (pickCard());
                String s=getsuit(r);
                if(checkitemsinArray(s,suitar)) {
                    noar[i] = r;
                    arr[i] = cardtoString(r) + " of " + getsuit(r);
                    suitar[i] = getsuit(noar[i]);
                }
                else {
                    i=i-1;}
        }
    System.out.println(count);
        }

    public static int pickCard() {
        return (int) (Math.random() * 52);
    }

    public static String getsuit(int card) {
        int suit = card / 13;
//        System.out.println("suit " + suit);
//        System.out.println("------------");
        String sstr = "";
        switch (suit) {
            case (0):
                sstr = "Spades";
                break;
            case (1):
                sstr = "Hearts";
                break;
            case (2):
                sstr = "Diamond";
                break;
            case (3):
                sstr = "Clubs";
                break;
        }
        return sstr;
    }

    public static String cardtoString(int card) {
        int cardno = card % 13;
        String[] cards = new String[]{2 + "", 3 + "", 4 + "", 5 + "", 6 + "", 7 + "", 8 + "", 9 + "", 10 + ""
                , "jack", "queen", "king", "ace"};

        return cards[cardno];
    }


}
