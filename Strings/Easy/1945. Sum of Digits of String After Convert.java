class Solution {
    public int getLucky(String s, int k) {
        
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            int ascii = (int)s.charAt(i) - 97 + 1;
            if(ascii <= 9){
                sum += ascii;
            }
            else{
                sum += (ascii%10 + ascii/10);
            }
        }

        int r = 0;
        int counter = 1;
        while(counter <= k){

            if(counter == k){
                return sum;
            }
            int d = sum % 10;
            r += d;
            sum = sum/10;

            if(sum == 0){
                sum = r;
                r = 0;
                counter++;
            }
        }

        return sum;
    }
}
