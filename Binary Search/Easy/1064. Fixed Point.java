class Solution {
    public int fixedPoint(int[] arr) {

        int low = 0, high = arr.length-1;
        int min = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == mid){
                min = Math.min(min, mid);
                high = mid - 1;
            }
            else if(arr[mid] < mid){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
        
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == i){
        //         return i;
        //     }
        // }

        // return -1;
    }
}
