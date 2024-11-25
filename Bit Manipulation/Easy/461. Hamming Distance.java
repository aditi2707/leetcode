class Solution {
    public int hammingDistance(int x, int y) {
        
        return Integer.bitCount(x ^ y);



        

        // int distance = 0;

        // int xor = x ^ y;

        // while(xor > 0){
        //     if(xor % 2 == 1){
        //         distance++;
        //     }
        //     xor = xor >> 1;
        // }

        // return distance;
    }
}
