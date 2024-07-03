class Solution {

    public boolean isPrime(int n){
        
        if(n == 1){
            return false;
        }

        int x = (int)Math.sqrt(n);

        for(int i = 2; i <= x; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public int diagonalPrime(int[][] nums) {

        int max = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(isPrime(nums[i][i])){
                max = Math.max(max, nums[i][i]);
            }

            if(isPrime(nums[i][nums.length-1-i])){
                max = Math.max(max, nums[i][nums.length-1-i]);
            }
        }

        return max;
    }
}
