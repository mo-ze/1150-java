package star2codes.chap7;

import java.util.Scanner;

public class q7_17 {
//    (Sort students) Write a program that prompts the user to enter the number of students, the students’ names,
//    and their scores,
//    and prints student names in decreasing order of their scores.

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of student");
        int n=s.nextInt();

        String[] students=new String[n];

        int[] mark=new int[n];

        for (int i = 0; i < students.length; i++) {
            System.out.println(" enter student name ["+i+"]");
            s.nextLine();
            students[i]=s.nextLine();
            System.out.println("enter the marks for ["+students[i]+"]");
            mark[i]=s.nextInt();
            
        }

        s.close();
        System.out.print("student");
        myarrays.displayarr(students);
        System.out.print("marks");
        myarrays.displayarr(mark);
        System.out.println("sorted");
//        special selection sort
        selectionsort(mark,students);


    }
    //            sort 2 array  by X
    public static void selectionsort(int[]X,String[] A){
        int length=X.length;
        for (int i = 0; i < length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < length; j++) {
                if (X[j] < X[minpos]) {
                    minpos = j;
                }
            }
//            todo sort them together

            int temp = X[minpos];
            X[minpos] = X[i];
            X[i] = temp;


            String temp1=A[minpos];
            A[minpos]=A[i];
            A[i]=temp1;
        }
        myarrays.displayarr(X);
        myarrays.displayarr(A);
    }
}