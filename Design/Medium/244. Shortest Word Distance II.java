class WordDistance {

    Map<String, List<Integer>> map;

    public WordDistance(String[] wordsDict) {

        map = new HashMap<>();
        for(int i = 0; i < wordsDict.length; i++){
            if(!map.containsKey(wordsDict[i])){
                map.put(wordsDict[i], new ArrayList<>());
            }
            map.get(wordsDict[i]).add(i);
        }
    }
    
    public int shortest(String word1, String word2) {
        
        List<Integer> l1 = map.get(word1);
        List<Integer> l2 = map.get(word2);
        int min = Integer.MAX_VALUE;

        for(Integer i: l1){
            for(Integer j: l2){
                min = Math.min(min, Math.abs(i - j));
            }
        }

        return min;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(wordsDict);
 * int param_1 = obj.shortest(word1,word2);
 */
