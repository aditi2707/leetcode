class Solution {
    public int[] plusOne(int[] digits) {

        // Time Complexity: O(n)

        // Space Complexity: O(n) (if we need an array to accomodate the carry)
        
        
        int sum = 0, carry = 1;

        for(int i = digits.length - 1; i >= 0; i--){
            sum = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;

            digits[i] = sum;
        }

        if(carry == 0){
            return digits;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = carry;

        for(int i = 0; i < digits.length; i++){
            ans[i + 1] = digits[i];
        }

        return ans;
    }
}
