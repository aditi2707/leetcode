class Solution {
    public int buyChoco(int[] prices, int money) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(Integer i: prices){
            if(i < first){
                second = first;
                first = i;
            }
            else if(i >= first && i < second){
                second = i;
            }
        }

        if(first + second > money){
            return money;
        }

        return money - (first + second);





        
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // for(int i = 0; i < prices.length; i++){
        //     maxHeap.add(prices[i]);
        //     if(maxHeap.size() > 2){
        //         maxHeap.poll();
        //     }
        // }

        // int choc1 = maxHeap.poll();
        // int choc2 = maxHeap.poll();

        // if(choc1 + choc2 > money){
        //     return money;
        // }

        // return money - (choc1 + choc2);
    }
}
