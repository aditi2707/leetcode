class StockSpanner {

    Stack<int[]> stack;

    // List<Integer> stockPrice;

    public StockSpanner() {
        stack = new Stack<>();

        // stockPrice = new ArrayList<>();
    }
    
    public int next(int price) {

        if(stack.isEmpty()){
            stack.push(new int[]{price, 1});
            return 1;
        }

        int pop = 1;

        while(!stack.isEmpty() && stack.peek()[0] <= price){
            pop += stack.pop()[1];
        }

        stack.push(new int[]{price, pop});

        return pop;
        

        
        // stockPrice.add(price);
        // if(stockPrice.size() == 1){
        //     return 1;
        // }

        // int i = stockPrice.size() - 1;
        // int counter = 0;

        // while(i >= 0 && stockPrice.get(i) <= price){
        //     counter++;
        //     i--;
        // }

        // return counter;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
