class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> Integer.compare(a[1], b[1]));

        int sum = 0;

        for(int i = boxTypes.length - 1; i >= 0; i--){
            if(truckSize >= boxTypes[i][0]){
                sum += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else{
                sum += truckSize * boxTypes[i][1];
                break;
            }
        }

        return sum;






        
        // PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0] ? b[1] - a[1] : b[0] - a[0];
        // });

        // int maxSum = 0;

        // for(int i = 0; i < boxTypes.length; i++){
        //     maxHeap.add(new int[]{boxTypes[i][1], boxTypes[i][0]});
        // }

        // while(truckSize > 0 && maxHeap.size() > 0){
        //     int[] item = maxHeap.poll();
        //     if(item[1] != 0){
        //         maxSum += item[0];
        //         item[1] -= 1;
        //         maxHeap.add(item);
        //         truckSize--;
        //     }
        // }

        // return maxSum;
    }
}
