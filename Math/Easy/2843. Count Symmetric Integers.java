class Solution {

    private int findSum(String s, int low, int high){

        int sum = 0;

        for(int i = low; i <= high; i++){
            sum += s.charAt(i) - '0';
        }

        return sum;
    }


    public int countSymmetricIntegers(int low, int high) {

        // Time Complexity : O(nlog n)

        // Space Complexity : O(1)
        
        
        int ans = 0;
        int i = low;

        while(i <= high){
            String num = String.valueOf(i);
            if(num.length() % 2 == 0){
                if(num.length() == 2){
                    if(num.charAt(0) == num.charAt(1)){
                        ans++;
                    }   
                }
                else{
                    int sum1 = findSum(num, 0, num.length() / 2 - 1);
                    int sum2 = findSum(num, num.length() / 2, num.length() - 1);

                    if(sum1 == sum2){
                        ans++;
                    }
                }
            }
            i++;
        }

        return ans;
    }
}
