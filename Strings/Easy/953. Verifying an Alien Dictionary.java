class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        for(int i = 0; i < words.length-1; i++){
            String next = words[i+1];
            if(words[i].charAt(0) != next.charAt(0)){
                if(order.indexOf(words[i].charAt(0)) > order.indexOf(next.charAt(0))){
                    return false;
                }
            }
            else{
                int k = 0;
                while(k < words[i].length() && k < next.length()){
                    if(words[i].charAt(k) != next.charAt(k)){
                        break;
                    }
                    k++;
                }

                if(words[i].length() != next.length() && k >= next.length()){
                    return false;
                }
                else if(k < words[i].length() && k < next.length()){
                    if(order.indexOf(words[i].charAt(k)) > order.indexOf(next.charAt(k))){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
