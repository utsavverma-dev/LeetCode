/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Stack<TreeNode>s=new Stack<>();
        s.push(root);
        TreeNode temp=root;
        List<Integer>l=new ArrayList<>();
        while(!s.isEmpty())
        {
            if(temp!=null&& temp.left!=null){
            s.push(temp.left);
            temp=temp.left;
            }

            else{
                temp=s.pop();
                l.add(temp.val);
                temp=temp.right;
                if(temp!=null)
                s.push(temp);
            }
        }
        return l;
    }
}