class Solution {

    private int xor(int[] s, int[] m){

        int ans = 0;

        for(int i = 0; i < s.length; i++){
            ans += s[i] ^ m[i];
        }

        return s.length - ans;
    }

    private void backtracking(int[][] students, int[][] mentors, boolean[] used, 
    int[] ans, int max, int index){

        if(index == used.length){
            ans[0] = Math.max(ans[0], max);
            return;
        }

        for(int i = 0; i < mentors.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            backtracking(students, mentors, used, ans, max + xor(students[index], 
            mentors[i]), index + 1);
            used[i] = false;
        }

        return;
    }


    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        
        int[] ans = {0};
        boolean[] used = new boolean[mentors.length];

        backtracking(students, mentors, used, ans, 0, 0);

        return ans[0];
    }
}
