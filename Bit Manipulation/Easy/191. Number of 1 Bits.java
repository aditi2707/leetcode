class Solution {
    public int hammingWeight(int n) {

        String s = Integer.toBinaryString(n);

        int ones = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
        }

        return ones;







        // String s = Integer.toBinaryString(n);

        // int ones = 0;

        // while(s.length() > 0){
        //     int d = Integer.parseInt("" + s.charAt(s.length()-1)) % 2;
        //     if(d == 1){
        //         ones++;
        //     }
        //     s = s.substring(0, s.length()-1);
        // }

        // return ones;

    }
}
