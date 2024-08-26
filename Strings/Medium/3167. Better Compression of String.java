class Solution {
    public String betterCompression(String compressed) {

        int i = 0;
        PriorityQueue<Character> queue = new PriorityQueue<>();
        int[] freq = new int[26];
        String ans = "";

        while(i < compressed.length()){
            if(Character.isLetter(compressed.charAt(i))){
                int j = i+1;
                String num = "";
                while(j < compressed.length() && Character.isDigit(compressed.charAt(j))){
                    num += compressed.charAt(j);
                    j++;
                }
                if(freq[compressed.charAt(i) - 'a'] == 0){
                    queue.add(compressed.charAt(i));
                }
                freq[compressed.charAt(i) - 'a'] += Integer.parseInt(num);
                
                i = j;
            }
        }

        while(!queue.isEmpty()){
            char c = queue.poll();
            ans += c + String.valueOf(freq[c - 'a']);
        }

        return ans;


        
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
