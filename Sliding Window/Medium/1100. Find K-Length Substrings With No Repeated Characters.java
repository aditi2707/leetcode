class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
        
        Set<Character> set = new HashSet<>();
        int count = 0;

        int i = 0, j = 0;

        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                if(set.size() == k){
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
    }
}
