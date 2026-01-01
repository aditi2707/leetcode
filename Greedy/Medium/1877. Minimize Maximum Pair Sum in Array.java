class Solution {
    public int minPairSum(int[] nums) {

        // Time Complexity : O((n * 2) + (max + n))

        // Space Complexity : O(max)


        int max = 0, maxSum = 0;

        for(Integer i: nums){
            max = Math.max(max, i);
        }

        int[] arr = new int[max + 1];

        for(Integer i: nums){
            arr[i] += 1;
        }
        
        int a = 0, b = max;

        while(a <= b){
            if(arr[a] == 0){
                a++;
                continue;
            }
            if(arr[b] == 0){
                b--;
                continue;
            }
            maxSum = Math.max(maxSum, a + b);
            arr[a] -= 1;
            arr[b] -= 1;
            if(arr[a] == 0){
                a++;
            }
            if(arr[b] == 0){
                b--;
            }
        }

        return maxSum;







        // // Time Complexity : O(nlog n + n)

        // // Space Complexity : O(1)
        
        
        Arrays.sort(nums);
        int maxSum = 0;

        for(int i = 0; i < nums.length/2; i++){
            int sum = nums[i] + nums[nums.length-1-i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
