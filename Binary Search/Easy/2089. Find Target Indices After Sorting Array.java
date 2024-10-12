class Solution {

    public int firstOccurence(int[] nums, int target){

        int low = 0, high = nums.length-1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(low < nums.length && nums[low] == target){
            return low;
        }

        return -1;
    }

    public int lastOccurence(int[] nums, int target){

        int low = 0, high = nums.length-1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] <= target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(high >= 0 && nums[high] == target){
            return high;
        }

        return -1;
    }



    public void binarySearch(int[] nums, int target, int low, int high, List<Integer> ans){

        if(low > high){
            return;
        }

        int mid = (low + high) / 2;

        if(nums[mid] == target){
            ans.add(mid);
            binarySearch(nums, target, low, mid-1, ans);
            binarySearch(nums, target, mid+1, high, ans);
        }
        else if(nums[mid] < target){
            binarySearch(nums, target, mid+1, high, ans);
        }
        else{
            binarySearch(nums, target, low, mid-1, ans);
        }
    }

    public List<Integer> targetIndices(int[] nums, int target) {

        
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int low = 0, high = nums.length-1;

        binarySearch(nums, target, low, high, ans);

        Collections.sort(ans);

        return ans;



        // Arrays.sort(nums);
        // List<Integer> ans = new ArrayList<>();


        // int low = firstOccurence(nums, target);
        // int high = lastOccurence(nums, target);

        // if(low == -1 || high == -1){
        //     return ans;
        // }

        // for(int i = low; i <= high; i++){
        //     ans.add(i);
        // }

        // return ans;






        
        // List<Integer> ans = new ArrayList<>();

        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == target){
        //         ans.add(i);
        //     }
        // }

        // return ans;
    }
}
