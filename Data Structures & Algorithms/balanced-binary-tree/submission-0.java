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
int max=0;
class Solution {
    public boolean isBalanced(TreeNode root) {
        int t=height(root);
        if(max>1)
        return false;
        return true;
    }
    public int height(TreeNode root)
    {
        if(root==null)
        return 0;
        max=Math.max(max,(Math.abs(height(root.right) - height(root.left))));
        return 1+Math.max(height(root.right),height(root.left));
    }
}
