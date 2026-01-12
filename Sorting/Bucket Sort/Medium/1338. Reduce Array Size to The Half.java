class Solution {
    public int minSetSize(int[] arr) {

        // Time Complexity : O(n + n + nlog n + max)

        // Space Complexity : O(n)
        

        int count = 0, size = arr.length / 2, max = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(Integer i: arr){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i) + 1);
            }

            max = Math.max(max, map.get(i));
        }

        int[] bucket = new int[max + 1];


        for(Integer i: map.values()){
            bucket[i] += 1;
        }

        int index = max;

        while(index >= 1){

            if(bucket[index] == 0){
                index--;
                continue;
            }

            size -= index;
            count++;

            if(size <= 0){
                break;
            }

            bucket[index] -= 1;
            if(bucket[index] == 0){
                index--;
            }
        }

        return count;






        // // Time Complexity : O(n + nlog n + n)

        // // Space Complexity : O(n + n)

        
        // PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
        //     return a[0] == b[0]? a[1] - b[1] : b[0] - a[0];
        // });
        // Map<Integer, Integer> map = new HashMap<>();
        // int count = 0, size = arr.length / 2;

        // for(Integer i: arr){
        //     if(!map.containsKey(i)){
        //         map.put(i, 1);
        //     }
        //     else{
        //         map.put(i, map.get(i) + 1);
        //     }
        // }

        // for(Integer i: map.keySet()){
        //     maxHeap.add(new int[]{map.get(i), i});
        // }

        // while(!maxHeap.isEmpty()){
        //     size -= maxHeap.poll()[0];
        //     count++;

        //     if(size <= 0){
        //         break;
        //     }
        // }

        // return count;

    }
}
