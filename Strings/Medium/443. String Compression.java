class Solution {
    public int compress(char[] chars) {

        int i = 0;
        int index = 0;

        while(i < chars.length){

            char ch = chars[i];
            int j = i;

            while(j < chars.length && chars[j] == ch){
                j++;
            }

            chars[index] = ch;
            index++;

            if((j - i) > 1){
                String s = String.valueOf(j - i);
                for(int k = 0; k < s.length(); k++){
                    chars[index] = s.charAt(k);
                    index++;
                }
            }
            
            i = j;
        }

        return index;




        
        // String s = "";
        // int i = 0;
        // int index = 0;

        // while(i < chars.length){

        //     char ch = chars[i];
        //     int j = i;

        //     while(j < chars.length && chars[j] == ch){
        //         j++;
        //     }

        //     if((j - i) == 1){
        //         s += ch;
        //     }
        //     else{
        //         s += ch + String.valueOf(j - i);
        //     }
            
        //     i = j;
        // }

        // for(int j = 0; j < s.length(); j++){
        //     chars[j] = s.charAt(j);
        // }

        // return s.length();
    }
}
