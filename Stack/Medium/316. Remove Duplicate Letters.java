class Solution {
    public String removeDuplicateLetters(String s) {

        // Time Complexity : O(n + n + stack_size)
        // Although there are two nested loops, the average TC is bounded by O(n).
        // For the case when every item is unique, the while loop won't run.
        // For the case when every character is equal, it will run only once.

        // Space Complexity : O(n + n + n)
        
        
        String ans = "";
        Stack<Character> stack = new Stack<>();
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;

        for(int j = 0; j < s.length(); j++){
            map.put(s.charAt(j), j);
        }

        while(i < s.length()){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                while(!stack.isEmpty() && ch < stack.peek() && map.get(stack.peek()) > i){
                    set.remove(stack.pop());
                }
                set.add(ch);
                stack.push(ch);
            }            
            i++;
        }

        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }

        return ans;
        
    }
}
