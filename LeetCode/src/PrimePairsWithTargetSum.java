import java.util.*;

public class PrimePairsWithTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findPrimePairs(n));
    }
    static List<List<Integer>> findPrimePairs(int n){
        boolean[] prime = new boolean[n+1];
        int x = (int)Math.sqrt(n);

        for (int i=2;i<x+1;i=i+2){
            for(int j=i+i;j<n+1;j=j+i){
                prime[j]=true;
            }
            if(i==2){
                --i;
            }
        }
        System.out.println(Arrays.toString(prime));
        LinkedList<Integer> li = new LinkedList<>();
        for(int i = 2;i<n+1;i++){
            if(prime[i]==false){
                li.add(i);
            }
        }
        System.out.println(li);
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> ab = new ArrayList<>();
        for(int i=0;i<li.size();i++){
            for (int j = i; j < li.size(); j++) {
                    if(li.get(i)+ li.get(j)==n){
                        ab.add(li.get(i));
                        ab.add(li.get(j));
                        l.add(ab);
                        ab = new ArrayList<>();
                    } else if (li.get(i) + li.get(j) > n) {
                        break;
                    }
            }
        }


        return l;
    }
}
