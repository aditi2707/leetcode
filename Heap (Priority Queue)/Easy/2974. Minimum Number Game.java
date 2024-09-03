class Solution {
    public int[] numberGame(int[] nums) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] ans = new int[nums.length];
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            queue.add(nums[i]);
        }

        while(queue.size() >= 2){
            int alice = queue.poll();
            int bob = queue.poll();

            ans[k] = bob;
            k++;
            ans[k] = alice;
            k++;
        }

        return ans;
    }
}
