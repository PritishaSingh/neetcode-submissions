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

    int p;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        p = 0;
        return build(inorder, preorder, 0, inorder.length);
    }

    public TreeNode build(int[] inorder, int[] preorder, int start, int end) {

        // No elements in this range
        if (start >= end) {
            return null;
        }

        // Preorder gives root
        int val = preorder[p++];

        // Find root in inorder
        int idx = start;

        while (inorder[idx] != val) {
            idx++;
        }

        TreeNode root = new TreeNode(val);

        // Left subtree
        root.left = build(inorder, preorder, start, idx);

        // Right subtree
        root.right = build(inorder, preorder, idx + 1, end);

        return root;
    }
}