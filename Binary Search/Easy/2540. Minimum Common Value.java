class Solution {

    public boolean binarySearch(int[] arr, int k){

        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == k){
                return true;
            }
            else if(arr[mid] < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return false;
    }


    public int getCommon(int[] nums1, int[] nums2) {

        int min = Integer.MAX_VALUE;
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){

            if(nums1[i] == nums2[j]){
                min = Math.min(min, nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }

        return min;




        
        // int min = Integer.MAX_VALUE;

        // for(int i = 0; i < nums1.length; i++){

        //     if(binarySearch(nums2, nums1[i])){
        //         return nums1[i];
        //     }
        // }

        // if(min == Integer.MAX_VALUE){
        //     return -1;
        // }

        // return min;
    }
}
