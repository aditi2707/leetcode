class MagicDictionary {

    Set<String> set;

    public MagicDictionary() {
        set = new HashSet<>();
    }
    
    public void buildDict(String[] dictionary) {
        
        for(String s: dictionary){
            set.add(s);
        }

        return;
    }
    
    public boolean search(String searchWord) {
        
        for(String s: set){
            if(s.length() != searchWord.length()){
                continue;
            }
            else{
                int c = 0;
                int j = 0;
                while(j < s.length()){
                    if(s.charAt(j) != searchWord.charAt(j)){
                        c++;
                        if(c > 1){
                            break;
                        }
                    }
                    j++;
                }
                if(c == 1){
                    return true;
                }
            }
        }

        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */
