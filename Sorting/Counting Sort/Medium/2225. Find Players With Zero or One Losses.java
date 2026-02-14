class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        // Time Complexity : O(100000 + n + 100000)

        // Space Complexity : O(100000)
        
        
        int[] freq = new int[100001];
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.fill(freq, -1);

        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        for(int i = 0; i < matches.length; i++){
            int winner = matches[i][0];
            int loser = matches[i][1];

            if(freq[winner] == -1){
                freq[winner] = 0;
            }
            if(freq[loser] == -1){
                freq[loser] = 1;
            }
            else{
                freq[loser] += 1;
            }
        }

        for(int i = 0; i <= 100000; i++){
            if(freq[i] == 0){
                ans.get(0).add(i);
            }
            if(freq[i] == 1){
                ans.get(1).add(i);
            }
        }

        return ans;







        // // Time Complexity : O(n * 2 + nlog n)

        // // Space Complexity : O(n)

        
        // Map<Integer, Integer> map = new HashMap<>();
        // List<List<Integer>> ans = new ArrayList<>();

        // ans.add(new ArrayList<>());
        // ans.add(new ArrayList<>());

        // for(int i = 0; i < matches.length; i++){
        //     int winner = matches[i][0];
        //     int loser = matches[i][1];

        //     if(!map.containsKey(winner)){
        //         map.put(winner, 0);
        //     }
        //     if(!map.containsKey(loser)){
        //         map.put(loser, 1);
        //     }
        //     else{
        //         map.put(loser, map.get(loser) + 1);
        //     }
        // }

        // for(Integer i: map.keySet()){
        //     if(map.get(i) == 0){
        //         ans.get(0).add(i);
        //     }
        //     if(map.get(i) == 1){
        //         ans.get(1).add(i);
        //     }
        // }

        // Collections.sort(ans.get(0));
        // Collections.sort(ans.get(1));

        // return ans;
    }
}
