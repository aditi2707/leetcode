class Solution {
    public int divisorSubstrings(int num, int k) {

        String s = String.valueOf(num);
        int count = 0;

        for(int i = 0; i <= s.length() - k; i++){
            String temp = s.substring(i, i + k);

            int n = Integer.parseInt(temp);

            if(n != 0 && (num % n == 0)){
                count++;
            }
        }

        return count;









        
        // String s = String.valueOf(num);
        // int j = 0, count = 0;
        // String temp = "";

        // while(j < s.length()){

        //     if((j + 1) <= k){
        //         temp += s.charAt(j);
        //         j++;
        //     }
        //     else{
        //         int n = Integer.parseInt(temp);
        //         if(n != 0 && num % n == 0){
        //             count++;
        //         }

        //         temp = temp.substring(1);
        //         temp += s.charAt(j);
        //         j++;
        //     }
        // }

        // int n = Integer.parseInt(temp);
        // if(n != 0 && num % n == 0){
        //     count++;
        // }

        // return count;
    }
}
