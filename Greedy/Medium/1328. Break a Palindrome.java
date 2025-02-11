class Solution {
    public String breakPalindrome(String palindrome) {
        
        // Time Complexity : O(n / 2 + n). Because the .toCharArray() takes linear 
        // time.

        // Space Complexity : O(n)


        if(palindrome.length() == 1){
            return "";
        }

        int ans = -1;

        char[] arr = palindrome.toCharArray();

        for(int i = 0; i < arr.length / 2; i++){
            char ch = arr[i];

            if(ch != 'a'){
                arr[i] = 'a';
                return new String(arr);
            }
        }

        arr[arr.length - 1] = 'b';
        return new String(arr);
    }
}
