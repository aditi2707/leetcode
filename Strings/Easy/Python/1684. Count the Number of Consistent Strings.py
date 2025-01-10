class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:

        ans = 0

        for w in words:
            flag = 0
            for c in w:
                if c not in allowed:
                    flag = 1
                    break
            
            if flag == 0:
                ans += 1
        
        return ans



        # freq = [0] * 26
        # ans = 0

        # for i in range(0, len(allowed)):
        #     freq[ord(allowed[i]) - ord("a")] += 1
        
        # for s in words:
        #     flag = 0
        #     for i in range(0, len(s)):
        #         if freq[ord(s[i]) - ord("a")] == 0:
        #             flag = 1
        #             break
            
        #     if flag == 0:
        #         ans += 1
        
        # return ans
        
