class Solution {
    public boolean stoneGame(int[] piles) {

        // Time Complexity : O(n + 500)

        // Space Complexity : O(500)
        
        
        int[] freq = new int[501];
        int alice = 0, total = 0;

        for(int i = 0; i < piles.length; i++){
            freq[piles[i]] += 1;
            total += piles[i];
        }

        boolean a = true;

        for(int i = 500; i >= 1; i--){
            if(freq[i] == 0){
                continue;
            }
            if(freq[i] % 2 == 0){
                alice += (freq[i] / 2) * i;
            }
            else{
                alice += (freq[i] / 2 + 1) * i;
                if(a){
                    a = false;
                }
                else{
                    a = true;
                }
            }
        }

        return alice > total - alice;





        // // Time Complexity : O(nlog n + n)

        // // Space Complexity : O(1)

        
        // Arrays.sort(piles);
        // int alice = 0, bob = 0;

        // for(int i = piles.length - 1; i >= 1; i -= 2){
        //     alice += piles[i];
        //     bob += piles[i - 1];
        // }

        // return alice > bob;
    }
}
