class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int count = 0;
        int i = 0, j = 0;
        int sum = 0;

        while(j < arr.length){
            if((j - i + 1) <= k){
                sum += arr[j];
                j++;
            }
            else{
                double avg = (double)(sum / k);
                if(avg >= (double)threshold){
                    count++;
                }
                sum -= arr[i];
                i++;
                sum += arr[j];
                j++;
            }
        }

        double avg = (double)(sum / k);
        if(avg >= (double)threshold){
            count++;
        }

        return count;
    }
}
