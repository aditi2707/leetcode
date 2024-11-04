class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            return a[0] == b[0] ? b[1] - a[1] : b[0] - a[0];
        });

        for(int i = 0; i < points.length; i++){
            int distance = (int)(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
            maxHeap.add(new int[]{distance, i});

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] ans = new int[maxHeap.size()][2];
        int index = 0;

        while(maxHeap.size() > 0){
            int[] poll = maxHeap.poll();
            int ind = poll[1];
            ans[index][0] = points[ind][0];
            ans[index][1] = points[ind][1];

            index++;
        }

        return ans;
    }
}
