package Others.TUF.BinaryTree;

import com.sun.source.tree.Tree;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> ll = new ArrayList<>();

        if (root==null){
            return ll;
        }
        q.offer(root);
        while (!q.isEmpty()){
            int len = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                if (q.peek().left!=null){
                    q.offer(q.peek().left);
                }
                if (q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                list.add(q.poll().val);
            }
            ll.add(list);
        }
        return ll;
    }
}
