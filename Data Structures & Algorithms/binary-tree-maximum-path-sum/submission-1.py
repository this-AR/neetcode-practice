from functools import cache
class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        ans = float('-inf')
        @cache
        def find(root):
            nonlocal ans

            if root is None:
                return 0

            left = max(0, find(root.left))
            right = max(0, find(root.right))
            current = root.val + left + right
            ans = max(ans, current)
            return root.val + max(left, right)

        find(root)
        return int(ans)