/**
 * Definition for BigArray.
 * class BigArray {
 *     public BigArray(int[] elements);
 *     public int at(long index);
 *     public long size();
 * }
 */
class Solution {
    public int countBlocks(BigArray nums) {
        
        long length = nums.size();
        int blocks = 0;

        long i = 0;

        while(i <= length - 1){
            int num = nums.at(i);
            long low = i+1, high = length - 1;

            while(low <= high){
                long mid = low + (high - low)/2;

                if(nums.at(mid) != num){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }

            if(high >= 0 && nums.at(high) == num){
                i = high + 1;
            }
            else{
                i++;
            }
            blocks++;
        }

        return blocks;        
    }
}
