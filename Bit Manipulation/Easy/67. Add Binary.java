class Solution {
    public String addBinary(String a, String b) {

        // Time Complexity : O(n + m)

        // Space Complexity : O(n + m)
        
        
        String ans = "";
        int carry = 0;

        int i = a.length() - 1, j = b.length() - 1;

        while(i >= 0 && j >= 0){
            char chA = a.charAt(i);
            char chB = b.charAt(j);

            if(chA == '0' && chB == '0'){
                if(carry == 1){
                    ans = "1" + ans;
                    carry = 0;
                }
                else{
                    ans = "0" + ans;
                }
            }
            else if(chA == '0' && chB == '1' || chA == '1' && chB == '0'){
                if(carry == 1){
                    ans = "0" + ans;
                    carry = 1;
                }
                else{
                    ans = "1" + ans;
                }
            }
            else{
                if(carry == 1){
                    ans = "1" + ans;
                }
                else{
                    ans = "0" + ans;
                }
                carry = 1;
            }

            i--;
            j--;
        }

        while(i >= 0){
            char chA = a.charAt(i);

            if(chA == '0'){
                if(carry == 1){
                    ans = "1" + ans;
                    carry = 0;
                }
                else{
                    ans = "0" + ans;
                }
            }
            else{
                if(carry == 1){
                    ans = "0" + ans;
                    carry = 1;
                }
                else{
                    ans = "1" + ans;
                    carry = 0;
                }
            }

            i--;
        }

        while(j >= 0){
            char chB = b.charAt(j);

            if(chB == '0'){
                if(carry == 1){
                    ans = "1" + ans;
                    carry = 0;
                }
                else{
                    ans = "0" + ans;
                }
            }
            else{
                if(carry == 1){
                    ans = "0" + ans;
                    carry = 1;
                }
                else{
                    ans = "1" + ans;
                    carry = 0;
                }
            }

            j--;
        }

        if(carry == 1){
            ans = "1" + ans;
        }

        return ans;
    }
}
