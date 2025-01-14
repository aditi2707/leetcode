class Solution {
    public int findComplement(int num) {
        
        int complement = num, bit = 1;

        while(complement != 0){
            num = num ^ bit;
            complement = complement >> 1;
            bit = bit << 1;
        }

        return num;
    }
}
