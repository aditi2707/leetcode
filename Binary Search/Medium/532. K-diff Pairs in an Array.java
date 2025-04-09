class Solution {

    private int binarySearch(int[] nums, int low, int high, int num){

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == num){
                return mid;
            }
            else if(nums[mid] < num){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;
    }


    public int findPairs(int[] nums, int k) {

        // Time Complexity : O(nlog n + nlog n)

        // Space Complexity : O(1)
        

        int ans = 0;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int num = nums[i] + k;
            if(binarySearch(nums, i + 1, nums.length - 1, num) > 0){
                ans++;
            }
        }

        return ans;




        // // Time Complexity : O(nlog n + (n ^ 2))

        // // Space Complexity : O(1)

        
        // int ans = 0;

        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length; i++){
        //     if(i > 0 && nums[i] == nums[i - 1]){
        //         continue;
        //     }
        //     int num = nums[i];
        //     int low = i + 1, high = nums.length - 1;
        //     while(low <= high){
        //         if(nums[low] - num < k){
        //             low++;
        //         }
        //         else if(nums[high] - num > k){
        //             high--;
        //         }
        //         else{
        //             ans++;
        //             break;
        //         }
        //     }
        // }

        // return ans;
    }
}
