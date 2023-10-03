package Graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {
        Solution ssol = new Solution();
        int[][] arr = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(ssol.orangesRotting(arr));
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int count_fresh = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    count_fresh++;
                }
            }
        }
        int curr = -queue.size();
        int[] drow = {-1,1,0,0};
        int[] dcol = {0,0,-1,1};
        int countMin = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            curr=curr+size;
            for(int i=0;i<size;i++){
                int[] p = queue.poll();

                for(int j=0;j<4;j++){
                    int r = p[0]+drow[j];
                    int c = p[1]+dcol[j];
                    if(r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]==0||grid[r][c]==2){
                        continue;
                    }
                    grid[r][c]=2;
                    queue.add(new int[]{r,c});
                }

            }
            if(!queue.isEmpty()){
                countMin++;
            }
        }
        if(count_fresh!=curr){
            return -1;
        }
        return countMin;
    }
}