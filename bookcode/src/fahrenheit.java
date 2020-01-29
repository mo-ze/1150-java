import java.util.Scanner;

public class  fahrenheit {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("please enter farenhiet");
        int f = s.nextInt();
        s.close();
        double celcius=((double)5/9)*(f-32);
        System.out.println(celcius);


    }
}

