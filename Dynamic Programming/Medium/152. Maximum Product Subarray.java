class Solution {
    public int maxProduct(int[] nums) {

        int maxProd = nums[0];
        int prod = 1;

        for(int i = 0; i < nums.length; i++){

            prod *= nums[i];
            maxProd = Math.max(prod, maxProd);

            if(prod == 0){
                prod = 1;
            }
        }

        prod = 1;

        for(int i = nums.length-1; i >= 0; i--){

            prod *= nums[i];
            maxProd = Math.max(prod, maxProd);

            if(prod == 0){
                prod = 1;
            }
        }

        return maxProd;





        
        // int maxProd = nums[0];

        // int[] prev = new int[nums.length];
        // prev[0] = nums[0];

        // for(int i = 1; i < nums.length; i++){
        //     prev[i] = prev[i-1] * nums[i];
        //     maxProd = Math.max(maxProd, prev[i]);
        // }

        // for(int i = 1; i < nums.length; i++){
        //     int prod = 1;
        //     int[] curr = new int[nums.length];
        //     for(int j = 0; j < nums.length; j++){
        //         if(j < i){
        //             curr[j] = prev[j];
        //         }
        //         else{
        //             prod *= nums[j];
        //             //curr[j] = Math.max(prod, Math.max(prev[j], curr[j-1]));
        //             maxProd = Math.max(maxProd, prod);
        //         }
        //     }
        //     //prev = curr;
        // }
        
        // //return prev[nums.length-1];

        // return maxProd;
    }
}
