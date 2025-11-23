class Solution {
    public String reverseVowels(String s) {


        // Time Complexity : O(n + 10)
        // If all the letters are composite, the loop will run for all n letters

        // Space Complexity : O(n) (if we consider the char array)
        
        
        int i = 0, j = s.length() - 1;
        String vowels = "AEIOUaeiou";
        char[] arr = s.toCharArray();

        while(i < j){
            char ch1 = arr[i];
            char ch2= arr[j];

            if(vowels.indexOf(ch1) != -1 && vowels.indexOf(ch2) != -1){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
            else if(vowels.indexOf(ch1) == -1){
                i++;
            }
            else{
                j--;
            }
        }

        return new String(arr);




        

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
