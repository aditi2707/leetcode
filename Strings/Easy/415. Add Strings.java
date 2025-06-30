class Solution {
    public String addStrings(String num1, String num2) {

        // Time Complexity : O(max(num1_len, num2_len) + max(num1_len, num2_len))
        // The reverse operation will take half of the max(num1, num2).

        // Space Complexity : O(n)
        
        
        StringBuilder sb = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while(i >= 0 && j >= 0){
            int n1 = num1.charAt(i) - '0';
            int n2 = num2.charAt(j) - '0';

            int sum = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) / 10;

            sb.append(String.valueOf(sum));

            i--;
            j--;
        }

        while(i >= 0){
            int n1 = num1.charAt(i) - '0';
            int sum = (n1 + carry) % 10;
            carry = (n1 + carry) / 10;

            sb.append(String.valueOf(sum));
            i--;
        }
        while(j >= 0){
            int n2 = num2.charAt(j) - '0';
            int sum = (n2 + carry) % 10;
            carry = (n2 + carry) / 10;

            sb.append(String.valueOf(sum));
            j--;
        }

        if(carry == 1){
            sb.append(String.valueOf(carry));
        }

        return new String(sb.reverse());
    }
}
