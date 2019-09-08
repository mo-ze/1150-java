package star2codes.chap7;

public class q7_21 {


    public static void main(String[] args) {
        int ball=5;
        int slot=8;
        int[] slots=new int[slot];
        System.out.println("balls =" +ball);
        System.out.println("slot =" +slot);
        System.out.println();
        System.out.println();
        System.out.print("moves\t| Which Slot \n________|________\n");
        myarrays.displayarr( ThrowMultiple(slots,slot,ball));
        System.out.println("\n");
        DisplaySlots(slots);
    }
    public static void DisplaySlots(int[] slots)
    {
        int max = slots[0];
        for (int slot = 0; slot < slots.length; slot++)
        {
            if(slots[slot] > max)
            {
                max = slots[slot];
            }
        }

        for(int line = max; line > 0; line--)
        {
            for (int slot = 0; slot < slots.length; slot++) {
                if(slots[slot] >= line)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int CountCharInaString(String S,Character charact){
        int count=0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)==charact){
                count++;
            }

        }
        return count;
    }
    public static Character RorL(){
         int m= (int) (Math.random() * 2);

        if (m==0){
            return 'R';
        }else{
            return 'L';
        }
    }
    public static String ballpath(int slot){
        String ballpath=RorL()+"";
        for (int i = 0; i < slot - 2; i++) {
            ballpath+= RorL();
        }

        return ballpath;

    }
    //put the ball where it belongs
//
    public static int[] put(int[] arr,int slot){
        String bp=ballpath(slot);
        int a=CountCharInaString(bp,'R');
//        System.out.println(bp);
        System.out.printf(bp+"\t\t"+a+"\n");


        arr[a-1]+=1;
        return arr;
    }

    //throw several balls
    public  static int[] ThrowMultiple(int[] arr,int slot,int ball){

        for (int i = 0; i <ball; i++) {
            put( arr, slot);
        }

        System.out.println("\nslot array");
        return arr;

    }
}
