class Solution:
    def defangIPaddr(self, address: str) -> str:

        defang = ""

        for i in address:
            if i == '.':
                defang += '[.]'
            else:
                defang += i
        
        return defang


        # address = address.replace('.', '[.]')
        # return address
        
