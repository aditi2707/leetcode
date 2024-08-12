class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            int start = arr.length - i;
            int end = i + 1;

            int totalOccurence = start * end;
            if(totalOccurence % 2 == 0){
                sum += (totalOccurence/2) * arr[i];
            }
            else{
                sum += (totalOccurence/2 + 1) * arr[i];
            }

        }

        return sum;
        
        // int k = 1, sum = 0;

        // while(k <= arr.length){
        //     for(int i = 0; i <= arr.length-k; i++){
        //         for(int j = i; j < i+k; j++){
        //             sum += arr[j];
        //         }
        //     }
        //     k += 2;
        // }

        // return sum;
    }
}
