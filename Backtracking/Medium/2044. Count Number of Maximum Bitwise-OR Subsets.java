class Solution {

    public void countSubsets(int[] nums, int start, int k, List<Integer> arr, int[] counter, int max){

        if(arr.size() == k){
            int bitOr = arr.get(0);
            for(int i = 1; i < arr.size(); i++){
                bitOr = bitOr | arr.get(i);
            }
            if(bitOr == max){
                counter[0] += 1;
            }
        }

        for(int i = start; i < nums.length; i++){

            arr.add(nums[i]);
            countSubsets(nums, i+1, k, arr, counter, max);
            arr.remove(arr.size()-1);

        }
    }

    public int countMaxOrSubsets(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int[] counter = {0};

        for(Integer i: nums){
            max |= i;
        }

        for(int i = 1; i <= nums.length; i++){
            List<Integer> arr = new ArrayList<>();
            countSubsets(nums, 0, i, arr, counter, max);
        }

        
        
        return counter[0];
    }
}
