class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(mid - 1 >= 0 && arr[mid - 1] < arr[mid] && mid + 1 < arr.length && arr[mid + 1] < arr[mid]){
                return mid;
            }
            else if(mid - 1 >= 0 && arr[mid - 1] < arr[mid] && mid + 1 < arr.length && arr[mid + 1] > arr[mid]){
                low = mid;
            }
            else{
                high = mid;
            }
        }

        return -1;





        
        // int[] copy = Arrays.copyOf(arr, arr.length); 

        // Arrays.sort(copy);

        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == copy[copy.length - 1]){
        //         return i;
        //     }
        // }

        // return -1;
    }
}
