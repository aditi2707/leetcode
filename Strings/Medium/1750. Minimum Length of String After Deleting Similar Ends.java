class Solution {
    public int minimumLength(String s) {

        // Time Complexity : O(n / 2)

        // Space Complexity : O(1)
        
        int i = 0, j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                char ch = s.charAt(i);
                int a = i, b = j;
                while(a < j && s.charAt(a) == ch){
                    a++;
                }
                while(b > i && s.charAt(b) == ch){
                    b--;
                }
                i = a;
                j = b;
            }
            else{
                return j - i + 1;
            }
        }

        return i > j? 0 : 1;
    }
}
