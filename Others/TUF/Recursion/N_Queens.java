package Others.TUF.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N_Queens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solveNQueens(n));
    }
    static List<List<String>> solveNQueens(int n){
        List<List<String>> list = new ArrayList<>();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]='.';
            }
        }
        queen(0,arr,list);
        return list;
    }
    static  void queen(int col,char[][] arr,List<List<String>> list){
        if(col== arr.length){
            List<String> li = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                li.add(new String(arr[i]));
            }
            list.add(li);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (validate(arr,i,col)){
                arr[i][col]='Q';
                queen(col+1,arr,list);
                arr[i][col]='.';
            }
        }
    }
   static boolean validate(char[][] arr,int row,int col){
        int dup_row=row;
        int dup_col=col;
        while(col>=0){
            if(arr[row][col]=='Q'){
                return false;
            }
            col--;
        }
        col=dup_col;
        while (row>=0&&col>=0){
            if(arr[row][col]=='Q'){
                return false;
            }
            col--;
            row--;
        }
        col=dup_col;
        row=dup_row;
        while (row< arr.length&&col>=0){
            if(arr[row][col]=='Q'){
                return false;
            }
            col--;
            row++;
        }
        return true;
    }
}
