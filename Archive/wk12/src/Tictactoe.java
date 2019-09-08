import java.util.Scanner;

public class Tictactoe {

    public static void main(String[] args) {



        int boardsize = 3;
        char[][] board = new char[boardsize][boardsize];

        initfillarr(board);

        System.out.println("tic tac toe");
        displayarr(board);
        Scanner s = new Scanner(System.in);

        while (true) {

            int uiX = s.nextInt();
//            if(!istaken(uiX,board)){


//            }else{
            putXorOs(uiX, board, "X");
//        }



            displayarr(board);

            if (wininaHorizontalline(board) || wininaverticalline(board) || wininmajordiagnal(board) || winInMinorDiagnal(board)) {
                break;
            }
            if (drawcondition(board)) {
                System.out.println("a draw condition has been reachEd ");
                break;
            }

            /*____________________________________________________________________*/
            System.out.println(" player O goes then");
            int uiO = s.nextInt();

//            if(!istaken(uiO,board)){
//                System.out.println("error number taken");
//                System.out.println(" O goes now");
//                uiX = s.nextInt();

//            }else {
                putXorOs(uiO, board, "O");
//            }




            displayarr(board);
            if (wininaHorizontalline(board)
                    || wininaverticalline(board)
                    || wininmajordiagnal(board)
                    || winInMinorDiagnal(board)) {
                break;
            }
            if (drawcondition(board)) {
                System.out.println("a draw condition has been reachEd ");
                break;
            }

        }
        s.close();

    }
  public static boolean validation(int ui){
//        ui is lees than 9 and bigger than 0
        if(ui>0 &&ui<9){
            return true;
        }else{
            return false;
        }
  }

  public static boolean istaken(int ui, char[][] b){
        boolean l =true;

        int count=0;int value=0;
      for (int i = 0; i < b.length; i++) {

          for (int j = 0; j < b[i].length; j++) {
              if(b[i][j]==("5".charAt(0))){
                  break;

              }else {
                  count++;
                  }
          }

          if(value==1){break;}
          
      }

      if(count==9){l= false;}

      System.out.println(l);
        return l;
  }

    public static boolean drawcondition(char[][] b) {
//        for every pos taken count ++
        int count=0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                if(b[i][j]=='X'||b[i][j]=='O' ){
                    count++;
                }
            }
        }
        System.out.println("\n total pieces by both player "+count+"\n ");
        if(count==9){
            return true;
        }else{
            return false;
        }
    }


    public static void displayarr(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("|___" + board[i][j] + "___|");
            }
            System.out.println();
        }
    }

    public static void initfillarr(char[][] b) {
        int count = 0;
        int REDIX = 10;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                count++;
                char c = Character.forDigit(count, REDIX);
                b[i][j] = c;
            }

        }
    }

    public static void putXorOs(int ui, char[][] b, String whattoputin) {
        int REDIX = 10;
        char m = Character.forDigit(ui, REDIX);

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] == m) {
                    b[i][j] = whattoputin.charAt(0);
                }

            }

        }
    }

    public static boolean wininaHorizontalline(char[][] b) {
        boolean a = false;
        for (int i = 0; i < b.length; i++) {
            int j = 0;
            if (b[i][j] == b[i][j + 1]) {
                if (b[i][j + 1] == b[i][j + 2]) {
                    System.out.println(b[i][j + 2] + "wins by row ");
                    a = true;
                    break;
                }
            }

            if (a) {
                break;
            }
        }


        return a;
    }

    public static boolean wininaverticalline(char[][] b) {
        boolean a = false;
        int i = 0;
        for (int j = 0; j < b[i].length; j++) {
            if (b[i][j] == b[i + 1][j]) {
                if (b[i + 1][j] == b[i + 2][j]) {
                    System.out.println(b[i + 2][j] + " wins by column");
                    a = true;
                    break;
                }
            }
            if (a) {
                break;
            }
        }


        return a;
    }

    public static boolean wininmajordiagnal(char[][] b) {
        boolean a = false;
        if (b[0][0] == b[1][1] && b[1][1] == b[2][2]) {
            a = true;
            System.out.println(b[2][2] + " win by the major diagnal");
        }


        return a;
    }

    public static boolean winInMinorDiagnal(char[][] b) {
        boolean a = false;
        if (b[0][2] == b[1][1] && b[1][1] == b[2][0]) {
            a = true;
            System.out.println(b[2][0] + "win minor diagnal ");


        }
        return a;

    }








}
