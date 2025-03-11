class Solution {

    private String backtracking(int length, Set<String> set, String str){

        if(str.length() == length){
            if(!set.contains(str)){
                return str;
            }
            return "";
        }

        String res = backtracking(length, set, str + "0");
        if(res.length() != 0){
            return res;
        }
        return backtracking(length, set, str + "1");
    }


    public String findDifferentBinaryString(String[] nums) {

        // Time Complexity : O(n + n ^ 2).
        // The for loop for the set will take linear TC. The backtracking() can take
        // a maximum of O(2 ^ n) TC. But the function will stop as soon as the first
        // answer is found. So the maximum that it can go is n ^ 2.

        // Space Complexity : O(n) (if the output array is ignored).
        // Set will take linear space.
        
        
        Set<String> set = new HashSet<>();

        for(String s: nums){
            set.add(s);
        }

        return backtracking(nums.length, set, "");
    }
}
