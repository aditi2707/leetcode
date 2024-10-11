class Solution {

    public boolean binarySearch(int[] arr, int n){

        int low = 0, high = arr.length-1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == n){
                return true;
            }
            else if(arr[mid] < n){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return false;
    }

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
            int n = arr1[i];

            if(binarySearch(arr2, n) && binarySearch(arr3, n)){
                ans.add(n);
            }
        }

        return ans;







        // List<Integer> ans = new ArrayList<>();
        // int i = 0, j = 0, k = 0;

        // while(i < arr1.length && j < arr2.length && k < arr3.length){
        //     if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
        //         ans.add(arr1[i]);
        //         i++;
        //         j++;
        //         k++;
        //         continue;
        //     }
        //     if(arr1[i] < arr2[j]){
        //         i++;
        //     }
        //     else if(arr2[j] < arr3[k]){
        //         j++;
        //     }
        //     else{
        //         k++;
        //     }
        // }

        // return ans;








        // List<Integer> ans = new ArrayList<>();

        // for(int i = 0; i < arr1.length; i++){
        //     int num = arr1[i];
        //     boolean found = false;

        //     int low2 = 0, high2 = arr2.length-1;
        //     while(low2 <= high2){
        //         int mid2 = (low2 + high2) / 2;
        //         if(arr2[mid2] == num){
        //             found = true;
        //             break;
        //         }
        //         else if(arr2[mid2] < num){
        //             low2 = mid2 + 1;
        //         }
        //         else{
        //             high2 = mid2 - 1;
        //         }
        //     }

        //     if(found == true){
        //         int low3 = 0, high3 = arr3.length-1;
        //         while(low3 <= high3){
        //             int mid3 = (low3 + high3) / 2;
        //             if(arr3[mid3] == num){
        //                 ans.add(num);
        //                 break;
        //             }
        //             else if(arr3[mid3] < num){
        //                 low3 = mid3 + 1;
        //             }
        //             else{
        //                 high3 = mid3 - 1;
        //             }
        //         }
        //     }
        // }

        // return ans;
    }
}
