class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int counter = 0;

        for(int i = left; i <= right; i++){
            for(int j = 0; j < ranges.length; j++){
                if(i >= ranges[j][0] && i <= ranges[j][1]){
                    counter++;
                    break;
                }
            }
        }

        if(counter != right - left + 1){
            return false;
        }

        return true;
    }
}
