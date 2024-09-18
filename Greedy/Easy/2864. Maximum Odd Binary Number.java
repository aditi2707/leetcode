class Solution {
    public String maximumOddBinaryNumber(String s) {

        String one = "";
        String zero = "";
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                one += "1";
            }
            else{
                zero += "0";
            }
        }

        ans = one.substring(0, one.length()-1) + zero;
        ans += "1";
    
        return ans;






        // char[] c = s.toCharArray();
        // Arrays.sort(c);

        // String ans = "";

        // for(int i = 0; i < c.length-1; i++){
        //     ans = c[i] + ans;
        // }

        // ans += "1";
        // return ans;
        
    }
}
