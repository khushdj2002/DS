package String;

import java.util.Scanner;

public class Lexologically {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for (int i = 1; i <= s.length() - k; i++) {
            String a=s.substring(i,k+i);
            if (smallest.compareTo(a)>0){
                smallest=a;
            }
            if (largest.compareTo(a)<0){
                largest=a;
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
