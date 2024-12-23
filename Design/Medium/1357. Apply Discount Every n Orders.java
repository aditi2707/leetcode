class Cashier {

    Map<Integer, Integer> map;
    int n;
    int discount;
    int counter = 0;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        map = new HashMap<>();

        for(int i = 0; i < products.length; i++){
            map.put(products[i], prices[i]);
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        
        double bill = 0.0;

        for(int i = 0; i < product.length; i++){
            bill += (double)(map.get(product[i]) * amount[i]);
        }

        counter++;

        if(counter == n){
            bill = (double)(bill * 
                ((100 - (double)discount) / 100));
            
            counter = 0;
        }
        
        return bill;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */
