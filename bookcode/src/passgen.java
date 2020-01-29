public class passgen {

    public static void main(String[] args) {
        char[] arr=new char[]{'a','b','c'};
        passgen(arr);
    }
    public static String passgen(char[]arr){
        String s="";
        for(int i=0;i<arr.length;i++){
            int r= (int) (Math.random() * 3);
            s+=arr[r];
        }
        System.out.println(s);
        return s;
    }


}
