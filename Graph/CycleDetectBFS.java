package Graph;

import java.util.*;

public class CycleDetectBFS {
    public static void main(String[] args) {
        List<List<Integer>>  list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            List<Integer> list1 = new ArrayList<>();
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                list1.add(sc.nextInt());
            }
            list.add(new ArrayList<>(list1));
        }
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[] vis = new boolean[8];
        queue.offer(new int[]{-1,1});
        int check=0;
        while (!queue.isEmpty()){
            int[] m = queue.poll();
            for (int i = 0; i < list.get(m[1]).size(); i++) {
                if(m[0]==list.get(m[1]).get(i)){
                    continue;
                }
                if (vis[list.get(m[1]).get(i)]){
                    check=1;
                    break;
                }
                queue.add(new int[] {m[1],list.get(m[1]).get(i)});
                vis[list.get(m[1]).get(i)]=true;
            }
        }
        if (check==1){
            System.out.println("Contains cycle");
        }
        else{
            System.out.println("No Cycle");
        }
    }
}
