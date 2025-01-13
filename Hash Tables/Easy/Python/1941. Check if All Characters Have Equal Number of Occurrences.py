class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        map = dict()

        for i in s:
            if i not in map:
                map[i] = 1
            else:
                map[i] = map[i] + 1
        
        check = map[s[0]]

        for i in map:
            if map[i] != check:
                return False
        
        return True
        
