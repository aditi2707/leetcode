class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        int max = 0;

        for(Integer i: nums){
            max = Math.max(max, i);
        }

        int last = max + (k-1);

        int sum = (((last+1)*last) - (max*(max-1)))/2;

        return sum;

        // int sum = max;

        // for(int i = 1; i < k; i++){
        //     sum += ++max;
        // }

        // return sum;
    }
}
