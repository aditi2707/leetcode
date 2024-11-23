class Solution {

    public int setBits(int ind){

        int ans = 0;

        while(ind > 0){
            if(ind % 2 == 1){
                ans++;
            }
            ind /= 2;
        }

        return ans;
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int sum = 0;

        for(int i = 0; i < nums.size(); i++){
            int setBits = Integer.bitCount(i);

            if(setBits == k){
                sum += nums.get(i);
            }
        }

        return sum;





        // int sum = 0;

        // for(int i = 0; i < nums.size(); i++){
        //     if(setBits(i) == k){
        //         sum += nums.get(i);
        //     }
        // }

        // return sum;
    }
}
