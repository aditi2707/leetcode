class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int c = 0;

        for(Integer i: nums){
            if(!set.contains(i)){
                set.add(i);
            }
            else{
                ans[c] = i;
                c++;

                if(c >= 2){
                    break;
                }
            }
        }

        return ans;
    }
}
