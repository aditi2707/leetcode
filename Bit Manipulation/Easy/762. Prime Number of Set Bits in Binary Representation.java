class Solution {

    public boolean isPrime(int num){

        if(num == 1){
            return false;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        
        int counter = 0;

        for(int i = left; i <= right; i++){
            int setBits = Integer.bitCount(i);

            if(setBits == 2 || setBits == 3 || setBits == 5 || setBits == 7 || 
            setBits == 11 || setBits == 13 || setBits == 17 || setBits == 19){
                
                counter++;
            }

            // if(isPrime(setBits)){
            //     counter++;
            // }
        }

        return counter;
    }
}
