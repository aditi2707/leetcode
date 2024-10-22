class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        
        int counter = 0;

        int i = 0, j = 0;
        int ones = 0, zeroes = 0;

        while(j < s.length()){
            if(s.charAt(j) == '0'){
                zeroes++;
            }
            else{
                ones++;
            }

            if(zeroes <= k || ones <= k){
                counter++;
                j++;
            }
            else{
                if(s.charAt(i) == '0'){
                    zeroes--;
                }
                else{
                    ones--;
                }
                i++;
            }
        }

        return counter;
    }
}
