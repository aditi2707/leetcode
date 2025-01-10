class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:

        ans = 0

        for i in stones:
            if i in jewels:
                ans += 1

        return ans
        
