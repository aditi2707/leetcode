class Solution:
    def calculateTime(self, keyboard: str, word: str) -> int:
        map = dict()
        ind = 0

        for i in keyboard:
            map[i] = ind
            ind += 1
        
        ind = 0
        ans = 0

        for i in word:
            ans += abs(ind - map[i])
            ind = map[i]
        
        return ans
        
