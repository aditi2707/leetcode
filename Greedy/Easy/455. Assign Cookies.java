class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int p = s.length-1;

        for(int i = g.length-1; i >= 0; i--){

            if(p < 0){
                break;
            }
            if(g[i] <= s[p]){
                child++;
                p--;
            }
        }

        return child;
    }
}
