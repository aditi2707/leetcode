class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        s = set()

        for i in range(0, 26):
            a = 97 + i
            s.add(chr(97 + i))
        
        for i in sentence:
            if i in s:
                s.remove(i)
        
        return len(s) == 0
        
