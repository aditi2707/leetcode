class Solution {
    public int minimumKeypresses(String s) {

        int press = 0;

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        for(int i = 25; i >= 0; i--){
            if(i > 16){
                press += freq[i];
            }
            else if(i > 7){
                press += freq[i] * 2;
            }
            else{
                press += freq[i] * 3;
            }
        }

        return press;








        
        // int press = 0;
        // int counter = 1;
        // int product = 1;

        // int[] freq = new int[26];

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);

        //     freq[ch - 'a']++;
        // }

        // Arrays.sort(freq);
        // int i = freq.length - 1;

        // while(i >= 0){
        //     if(freq[i] == 0){
        //         break;
        //     }
        //     if(counter <= 9){
        //         press += freq[i] * product;
        //         counter++;
        //         i--;
        //     }
        //     else{
        //         counter = 1;
        //         product++;
        //     }
        // }

        // return press;




        


        // // Space Complexity : O(26 * 2)
        
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // int[] freq = new int[26];
        // int count = 0, prod = 1, ans = 0;

        // for(char ch: s.toCharArray()){
        //     freq[ch - 'a'] += 1;
        // }

        // for(int i = 0; i < 26; i++){
        //     if(freq[i] == 0){
        //         continue;
        //     }
        //     maxHeap.add(freq[i]);
        // }

        // while(!maxHeap.isEmpty()){

        //     ans += maxHeap.poll() * prod;
        //     count++;

        //     if(count == 9){
        //         prod += 1;
        //         count = 0;
        //     }
        // }

        // return ans;
    }
}
