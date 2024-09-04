class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            return a[0] == b[0] ? b[1] - a[1] : b[0] - a[0];
        });
        String[] ans = new String[score.length];

        if(ans.length == 1){
            return new String[]{"Gold Medal"};
        }

        for(int i = 0; i < score.length; i++){
            maxHeap.add(new int[]{score[i], i});
        }

        ans[maxHeap.poll()[1]] = "Gold Medal";
        if(ans.length == 1){
            return ans;
        }

        ans[maxHeap.poll()[1]] = "Silver Medal";
        if(ans.length == 2){
            return ans;
        }

        ans[maxHeap.poll()[1]] = "Bronze Medal";

        int rank = 4;
        while(maxHeap.size() > 0){
            ans[maxHeap.poll()[1]] = String.valueOf(rank);
            rank++;
        }

        return ans;
    }
}
