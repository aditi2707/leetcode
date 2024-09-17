class Solution {
    public int balancedStringSplit(String s) {
        
        int counter = 0;
        int rCount = 0;
        int lCount = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'R'){
                rCount++;
            }
            if(ch == 'L'){
                lCount++;
            }
            if(rCount == lCount){
                counter++;
            }
        }

        return counter;
    }
}
