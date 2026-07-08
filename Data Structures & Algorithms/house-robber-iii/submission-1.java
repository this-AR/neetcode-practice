class Solution {
    Map<TreeNode,Integer> m=new HashMap<>();
    public int rob(TreeNode root) {
        if (root == null)
            return 0;

        if(m.containsKey(root))
        return m.get(root);
        int rob = root.val;

        if (root.left != null) {
            rob += rob(root.left.left) + rob(root.left.right);
        }

        if (root.right != null) {
            rob += rob(root.right.left) + rob(root.right.right);
        }
        int notRob = rob(root.left) + rob(root.right);
        m.put(root,Math.max(rob, notRob));
        return m.get(root);
    }
}