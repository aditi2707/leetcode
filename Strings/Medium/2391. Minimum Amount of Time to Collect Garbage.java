class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int minutes = garbage[0].length() + garbage[garbage.length-1].length();
        boolean p = false;
        boolean m = false;
        boolean g = false;

        for(int i = 1; i < travel.length; i++){
            travel[i] += travel[i - 1];
            minutes += garbage[i].length();
        }

        for(int i = garbage.length-1; i >= 1; i--){
            if(garbage[i].indexOf("P") != -1 && !p){
                minutes += travel[i - 1];
                p = true;
            }
            if(garbage[i].indexOf("M") != -1 && !m){
                minutes += travel[i - 1];
                m = true;
            }
            if(garbage[i].indexOf("G") != -1 && !g){
                minutes += travel[i - 1];
                g = true;
            }

            if(p && m && g){
                break;
            }
        }

        return minutes;
    }
}
