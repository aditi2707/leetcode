class Solution {
    public int minBitFlips(int start, int goal) {
        
        String s = Integer.toBinaryString(start);
        int flips = 0;

        String g = Integer.toBinaryString(goal);

        int sInd = s.length()-1;
        int gInd = g.length()-1;

        while(sInd >= 0 && gInd >= 0){
            if(s.charAt(sInd) != g.charAt(gInd)){
                flips++;
            }
            sInd--;
            gInd--;
        }

        while(sInd >= 0){
            if(s.charAt(sInd) != '0'){
                flips++;
            }
            sInd--;
        }
        while(gInd >= 0){
            if(g.charAt(gInd) != '0'){
                flips++;
            }
            gInd--;
        }

        return flips;
    }
}
