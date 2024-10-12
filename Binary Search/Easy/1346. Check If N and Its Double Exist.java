class Solution {

    public boolean binarySearch(int[] arr, int k){

        int low = 0, high = arr.length - 1;

        while(low <= high){
            int mid = (int)((low + high) / 2);

            if(arr[mid] < k){
                low = mid + 1;
            }
            else if(arr[mid] > k){
                high = mid - 1;
            }
            else{
                return true;
            }
        }

        return false;
    }

    public boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        int c = 0;
        
        for(int i = 0; i < arr.length; i++){

            if(arr[i] != 0){
                if(binarySearch(arr, arr[i] * 2)){
                    return true;
                }
            }
            else{
                c++;
            }
        }

        return c >= 2;






        // Set<Integer> set = new HashSet<>();
        // int c = 0;

        // for(Integer i: arr){
        //     set.add(i);
        // }

        // for(int i = 0; i < arr.length; i++){

        //     if(arr[i] != 0){
        //         if(set.contains(arr[i] * 2)){
        //             return true;
        //         }
        //     }
        //     else{
        //         c++;
        //     }
        // }

        // return c >= 2;
    }
}
