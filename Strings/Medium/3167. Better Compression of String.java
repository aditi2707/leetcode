class Solution {
    public String betterCompression(String compressed) {
        /*
        Time Complexity : O(compressed.length() + 26)
        
        Because even though we are running nested loops in the first loop, the pointer is going through each character only ONCE. In the second loop,
        traversals are constant i.e. 26.
        
        Space Complexity : O(26 + compressed.length())
        
        Because the frequency array will only have alphabets so 26. We are using separate array to convert the string into an array of characters so 
        that will be equal to the length of the string. If we do not ignore the output and the output can be of sufficient length, so that will also          be counted. If all the characters are different and each frequency is 10000, then total length can be (26 + 10000 * 26).
        */
        

        int[] freq = new int[26];
        char[] arr = compressed.toCharArray();
        int i = 0;

        while(i < arr.length){
            char ch = arr[i];
            if(Character.isLetter(ch)){
                int j = i + 1;
                int num = 0;
                while(j < arr.length && Character.isDigit(arr[j])){
                    num = num * 10 + (arr[j] - '0');
                    j++;
                }

                freq[ch - 'a'] += num;
                i = j;
            }
        }

        String ans = "";

        for(char c = 'a'; c <= 'z'; c++){
            if(freq[c - 'a'] != 0){
                ans += c + String.valueOf(freq[c - 'a']);
            }
        }

        return ans;


        

        // int i = 0;
        // PriorityQueue<Character> queue = new PriorityQueue<>();
        // int[] freq = new int[26];
        // String ans = "";

        // while(i < compressed.length()){
        //     if(Character.isLetter(compressed.charAt(i))){
        //         int j = i+1;
        //         String num = "";
        //         while(j < compressed.length() && Character.isDigit(compressed.charAt(j))){
        //             num += compressed.charAt(j);
        //             j++;
        //         }
        //         if(freq[compressed.charAt(i) - 'a'] == 0){
        //             queue.add(compressed.charAt(i));
        //         }
        //         freq[compressed.charAt(i) - 'a'] += Integer.parseInt(num);
                
        //         i = j;
        //     }
        // }

        // while(!queue.isEmpty()){
        //     char c = queue.poll();
        //     ans += c + String.valueOf(freq[c - 'a']);
        // }

        // return ans;


        
        
        // PriorityQueue<Character> queue = new PriorityQueue<>();
        // HashMap<Character, Integer> map = new HashMap<>();
        // String ans = "";

        // char ch = compressed.charAt(0);
        // String num = "";

        // for(int i = 1; i < compressed.length(); i++){
        //     char letter = compressed.charAt(i);

        //     if(!Character.isDigit(letter)){
        //         if(!map.containsKey(ch)){
        //             map.put(ch, Integer.parseInt(num));
        //             queue.add(ch);
        //         }
        //         else{
        //             map.put(ch, map.get(ch)+Integer.parseInt(num));
        //         }
        //         ch = letter;
        //         num = "";
        //     }
        //     else{
        //         num += letter;
        //     }

        // }
        // if(!map.containsKey(ch)){
        //     map.put(ch, Integer.parseInt(num));
        //     queue.add(ch);
        // }
        // else{
        //     map.put(ch, map.get(ch)+Integer.parseInt(num));
        // }


        // while(!queue.isEmpty()){
        //     char c = queue.poll();
        //     ans += c + String.valueOf(map.get(c));
        // }

        // return ans;
    }
}
