class Solution {

    private int countPairs(int[] nums, int low, int mid, int high){

        int index = mid + 1;
        int count = 0;

        for(int i = low; i <= mid; i++){
            while(index <= high && (nums[i] > nums[index] * 2L)){
                index++;
            }
            count += (index - (mid + 1));
        }

        return count;
    }

    private void merge(int[] nums, int low, int mid, int high){

        List<Integer> temp = new ArrayList<>();
        int i = low, j = mid + 1;
        int index = mid + 1;

        while(i <= mid && j <= high){

            if(nums[i] <= nums[j]){
                temp.add(nums[i]);
                i++;
            }
            else{
                temp.add(nums[j]);
                j++;
            }
        }

        while(i <= mid){
            temp.add(nums[i]);
            i++;
        }
        while(j <= high){
            temp.add(nums[j]);
            j++;
        }

        for(int k = low; k <= high; k++){
            nums[k] = temp.get(k - low);
        }

        return;
    }

    private int mergeSort(int[] nums, int low, int high){

        if(low >= high){
            return 0;
        }

        int mid = (low + high) / 2;
        int left = mergeSort(nums, low, mid);
        int right = mergeSort(nums, mid + 1, high);
        int count = left + right + countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);

        return count;
    }


    public int reversePairs(int[] nums) {

        // Time Complexity : O(log n * (n + (2 * n)))
        // The log n comes from dividing the array.
        // n is the worst case when merging the array which is when the whole array
        // has to be merged.
        // Now there is one more function which is present, i.e. for counting the
        // pairs. The TC for that will be O(n * 2) on average because each element
        // will only be traversed at least twice.

        // Space Complexity : O(n)

        
        return mergeSort(nums, 0, nums.length - 1);

    }
}
