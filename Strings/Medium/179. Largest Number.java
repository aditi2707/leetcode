class Solution {

    private boolean compareTo(String a, String b){

        return (a + b).compareTo(b + a) > 0;
    }


    public String largestNumber(int[] nums) {

        // Time Complexity : O(n + nlog n + n)

        // Space Complexity : O(n)
        
        String ans = "";
        String[] s = new String[nums.length];

        for(int i = 0; i < nums.length; i++){
            s[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(s, (a, b) -> compareTo(a, b)? -1 : 1);

        if(s[0].equals("0")){
            return "0";
        }

        for(int i = 0; i < s.length; i++){
            ans += s[i];
        }

        return ans;
    }
}
