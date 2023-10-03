package Graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class FloodFill {
    public static void main(String[] args) {
        int arr[][] = {{0,0,0},{0,0,0}};
        int sr = 1;
        int sc = 0;
        int color = 2;
        Solution1 sol = new Solution1();
        sol.floodFill(arr,sr,sc,color);
        for (int[] ar :
                arr) {
            System.out.println(Arrays.toString(ar));
        }
    }
}
class Solution1 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int sou = image[sr][sc];
        if(sou==color){
            return image;
        }
        image[sr][sc]=color;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{sr,sc});
        while(!queue.isEmpty()){
            int ab[] = queue.poll();
            if(ab[0]-1>=0&&image[ab[0]-1][ab[1]]==sou){
                image[ab[0]-1][ab[1]]=color;
                queue.add(new int[]{ab[0]-1,ab[1]});
            }
            if(ab[0]+1<image.length&&image[ab[0]+1][ab[1]]==sou){
                image[ab[0]+1][ab[1]]=color;
                queue.add(new int[]{ab[0]+1,ab[1]});
            }
            if(ab[1]-1>=0&&image[ab[0]][ab[1]-1]==sou){
                image[ab[0]][ab[1]-1]=color;
                queue.add(new int[]{ab[0],ab[1]-1});
            }
            if(ab[1]+1<image[ab[0]].length&&image[ab[0]][ab[1]+1]==sou){
                image[ab[0]][ab[1]+1]=color;
                queue.add(new int[]{ab[0],ab[1]+1});
            }
        }
        return image;
    }
}
