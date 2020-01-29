

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        displaymsg("enter 0 for rock, 1 for paper, or  2 for Scissor");
        int C = s.nextInt();

        s.close();
        rps(C);

    }

    public static void displaymsg(String alertmsg) {
        System.out.println(alertmsg);}

    public static String numbertostr(int num){
        if(num==0){ return "rock";}
        else if(num==1){return "paper";}
        else if(num==2){return "scissor";}
        else return "invalid";
    }

    public static void rps(int umove) {

        int pcmove = 0;//(int) (Math.random() * 3);
        if (pcmove == umove) {
            displaymsg("tied we chose "+ numbertostr(pcmove));
        } else if (pcmove == 0 && umove == 1) {
            displaymsg("paper beat rock; you win;\n mychoice  " + numbertostr(pcmove) + "\n your choice " + numbertostr(umove));
        } else if (pcmove == 1 && umove == 0) {
            displaymsg("paper beat rock I win; \n mychoice  " + numbertostr(pcmove) + "\n your choice " + numbertostr(umove));
        } else if (pcmove == 2 && umove == 0) {
            displaymsg("rock beat scissor I win;\n mychoice  " + numbertostr(pcmove)+ "\n your choice " + numbertostr(umove));
        } else if (pcmove == 0 && umove == 2) {
            displaymsg("rock beat scissor you win;\n mychoice " + numbertostr(pcmove) + "\n your choice " + numbertostr(umove));
        } else if (pcmove == 1 && umove == 2) {
            displaymsg("scissor beat paper you win;\n mychoice " + numbertostr(pcmove) + "\n your choice " + numbertostr(umove));
        } else if (pcmove == 2 && umove == 1) {
            displaymsg("scissor beat paper I win; \n mychoice " + numbertostr(pcmove) + "\n your choice " + numbertostr(umove));
        } else {
            displaymsg("invalid input ");
        }

    }
}