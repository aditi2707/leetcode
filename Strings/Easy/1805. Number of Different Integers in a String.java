class Solution {
    public int numDifferentIntegers(String word) {
        
        Set<String> set = new HashSet<>();
        String temp = "";

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);

            if(!Character.isDigit(ch)){
                word = word.substring(0, i) + " " + word.substring(i+1);
            }
        }

        
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != ' '){
                temp += word.charAt(i);
            }
            if(word.charAt(i) == ' ' && temp != ""){
                int j = 0;
                while(j < temp.length() && temp.charAt(j) == '0'){
                    j++;
                }
                set.add(temp.substring(j));
                temp = "";
            }
        }

        if(temp != ""){
            int j = 0;
            while(j < temp.length() && temp.charAt(j) == '0'){
                j++;
            }
            set.add(temp.substring(j));
        }
        return set.size();
    }
}
