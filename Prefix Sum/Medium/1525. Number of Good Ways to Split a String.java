class Solution {
    public int numSplits(String s) {

        // Time Complexity : O(n + n)

        // Space Complexity : O(n + n)
        
        
        Set<Character> left = new HashSet<>();
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = s.length() - 1; i >= 1; i--){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
                right++;
            }
        }

        if(!map.containsKey(s.charAt(0))){
            map.put(s.charAt(0), 0);
        }

        left.add(s.charAt(0));

        for(int i = 1; i < s.length(); i++){
            if(left.size() == right){
                count++;
            }
            left.add(s.charAt(i));
            if(map.get(s.charAt(i)) == i){
                right--;
            }
        }

        return count;






        // // Time Complexity : O(n + n)

        // // Space Complexity : O(n + n + n)

        
        // Set<Character> left = new HashSet<>();
        // Set<Character> right = new HashSet<>();
        // Map<Character, Integer> map = new HashMap<>();
        // int count = 0;

        // for(int i = s.length() - 1; i >= 1; i--){
        //     right.add(s.charAt(i));
        //     if(!map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), i);
        //     }
        // }

        // if(!map.containsKey(s.charAt(0))){
        //     map.put(s.charAt(0), 0);
        // }

        // left.add(s.charAt(0));

        // for(int i = 1; i < s.length(); i++){
        //     if(left.size() == right.size()){
        //         count++;
        //     }
        //     left.add(s.charAt(i));
        //     if(map.get(s.charAt(i)) == i){
        //         right.remove(s.charAt(i));
        //     }
        // }

        // return count;
    }
}
