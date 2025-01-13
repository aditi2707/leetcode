class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        map = dict()
        ans = 0

        for i in range(0, len(s)):
            map[s[i]] = i
        
        for i in range(0, len(t)):
            ans += abs(i - map[t[i]])
        
        return ans
        
