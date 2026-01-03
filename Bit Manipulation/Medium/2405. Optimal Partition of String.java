class Solution {
    public int partitionString(String s) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
        

        int count = 0;
        int mask = 0;

        for(char ch: s.toCharArray()){
            int shift = ch - 'a';

            if((mask & (1 << shift)) > 0){
                count++;
                mask = 0;
            }

            mask |= 1 << shift;
        }

        count++;

        return count;





        // // Time Complexity : O(n)

        // // Space Complexity : O(n)

        
        // Set<Character> set = new HashSet<>();
        // int count = 0;

        // for(char ch: s.toCharArray()){
        //     if(set.contains(ch)){
        //         count++;
        //         set.clear();
        //     }
        //     set.add(ch);
        // }

        // count++;

        // return count;
    }
}
