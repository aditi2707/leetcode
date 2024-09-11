class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        Arrays.sort(arr2);
        int counter = 0;

        for(int i = 0; i < arr1.length; i++){
            int from = arr1[i] - d;
            int to = arr1[i] + d;

            int low = 0, high = arr2.length-1;
            int flag = 0;

            while(low <= high){
                int mid = (low + high) / 2;

                if(arr2[mid] >= from && arr2[mid] <= to){
                    flag = 1;
                    break;
                }
                else if(arr2[mid] < from){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

            if(flag == 0){
                counter++;
            }
        }

        return counter;


        
        // Arrays.sort(arr2);

        // int counter = 0;

        // for(int i = 0; i < arr1.length; i++){

        //     int flag = 0;

        //     for(int j = 0; j < arr2.length; j++){
        //         if(Math.abs(arr2[j] - arr1[i]) <= d){
        //             flag = 1;
        //             break;
        //         }
        //     }

        //     if(flag == 0){
        //         counter++;
        //     }
        // }

        // return counter;
    }
}
