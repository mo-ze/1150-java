
public class q1 {
    /*
     * Generate a random String of length 8 containing lower and upper case letters and d
     *
     */

    public static void main(String[] args) {
        //generate number between 48-57
        //between 65-90
        //between 97-122


        int randomnum=(int)(Math.random()*26)+65;	//UPPERcase A-Z
        int randomnum1=(int)(Math.random()*10)+48; //digits 1-9
        int randomnum2=(int)(Math.random()*26)+97; //lowercase a-z

        // convert to char
        char c=(char) randomnum;
        char d=(char) randomnum1;
        char e =(char) randomnum2;


        //apend to string

        String s=""+c+d+e;

//		System.out.println(s+" "+s.length());

        //for loop
        for(int i=0;i<=4;i++) {
            //get a random number between 1-3
            int b=(int)(Math.random()*3);
            //switch on b
            switch (b) {
                //when b=0
                case 0:
                    //UPPERcase A-Z
                    int tt=(int)(Math.random()*26)+65;
                    s=s+(char)tt;
                    break;
                case 1:
                    //0-9
                    int rr=(int)(Math.random()*10)+48;
                    s=s+(char)rr;
                    break;
                case 2:
                    //lowercase a-z
                    int yy=(int)(Math.random()*26)+97;
                    s=s+(char)yy;
                    break;
            }
        }
        //return string
        System.out.println(s);
        //return len of string
        System.out.println("lenght of S "+s.length());



    }

}



