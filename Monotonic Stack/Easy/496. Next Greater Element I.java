class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Time Complexity : O((nums2.length * 2) + nums1.length)
        // Considering the inner while loop, every element in nums2 will be pushed 
        // and popped atmost once. So the TC for the first for loop will be 2 * n.
        // The second for loop will run for nums1 length so it is self-explanatory.

        // Space Complexity : O(nums1.length + nums2.length)

        
        int[] ans = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = nums2.length - 1; i >= 0; i--){
            while(!stack.isEmpty() && nums2[i] >= nums2[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i], nums2[stack.peek()]);
            }

            stack.push(i);
        }

        for(int i = 0; i < nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
