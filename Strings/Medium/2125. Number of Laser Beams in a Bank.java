class Solution {
    public int numberOfBeams(String[] bank) {
        
        //HashMap<Integer, Integer> hashMap = new HashMap<>();
        int ans = 0;
        int prev = 0;

        for(int i = 0; i < bank.length; i++){
            int counter = 0;
            for(int j = 0; j < bank[i].length(); j++){
                char ch = bank[i].charAt(j);
                if(ch == '1'){
                    counter++;
                }
            }
            
            if(counter > 0){
                ans += prev * counter;
                prev = counter;
                //hashMap.put(k, counter);
                //k++;
            }
        }

        // for(int i = 0; i < hashMap.size()-1; i++){
        //     ans += hashMap.get(i) * hashMap.get(i+1);
        // }

        // for(int i = 0; i < hashMap.size()-1; i++){
        //     if(hashMap.get(i) != 0){
        //         int j = i+1;
        //         while(j < hashMap.size()){
        //             if(hashMap.get(j) != 0){
        //                 break;
        //             }
        //             j++;
        //         }
        //         if(j < hashMap.size()){
        //             ans += hashMap.get(i) * hashMap.get(j);
        //         }
                
        //     }
        // }
        return ans;
    }
}
