class Solution {
    public int minChanges(String s) {
        
        char[] c = s.toCharArray();

        int ans = 0;

        for(int i = 0; i < c.length; i += 2){
            int first = c[i];
            int second = c[i + 1];

            if(first != second){
                ans++;
            }
        }

        return ans;
    }
}
