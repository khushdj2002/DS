package Graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] land = {{0,1,1,0},{0,1,1,0},{0,0,1,0},{0,0,0,0},{1,1,0,1}};
        boolean[][] check = new boolean[land.length][land[0].length];
        int count=0;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j]==1&&!check[i][j]){
                    count++;
                    int[] a = {i,j};
                    queue.add(a);
                    while (!queue.isEmpty()){
                        int[] b = queue.poll();
                        int c  = b[0];
                        int d = b[1];
                        for (int k = -1; k <2 ; k++) {
                            for (int l = -1; l <2 ; l++) {
                                if(c+k>=0&&c+k< land.length){
                                    if (d+l>=0&&d+l< land[0].length){
                                        if (land[c+k][d+l]==1&&!check[c+k][d+l]){
                                            check[c+k][d+l]=true;
                                            queue.add(new int[]{c+k,d+l});
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
