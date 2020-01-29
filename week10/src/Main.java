import java.util.Scanner;

public class Main {

    public static String[] Stack = new String[100];
    public static int top = -1;
    public static boolean c = true;


    public static void main(String[] args) {


        String what = "Enter a webpage to visit \n"
                + "================== \n" +
                " (or b to go back to last page, \n"
                + "================== \n" +
                "s to stop this program,\n" +
                "=================== \n" +
                " d to display the current browser history,\n"
                + "================== \n" +
                " t to display the current top value and the item at the top of the stack)";

        Scanner s = new Scanner(System.in);
        int count = 0;
        while (c) {
            System.out.println(what);
            String a = s.nextLine();
            switching(a);
            count++;
            System.out.println();

        }

        s.close();


    }


    public static void switching(String a) {
        switch (a) {
            case "b":
                pop();
                break;
            case "t":
                displaytop();
                break;
            case "d":
                display();
                break;
            case "s":
                stop();
                break;
            default:
                push(a);
                break;

        }
    }


    public static void display() { //onclick d

        if ((top > 0)) {
            for (int i = top; i >= 0; i--) {
                System.out.println(Stack[i]);
            }
            System.out.println();
        } else {
            System.out.println("nothing to display");
            System.out.println();
        }
    }

    public static void displaytop() {// onclick t
        if ((top > 0)) {
            System.out.println("Current TOP value: " + top + ", item at top: " + Stack[top]);
            System.out.println();
        } else {
            System.out.println("Current TOP value: " + top + ", Empty Stack!!! ");
            System.out.println();
        }

    }

    public static void stop() { //onclick s
        c = false;
        System.out.println(" Program Stopped at top position: " + top);
        System.out.println();
    }

    public static String pop() {   // on-click b


        if (top <= 0) {
            System.out.println("no webpage in history \n");
        } else {
            System.out.println("removing " + Stack[top]);
            top--;
            System.out.println("Currently visiting " + Stack[top]);
            return Stack[top + 1];
        }
        return null;
    }


    public static void push(String a) {
//    default
        if (top < Stack.length - 1) {
            increment();
            Stack[top] = a;
            System.out.println("Currently Visiting " + Stack[top]);
        } else {
            System.out.println("Stack is full!!!!! losing the last webpage " + Stack[0]);
            String temp = "";
            for (int i = 1; i <= Stack.length - 1; i++) {
                temp = Stack[i];
                Stack[i - 1] = temp;
            }

            Stack[top] = a;
            System.out.println("Currently Visiting " + Stack[top]);
        }
    }


    public static int increment() {
        return top = top + 1;
    }


}
