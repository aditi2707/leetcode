class Solution {
    public int thirdMax(int[] nums) {

        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(firstMax == nums[i] || secondMax == nums[i] || thirdMax == nums[i]) {
                continue;
            }
            if(nums[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
                continue;
            }
            if(nums[i] > secondMax){
                thirdMax = secondMax;
                secondMax = nums[i];
                continue;
            }
            if(nums[i] > thirdMax){
                thirdMax = nums[i];
            }
        }

        if(thirdMax == Long.MIN_VALUE){
            return (int)firstMax;
        }

        return (int)thirdMax;

        // Arrays.sort(nums);
        // int c = 0, j = 0;
        // int max = nums[nums.length-1];
        // for(int i = nums.length-2; i >= 0; i--){
        //     if(nums[i] != max){
        //         ++c;
        //         j = i;
        //     }
        //     if(c == 2){
        //         break;
        //     }
        //     max = nums[i];
        // }
        // if(nums.length < 3 || c < 2){
        //     return nums[nums.length - 1];
        // }
        
        // return nums[j];





        // Arrays.sort(nums);
        // int c = 0;
        // int i = nums.length-1;
        // int max = nums[nums.length-1];

        // if(nums.length < 3){
        //     return nums[nums.length-1];
        // }
        // while(c < 3 && i > 0){
        //     if(nums[i] > nums[i-1]){
        //         max = nums[i];
        //         c++;
        //     }
        //     i--;
        // }
        // if(i == 0 && c == 2 && nums[i] < max){
        //     return nums[0];
        // }
        // return max;


// Alternative method but more time consuming

/*
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
    
        for(int i = 0; i < nums.length; i++){
            if(!ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }
        if(ans.size() <= 2){
            return ans.get(ans.size() - 1);
        }
        return ans.get(ans.size() - 3);
*/
    }
}
