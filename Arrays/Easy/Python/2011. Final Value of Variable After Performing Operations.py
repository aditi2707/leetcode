class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        ans = 0

        for s in operations:
            if s[0] == '-' or s[len(s) - 1] == '-':
                ans -= 1
            else:
                ans += 1
        
        return ans
        
