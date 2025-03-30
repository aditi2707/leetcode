class Solution {

    private int binarySearch(int target, int[] nums){

        int i = 0, j = nums.length - 1;

        while(i <= j){
            int mid = i + (j - i) / 2;
            if(nums[mid] < target){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }

        return i;
    }

    private int maxProfit(List<List<Integer>> arr, int index, int[] start, int[] dp){

        if(index == start.length){
            return 0;
        }

        if(dp[index] != -1){
            return dp[index];
        }

        int nonConflictIndex = binarySearch(arr.get(index).get(1), start);

        int max = Math.max(maxProfit(arr, index + 1, start, dp), 
                arr.get(index).get(2) + maxProfit(arr, nonConflictIndex, start, dp));
        
        return dp[index] = max;
    }


    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        // Time Complexity : O(n + n + n logn + n + (2 * n) + n logn).
        // Space Complexity : O(n * 3 + n + n + n).
        
        List<List<Integer>> arr = new ArrayList<>();
        int[] dp = new int[startTime.length];

        Arrays.fill(dp, -1);

        for(int i = 0; i < startTime.length; i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(startTime[i]);
            temp.add(endTime[i]);
            temp.add(profit[i]);
            arr.add(temp);
        }

        arr.sort(Comparator.comparingInt(a -> a.get(0)));

        int[] start = new int[startTime.length];
        int k = 0;

        for(List<Integer> l: arr){
            start[k] = l.get(0);
            k++;
        }

        return maxProfit(arr, 0, start, dp);
    }
}
