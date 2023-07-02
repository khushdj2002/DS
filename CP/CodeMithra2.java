package CP;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CodeMithra2 {
    /* package whatever; // don't place package name! */



    /* Name of the class has to be "Main" only if the class is public. */


        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int ar[][] = new int[a][];

            System.out.println(ar.length);
            for(int i=0;i<ar.length;i++){
                ar[i]=new int[sc.nextInt()];
//                int b = sc.nextInt();
//                ar[0][0]=7;
                System.out.println(ar[0][0]);
                for(int  j=0;j<ar[i].length;j++){
                    ar[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<ar.length;i++){
                for(int j=ar[i].length-1;j>=0;j--){
                    System.out.print(ar[i][j]+" ");
                }
                System.out.println();
            }
        }
}
