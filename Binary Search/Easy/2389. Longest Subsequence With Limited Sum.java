class Solution {

    public int binarySearch(int[] arr, int n){

        int low = 0, high = arr.length-1;
        int counter = 0;

        while(low <= high){

            int mid = (low + high) / 2;

            if(arr[mid] <= n){
                counter += mid - low + 1;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return counter;
    }

    public int[] answerQueries(int[] nums, int[] queries) {
        
        int[] prefix = new int[nums.length];
        int[] ans = new int[queries.length];
    
        Arrays.sort(nums);
        prefix[0] = nums[0];


        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i = 0; i < queries.length; i++){

            int ind = binarySearch(prefix, queries[i]);

            if(ind != 0){
                ans[i] = ind;
            }
        }

        return ans;
    }
}
