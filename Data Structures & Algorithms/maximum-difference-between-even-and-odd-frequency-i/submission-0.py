from collections import Counter

class Solution:
    def maxDifference(self, s: str) -> int:
        d = Counter(s)

        odd = max(v for v in d.values() if v % 2 == 1)
        even = min(v for v in d.values() if v % 2 == 0)

        return odd - even