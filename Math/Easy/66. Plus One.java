class Solution {
    public int[] plusOne(int[] digits) {

        // Time Complexity : O(n)

        // Space Complexity : O(1)
    

        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;






        // // Time Complexity : O(n * 2)

        // // Space Complexity : O(n)

        
        // List<Integer> list = new ArrayList<>();
        // int sum = 0, carry = 1;

        // for(int i = digits.length - 1; i >= 0; i--){
        //     sum = (digits[i] + carry) % 10;
        //     carry = (digits[i] + carry) / 10;

        //     list.add(sum);
        // }

        // if(carry != 0){
        //     list.add(carry);
        // }

        // int[] ans = new int[list.size()];

        // for(int i = list.size() - 1; i >= 0; i--){
        //     ans[list.size() - 1 - i] = list.get(i);
        // }

        // return ans;
    }
}
