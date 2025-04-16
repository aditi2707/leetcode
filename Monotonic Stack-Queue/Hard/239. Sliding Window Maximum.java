class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // Time Complexity : O(n)

        // Space Complexity : O(k + (n - k + 1))

        
        Deque<Integer> deque = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int ind = 0;

        int i = 0, j = 0;

        while(j < nums.length){
            int n = nums[j];
            if(deque.isEmpty() || deque.peekLast() >= n){
                deque.addLast(n);
            }
            else{
                while(!deque.isEmpty() && deque.peekLast() < n){
                    deque.removeLast();
                }
                deque.addLast(n);
            }

            if(j - i + 1 == k){
                ans[ind] = deque.peekFirst();
                ind++;
                if(nums[i] == deque.peekFirst()){
                    deque.removeFirst();
                }
                i++;
            }
            j++;
        }

        return ans;
    }
}
