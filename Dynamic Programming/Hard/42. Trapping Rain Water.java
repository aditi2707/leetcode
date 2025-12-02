class Solution {
    public int trap(int[] height) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)

        
        int leftMax = 0, rightMax = 0;
        int left = 0, right = height.length - 1;

        int ans = 0;

        while(left < right){

            if(height[left] <= height[right]){
                if(height[left] < leftMax){
                    ans += leftMax - height[left];
                }
                leftMax = Math.max(leftMax, height[left]);
                left++;
            }
            else{
                if(height[right] < rightMax){
                    ans += rightMax - height[right];
                }
                rightMax = Math.max(rightMax, height[right]);
                right--;
            }
        }

        return ans;





        
        // // Time Complexity : O(n * 3)

        // // Space Complexity : O(n * 2)


        // int[] prefix = new int[height.length];
        // int[] suffix = new int[height.length];
        // prefix[0] = height[0];
        // suffix[height.length - 1] = height[height.length - 1];

        // int ans = 0;

        // for(int i = 1; i < height.length; i++){
        //     prefix[i] = Math.max(prefix[i - 1], height[i]);
        // }
        // for(int i = height.length - 2; i >= 0; i--){
        //     suffix[i] = Math.max(suffix[i + 1], height[i]);
        // }

        // for(int i = 0; i < height.length; i++){
        //     if(height[i] < prefix[i] && height[i] < suffix[i]){
        //         ans += Math.min(prefix[i], suffix[i]) - height[i];
        //     }
        // }

        // return ans;
    }
}
