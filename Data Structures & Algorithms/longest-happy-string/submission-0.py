class Solution:
    def longestDiverseString(self, a: int, b: int, c: int) -> str:
        import heapq

        heap = []
        for count, ch in [(a, 'a'), (b, 'b'), (c, 'c')]:
            if count:
                heapq.heappush(heap, (-count, ch))

        ans = []

        while heap:
            count1, ch1 = heapq.heappop(heap)
            count1 = -count1

            if len(ans) >= 2 and ans[-1] == ch1 and ans[-2] == ch1:
                if not heap:
                    break

                count2, ch2 = heapq.heappop(heap)
                count2 = -count2

                ans.append(ch2)
                count2 -= 1

                if count2:
                    heapq.heappush(heap, (-count2, ch2))

                heapq.heappush(heap, (-count1, ch1))
            else:
                ans.append(ch1)
                count1 -= 1

                if count1:
                    heapq.heappush(heap, (-count1, ch1))

        return ''.join(ans)