import java.util.*;

public class AllPossibleFullBinaryTrees {
     static Map<Integer, List<TreeNode>> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(allPossibleFBT(n));
        for (TreeNode integer : allPossibleFBT(n)) {
            System.out.print(integer + " ");
        }

    }
    public static List<TreeNode> allPossibleFBT(int n){
        if (n%2==0)
            return new ArrayList<TreeNode>();
        if (n==1)
            return Arrays.asList(new TreeNode());
        if (memo.containsKey(n))
            return memo.get(n);
        List<TreeNode> res = new ArrayList<TreeNode>();
        for (int i = 1; i < n; i=i+2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n-i-1);
            for (TreeNode l :
                    left) {
                for (TreeNode r :
                        right) {
                    TreeNode root = new TreeNode(0,l,r);
                    res.add(root);
                }
            }
        }
        memo.put(n,res);
        return res;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
