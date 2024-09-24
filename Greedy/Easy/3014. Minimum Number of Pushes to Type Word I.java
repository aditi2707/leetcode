class Solution {
    public int minimumPushes(String word) {
        
        int step = 1;
        int stepCheck = 1;
        int ans = 0;

        for(int i = 0; i < word.length(); i++){

            if(stepCheck <= 8){
                ans += step;
                stepCheck++;
            }
            else{
                step++;
                ans += step;
                stepCheck = 2;
            }
        }

        return ans;
    }
}
