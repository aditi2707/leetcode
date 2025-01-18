class Solution {
    public boolean checkRecord(String s) {
        
        int absNum = 0, i = 0;

        while(i < s.length()){
            char ch = s.charAt(i);
            if(ch == 'A'){
                absNum++;
                i++;
                if(absNum >= 2){
                    return false;
                }
            }
            else if(ch == 'L'){
                int j = i;
                while(j < s.length() && s.charAt(j) == 'L'){
                    if((j - i + 1) >= 3){
                        return false;
                    }
                    j++;
                }
                i = j;
            }
            else{
                i++;
            }
        }

        return true;
    }
}
