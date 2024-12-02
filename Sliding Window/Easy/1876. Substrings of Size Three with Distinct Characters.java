class Solution {
    public int countGoodSubstrings(String s) {
        
        Set<Character> set = new HashSet<>();

        int i = 0, j = 0, count = 0;

        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                if(set.size() == 3){
                    count++;
                    set.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
            else{
                while(set.contains(s.charAt(j))){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
                j++;
            }
        }

        return count;






        // int count = 0;

        // for(int i = 0; i <= s.length() - 3; i++){
        //     if(s.charAt(i) != s.charAt(i + 1) && 
        //         s.charAt(i + 1) != s.charAt(i + 2) && 
        //         s.charAt(i) != s.charAt(i + 2)){
        //             count++;
        //     }
        // }

        // return count;








        // Set<Character> set = new HashSet<>();
        // int charCount = 0;
        // int counter = 0;

        // int i = 0, j = 0;

        // while(j < s.length()){
        //     set.add(s.charAt(j));
                
        //     if(j - i + 1 < 3){
        //         j++;
        //     }
        //     else if(j - i + 1 == 3){
        //         if(set.size() == 3){
        //             counter++;
        //         }
        //         if(set.contains(s.charAt(i))){
        //             set.remove(s.charAt(i));
        //         }
        //         i++;
        //         set.add(s.charAt(i));
        //         set.add(s.charAt(j));
        //         j++;
        //     }
        // }

        // return counter;
    }
}
