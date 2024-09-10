class Solution {
    public int findJudge(int n, int[][] trust) {
        
        // HashMap<Integer, Integer> inDeg = new HashMap<>();
        // HashMap<Integer, Integer> outDeg = new HashMap<>();

        int[] deg = new int[n+1];

        if(trust.length == 0 && n <= 1){
            return n;
        }

        for(int i = 0; i < trust.length; i++){

            deg[trust[i][0]] -= 1;
            deg[trust[i][1]] += 1;

            // if(!inDeg.containsKey(trust[i][1])){
            //     inDeg.put(trust[i][1], 1);
            // }
            // else{
            //     inDeg.put(trust[i][1], inDeg.get(trust[i][1]) + 1);
            // }

            // if(!outDeg.containsKey(trust[i][0])){
            //     outDeg.put(trust[i][0], 1);
            // }
            // else{
            //     outDeg.put(trust[i][0], outDeg.get(trust[i][0]) + 1);
            // }
        }

        for(int i = 1; i <= n; i++){

            if(deg[i] == n-1){
                return i;
            }
            // if(!outDeg.containsKey(i) && (inDeg.containsKey(i) && inDeg.get(i) == n-1)){
            //     return i;
            // }
        }

        return -1;
    }
}
