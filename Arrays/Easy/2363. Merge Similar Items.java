class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        int[] freq = new int[1001];
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;

        for(int i = 0; i < items1.length; i++){
            freq[items1[i][0]] += items1[i][1];
        }

        for(int i = 0; i < items2.length; i++){
            freq[items2[i][0]] += items2[i][1];
        }


        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                ans.add(new ArrayList<>());
                ans.get(index).add(i);
                ans.get(index).add(freq[i]);
                index++;
            }
        }

        return ans;



        
        // List<List<Integer>> ans = new ArrayList<>();
        // Map<Integer, Integer> map = new HashMap<>();
        // int index = 0;

        // for(int i = 0; i < items1.length; i++){
        //     if(!map.containsKey(items1[i][0])){
        //         map.put(items1[i][0], items1[i][1]);
        //     }
        //     else{
        //         map.put(items1[i][0], map.get(items1[i][0])+items1[i][1]);
        //     }
        // }

        // for(int i = 0; i < items2.length; i++){
        //     if(!map.containsKey(items2[i][0])){
        //         map.put(items2[i][0], items2[i][1]);
        //     }
        //     else{
        //         map.put(items2[i][0], map.get(items2[i][0])+items2[i][1]);
        //     }
        // }

        // for(Integer i: map.keySet()){
        //     ans.add(new ArrayList<>());
        //     ans.get(index).add(i);
        //     ans.get(index).add(map.get(i));
        //     index++;
        // }

        // Collections.sort(ans, (a,b) -> Integer.compare(a.get(0), b.get(0)));
        // return ans;

    }
}
