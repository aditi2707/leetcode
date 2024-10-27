class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int[]> list = new ArrayList<>();
        int ind = -1;

        for(int i = 0; i < intervals.length; i++){
            if(intervals[i][1] < newInterval[0]){
                list.add(intervals[i]);
            }
            else if(intervals[i][0] > newInterval[1]){
                ind = i;
                list.add(newInterval);
                break;
            }
            else{
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }

        if(ind != -1){
            for(int i = ind; i < intervals.length; i++){
                list.add(intervals[i]);
            }
        }
        else{
            list.add(newInterval);
        }


        int[][] ans = new int[list.size()][2];

        for(int i = 0; i < list.size(); i++){
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }

        return ans;
    }
}
