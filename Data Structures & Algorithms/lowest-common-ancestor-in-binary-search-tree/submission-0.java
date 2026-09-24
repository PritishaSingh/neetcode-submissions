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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p || root==q){
            return root;
        }

        TreeNode leftl=lowestCommonAncestor(root.left, p,q);
        TreeNode rightl=lowestCommonAncestor(root.right, p,q);
        if(leftl!=null && rightl!=null) return root;
        if(leftl!=null) return leftl;
        return rightl;
    }
}
