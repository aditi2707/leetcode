class Solution {

    private boolean backtracking(String s, double s1, int index){

        if(index == s.length()){
            return true;
        }

        for(int i = index; i < s.length(); i++){
            double s2 = Double.parseDouble(s.substring(index, i + 1));
            if(s1 == s2 + 1 && backtracking(s, s2, i + 1)){
                return true;
            }
        }

        return false;
    }


    public boolean splitString(String s) {

        for(int i = 0; i < s.length() - 1; i++){
            double s1 = Double.parseDouble(s.substring(0, i + 1));
            if(backtracking(s, s1, i + 1)){
                return true;
            }
        }
        
        return false;
    }
}
