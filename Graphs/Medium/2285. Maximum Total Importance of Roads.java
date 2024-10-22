class Solution {
    public long maximumImportance(int n, int[][] roads) {

        int[] graph = new int[n];
        long sum = 0;

        for(int i = 0; i < roads.length; i++){
            graph[roads[i][0]]++;
            graph[roads[i][1]]++;
        }

        Arrays.sort(graph);

        for(int i = graph.length - 1; i >= 0; i--){
            sum += (long)graph[i] * n;
            n--;
        }

        return sum;






        
        // PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0] ? b[1] - a[1] : b[0] - a[0];
        // });

        // int[] graph = new int[n];
        // long sum = 0;

        // for(int i = 0; i < roads.length; i++){
        //     graph[roads[i][0]]++;
        //     graph[roads[i][1]]++;
        // }

        // for(int i = 0; i < graph.length; i++){
        //     minHeap.add(new int[]{graph[i], i});
        // }

        // for(int i = 0; i < graph.length; i++){
        //     int[] arr = minHeap.poll();
        //     graph[arr[1]] = n;
        //     n--;
        // }

        // for(int i = 0; i < roads.length; i++){
        //     sum += (long)graph[roads[i][0]] + graph[roads[i][1]];
        // }

        // return sum;
    }
}
