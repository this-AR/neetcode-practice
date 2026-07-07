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
    int c = 0;

    public int goodNodes(TreeNode root) {
        find(root, Integer.MIN_VALUE);
        return c;
    }

    void find(TreeNode root, int maxSoFar) {
        if (root == null)
            return;

        if (root.val >= maxSoFar) {
            c++;
            maxSoFar = root.val;
        }

        find(root.left, maxSoFar);
        find(root.right, maxSoFar);
    }
}