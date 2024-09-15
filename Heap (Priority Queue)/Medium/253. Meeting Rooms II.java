class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        minHeap.add(intervals[0][1]);

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < minHeap.peek()){
                minHeap.add(intervals[i][1]);
            }
            else{
                minHeap.poll();
                minHeap.add(intervals[i][1]);
            }
        }
        
        return minHeap.size();
    }
}
