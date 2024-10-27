class Solution {
    public int minMeetingRooms(int[][] intervals) {

        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        int count = 0;
        int ans = 0;

        for(int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;

        while(i < start.length){
            if(start[i] < end[j]){
                count++;
                i++;
            }
            else{
                count--;
                j++;
            }
            ans = Math.max(ans, count);
        }

        return ans;






        
        
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // minHeap.add(intervals[0][1]);

        // for(int i = 1; i < intervals.length; i++){
        //     if(intervals[i][0] < minHeap.peek()){
        //         minHeap.add(intervals[i][1]);
        //     }
        //     else{
        //         minHeap.poll();
        //         minHeap.add(intervals[i][1]);
        //     }
        // }
        
        // return minHeap.size();
    }
}
