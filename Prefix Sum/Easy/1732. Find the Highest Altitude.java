class Solution {
    public int largestAltitude(int[] gain) {
        
        int maxGain = 0;
        int altitude = 0;

        for(int i = 0; i < gain.length; i++){
            altitude += gain[i];
            if(altitude > maxGain){
                maxGain = altitude;
            }
        }

        return maxGain;
    }
}
