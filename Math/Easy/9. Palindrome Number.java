class Solution {
    public boolean isPalindrome(int x) {

        // // Time Complexity : O(log n)

        // // Space Complexity : O(1)


        if(x < 0){
            return false;
        }

        int rev = 0;
        int n = x;

        while(n > 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        return x == rev;






        // // Time Complexity : O(log n)

        // // Space Complexity : O(1)


        // if(x == Integer.MIN_VALUE || x == Integer.MAX_VALUE){
        //     return false;
        // }

        // int rev = 0;
        // int n = Math.abs(x);
        // int same = 0;

        // while(n > 0){
        //     int d = n % 10;
        //     if(d != x % 10){
        //         same++;
        //     }
        //     rev = rev * 10 + d;
        //     n /= 10;
        // }

        // if(x < 0){
        //     if(same == 0){
        //         return true;
        //     }
        //     return false;
        // }

        // return x == rev;





        // // Time Complexity : O(n)

        // // Space Complexity : O(n)

        
        // String num = String.valueOf(x);
        // String rev = "";

        // int i = 0;

        // while(i < num.length()){
        //     char ch = num.charAt(i);
        //     rev = ch + rev;
        //     i++;
        // }

        // return num.equals(rev);
    }
}
