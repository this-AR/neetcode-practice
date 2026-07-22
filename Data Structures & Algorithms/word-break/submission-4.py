from functools import cache

class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        wset = set(wordDict)

        @cache
        def find(i):
            if i == len(s):
                return True

            for j in range(i, len(s)):
                if s[i:j+1] in wset and find(j + 1):
                    return True

            return False

        return find(0)