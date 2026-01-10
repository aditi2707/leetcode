class Solution {

    private int findGcd(int a, int b){

        return b == 0 ? a : findGcd(b, a % b);
    }


    public int minimumSplits(int[] nums) {

        // Time Complexity : O(nlog n)

        // Space Complexity : O(1)
        
        
        int count = 0;
        int gcd = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            int res = findGcd(gcd, nums[i]);
            if(res == 1){
                count++;
                gcd = nums[i];
            }
            else{
                gcd = res;
            }
            
        }

        return count + 1;
        
    }
}
