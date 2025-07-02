class Solution {
    public String reverseVowels(String s) {

        // Time Complexity : O(n + 10 + n + n)
        // The string functions may take upto linear TC.

        // Space Complexity : O(n + 10)
        

        char[] arr = s.toCharArray();
        
        int i = 0, j = arr.length - 1;
        Set<Character> set = new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        while(i < j){

            if(set.contains(arr[i]) && set.contains(arr[j])){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(set.contains(arr[i])){
                j--;
            }
            else{
                i++;
            }
        }

        return new String(arr);
    }
}
