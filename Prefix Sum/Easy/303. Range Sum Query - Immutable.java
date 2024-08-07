class NumArray {

    int[] numsArr;

    public NumArray(int[] nums) {
        numsArr = nums;
        for(int i = 1; i < nums.length; i++){
            numsArr[i] += nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return numsArr[right];
        }
        return numsArr[right] - numsArr[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
