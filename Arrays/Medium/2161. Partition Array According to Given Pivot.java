class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int less = 0, equal = 0;
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            if(nums[i] < pivot){
                less++;
            }
            else if(nums[i] == pivot){
                equal++;
            }
        }

        int l = 0, g = 0, e = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot){
                ans[l] = nums[i];
                l++;
            }
            else if(nums[i] == pivot){
                ans[e+less] = nums[i];
                e++;
            }
            else if(nums[i] > pivot){
                ans[g+less+equal] = nums[i];
                g++;
            }
        }

        return ans;







        // List<Integer> lessArr = new ArrayList<>();
        // List<Integer> equalArr = new ArrayList<>();
        // List<Integer> greaterArr = new ArrayList<>();

        // int l = 0, g = 0, e = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] < pivot){
        //         lessArr.add(nums[i]);
        //     }
        //     else if(nums[i] > pivot){
        //         greaterArr.add(nums[i]);
        //     }
        //     else{
        //         equalArr.add(nums[i]);
        //     }
        // }

        // int l = 0, g = 0, e = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(i < lessArr.size()){
        //         nums[i] = lessArr.get(l);
        //         l++;
        //     }
        //     else if(i >= lessArr.size() && i < lessArr.size()+equalArr.size()){
        //         nums[i] = equalArr.get(e);
        //         e++;
        //     }
        //     else if(i >= lessArr.size()+equalArr.size()){
        //         nums[i] = greaterArr.get(g);
        //         g++;
        //     }
        // }

        // return nums;







        // int less = 0, equal = 0, greater = 0;

        // for(int i = 0; i < nums.length; i++){

        //     if(nums[i] < pivot){
        //         less++;
        //     }
        //     else if(nums[i] > pivot){
        //         greater++;
        //     }
        //     else{
        //         equal++;
        //     }
        // }

        // int[] lessArr = new int[less];
        // int[] equalArr = new int[equal];
        // int[] greaterArr = new int[greater];

        // int l = 0, g = 0, e = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] < pivot){
        //         lessArr[l] = nums[i];
        //         l++;
        //     }
        //     else if(nums[i] > pivot){
        //         greaterArr[g] = nums[i];
        //         g++;
        //     }
        //     else{
        //         equalArr[e] = nums[i];
        //         e++;
        //     }
        // }

        // l = 0; e = 0; g = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(i < less){
        //         nums[i] = lessArr[l];
        //         l++;
        //     }
        //     else if(i >= less && i < less+equal){
        //         nums[i] = equalArr[e];
        //         e++;
        //     }
        //     else if(i >= less+equal){
        //         nums[i] = greaterArr[g];
        //         g++;
        //     }
        // }

        // return nums;
    }
}
