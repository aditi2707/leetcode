class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
        
        for(int i = 0; i < intervals.length; i++){
            list.add(new ArrayList<>());
            list.get(i).add(intervals[i][0]);
            list.get(i).add(intervals[i][1]);
        }

        int i = 1;

        while(i < list.size()){
            if(list.get(i-1).get(1) >= list.get(i).get(0) && list.get(i).get(1) >= list.get(i-1).get(1)){

                int x = list.get(i-1).get(0);
                int y = list.get(i).get(1);
                list.get(i-1).set(0, x);
                list.get(i-1).set(1, y);
                list.remove(i);
            }
            else if(list.get(i-1).get(1) >= list.get(i).get(0) && list.get(i).get(1) <= list.get(i-1).get(1)){
                list.remove(i);
            }
            else{
                i++;
            } 
        }

        int[][] ans = new int[list.size()][2];

        for(int j = 0; j < ans.length; j++){
            ans[j][0] = list.get(j).get(0);
            ans[j][1] = list.get(j).get(1);
        }

        return ans;
    }
}