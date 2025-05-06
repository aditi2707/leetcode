class Solution {
public:
    vector<int> transformArray(vector<int>& nums) {
        
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }

        int oneIndex = nums.size() - 1;

        while(oneIndex >= 0 && nums[oneIndex] == 1){
            oneIndex--;
        }

        int i = 0;

        while(i < oneIndex){
            if(nums[i] == 1){
                if(nums[oneIndex] == 1){
                    oneIndex--;
                    continue;
                }
                nums[oneIndex] = 1;
                nums[i] = 0;
                oneIndex--;
            }
            i++;
        }

        return nums;
    }
};
