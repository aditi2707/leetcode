class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:

        s = set()
        arr = []

        for i in nums:
            if i not in s:
                s.add(i)
            else:
                arr.append(i)
        
        return arr
        
