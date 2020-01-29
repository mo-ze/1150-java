
public class trycatch {

    public static void main(String[] args) {
        try {
            int m = 5;
            System.out.println(m/0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString() );
        }
        finally {
//		      System.out.println("The 'try catch' is finished.");
        }
    }


}


