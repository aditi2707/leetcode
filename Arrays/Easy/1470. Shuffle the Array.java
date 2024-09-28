class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] arr = new int[n * 2];
        int k = 0;

        for(int i = 0; i < n*2; i=i+2){
            arr[i] = nums[k];
            arr[i+1] = nums[n+k];
            k++;
        }

        return arr;
    }
}
