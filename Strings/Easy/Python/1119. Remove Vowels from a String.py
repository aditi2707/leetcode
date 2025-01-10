class Solution:
    def removeVowels(self, s: str) -> str:
        ans = ""
        vowels = "aeiou"

        for i in s:
            if i not in vowels:
                ans += i
        
        return ans
