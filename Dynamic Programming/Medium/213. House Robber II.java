class Solution {

    public int findStash(int n, List<Integer> nums, int[] dp){

        if(n == 0){
            return nums.get(0);
        }
        if(n == 1){
            return Math.max(nums.get(0), nums.get(1));
        }

        int pick = nums.get(0);
        int notPick = Math.max(nums.get(0), nums.get(1));

        for(int i = 2; i < nums.size(); i++){
            int choose = nums.get(i) + pick;
            int notChoose = notPick;

            int curr = Math.max(choose, notChoose);
            pick = notPick;
            notPick = curr;
        }

        return notPick;






        

        // if(n == 0){
        //     return nums.get(0);
        // }
        // if(n == 1){
        //     return Math.max(nums.get(0), nums.get(1));
        // }

        // dp[0] = nums.get(0);
        // dp[1] = Math.max(nums.get(0), nums.get(1));

        // for(int i = 2; i < nums.size(); i++){
        //     int choose = nums.get(i) + dp[i - 2];
        //     int notChoose = dp[i - 1];

        //     dp[i] = Math.max(choose, notChoose);
        // }

        // return dp[nums.size() - 1];







        // if(n == 0){
        //     return nums.get(0);
        // }
        // if(n == 1){
        //     return Math.max(nums.get(0), nums.get(1));
        // }

        // if(dp[n] != -1){
        //     return dp[n];
        // }

        // int choose = nums.get(n) + findStash(n - 2, nums, dp);
        // int notChoose = findStash(n - 1, nums, dp);

        // dp[n] = Math.max(choose, notChoose);
        // return dp[n];
    }



    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        int[] firstDp = new int[nums.length - 1];
        int[] secondDp = new int[nums.length - 1];

        Arrays.fill(firstDp, -1);
        Arrays.fill(secondDp, -1);

        for(int i = 0; i < nums.length; i++){
            if(i != nums.length - 1){
                first.add(nums[i]);
            }
            if(i != 0){
                second.add(nums[i]);
            }
        }
        
        int f = findStash(first.size() - 1, first, firstDp);
        int s = findStash(second.size() - 1, second, secondDp);

        return Math.max(f, s);
    }
}
