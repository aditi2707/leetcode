class Solution {
    public int partitionString(String s) {
        
        Set<Character> set = new HashSet<>();
        int partition = 0;

        int i = 0;

        while(i < s.length()){
            char ch = s.charAt(i);

            if(!set.contains(ch)){
                set.add(ch);
                i++;
            }
            else{
                partition++;
                set.clear();
            }
        }

        if(set.size() != 0){
            partition++;
        }

        return partition;
    }
}
