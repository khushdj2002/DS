package Graph;

import java.util.*;

public class Matrix01 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        sol.updateMatrix(mat);
        for (int[] at :
                mat) {
            System.out.println(Arrays.toString(at));
        }
    }
}

class Solution3 {
    public int[][] updateMatrix(int[][] mat) {
        boolean[][] check = new boolean[mat.length][mat[0].length];
        Queue<int[]> queue = new ArrayDeque<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    queue.add(new int[]{i,j});
                    check[i][j]=true;
                }
            }
        }
        int drow[] = {-1,1,0,0};
        int dcol[] = {0,0,-1,1};
        int count=0;

        while(!queue.isEmpty()){
            int size = queue.size();
            count++;
            for(int i=0;i<size;i++){
                int m[] = queue.poll();
                for(int j=0;j<4;j++){
                    int r = m[0]+drow[j];
                    int c = m[1]+dcol[j];
                    if(r<0||c<0||r>=mat.length||c>=mat[r].length||check[r][c]){
                        continue;
                    }
                    mat[r][c]= count;
                    check[r][c]=true;
                    queue.add(new int[]{r,c});
                }
            }
        }
        return mat;
    }
}
