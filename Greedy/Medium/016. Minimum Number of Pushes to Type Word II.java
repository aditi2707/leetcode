class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

        char[] c = word.toCharArray();

        for(Character ch: c){
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        int counter = 0;
        int prod = 1;
        int push = 0;

        for(int i = freq.length-1; i >= 0; i--){
            if(freq[i] != 0){
                if(counter > 7){
                    counter = 0;
                    prod += 1;
                }
                push += prod * freq[i];
                counter++;
            }
            else{
                break;
            }
        }

        return push;




        
        // PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0] ? b[1] - a[1] : b[0] - a[0];
        // });

        // Map<Character, Integer> map = new HashMap<>();

        // char[] c = word.toCharArray();

        // for(Character ch: c){
        //     if(!map.containsKey(ch)){
        //         map.put(ch, 1);
        //     }
        //     else{
        //         map.put(ch, map.get(ch) + 1);
        //     }
        // }

        // for(Character ch: map.keySet()){
        //     maxHeap.add(new int[]{map.get(ch), ch - 'a'});
        // }

        // int counter = 0;
        // int prod = 1;
        // int push = 0;

        // while(maxHeap.size() > 0){
        //     if(counter < 8){
        //         push += prod * maxHeap.poll()[0];
        //         counter++;
        //     }
        //     else{
        //         counter = 0;
        //         prod += 1;
        //     }
        // }

        // return push;
    }
}
