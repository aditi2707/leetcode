class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        int counter = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < allowed.length(); i++){
            set.add(allowed.charAt(i));
        }

        for(int i = 0; i < words.length; i++){
            int flag = 0;
            for(int j = 0; j < words[i].length(); j++){
                if(!set.contains(words[i].charAt(j))){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                counter++;
            }
        }

        return counter;








        // int flag = 0;
        // int counter = 0;
        
        // for(int i = 0; i < words.length; i++){
        //     for(int j = 0; j < words[i].length(); j++){
        //         if(allowed.indexOf(words[i].charAt(j)) != -1){
        //             continue;
        //         }
        //         else{
        //             flag = 1;
        //             break;
        //         }
        //     }
        //     if(flag == 0){
        //         counter++;
        //     }
        //     else{
        //         flag = 0;
        //     }
        // }

        // return counter;
    }
}
