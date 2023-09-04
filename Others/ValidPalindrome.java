package Others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "bcbab";
        int[] startIndex={1,1,2};
        int[] endIndex={4,3,3};
        int[] subs={3,3,0};
        int[][]querry= new int [startIndex.length][3];
        for (int i = 0; i < startIndex.length; i++) {
            querry[i][0]=startIndex[i];
            querry[i][1]=endIndex[i];
            querry[i][2]=subs[i];
        }
        List<Boolean> list = new ArrayList<>();
        list = new ArrayList<>(canMakePaliQueries(s,querry));
        StringBuilder res= new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)){
                res.append('1');
            }
            else {
                res.append('0');
            }
        }

        System.out.println(res.toString());

    }
    static public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> res = new ArrayList();

        if (queries.length == 0) {
            return res;
        }
        int[] countArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int prev = (i == 0) ? 0 : countArray[i - 1];
            int idx = s.charAt(i) - 'a';
            countArray[i]= (prev^(1<<idx));
        }
        for (int[] q : queries) {
            //simple case - query of 1 character is always a palindrome
            if (q[0] == q[1]) {
                res.add(true);
                continue;
            }
            int p = q[0] == 0 ? 0 : countArray[q[0] - 1];
            int counts = (p^countArray[q[1]]);
            res.add((Integer.bitCount(counts) / 2)<= q[2]);
        }

        return res;
    }
}
