class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {

        // Time Complexity : O(n + (26 + n) * 2)

        // Space Complexity : O(26 * 2)
        
        
        int b1 = 0, b2 = 0;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            freq1[s1.charAt(i) - 'a'] += 1;
            freq2[s2.charAt(i) - 'a'] += 1;
        }

        int i = 0, j = 0;

        while(i < 26 && j < 26){
            if(freq1[i] == 0){
                i++;
                continue;
            }
            if(freq2[j] == 0){
                j++;
                continue;
            }

            if((char)(i + 'a') > (char)(j + 'a')){
                b1++; 
            }
            else if((char)(j + 'a') > (char)(i + 'a')){
                b2++;
            }
            else if((char)(i + 'a') == (char)(j + 'a')){
                b1++;
                b2++;
            }

            freq1[i] -= 1;
            freq2[j] -= 1;

            if(freq1[i] <= 0){
                i++;
            }
            if(freq2[j] <= 0){
                j++;
            }
        }

        if(b1 == s1.length() || b2 == s2.length()){
            return true;
        }

        return false;





        // // Time Complexity : O((nlog n) * 2 + n)

        // // Space Complexity : O(n * 2)

        
        // int b1 = 0, b2 = 0;

        // char[] arr1 = s1.toCharArray();
        // char[] arr2 = s2.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // for(int i = 0; i < s1.length(); i++){
        //     if(arr1[i] > arr2[i]){
        //         b1++;
        //     }
        //     else if(arr2[i] > arr1[i]){
        //         b2++;
        //     }
        //     else if(arr1[i] == arr2[i]){
        //         b1++;
        //         b2++;
        //     }
        // }

        // if(b1 == s1.length() || b2 == s2.length()){
        //     return true;
        // }

        // return false;
    }
}
