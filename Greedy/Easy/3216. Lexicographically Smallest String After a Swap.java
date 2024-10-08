class Solution {
    public String getSmallestString(String s) {

        char[] c = s.toCharArray();

        for(int i = 0; i < c.length-1; i++){
            if(c[i] % 2 != 0 && c[i+1] % 2 != 0 || c[i] % 2 == 0 && c[i+1] % 2 == 0){
                if(c[i] > c[i+1]){
                    char temp = c[i];
                    c[i] = c[i+1];
                    c[i+1] = temp;
                    break;
                }
            }
        }

        return new String(c);





        
        // String min = s;
        // String ans = "";

        // for(int i = 0; i < s.length()-1; i++){

        //     char ch1 = s.charAt(i);
        //     char ch2 = s.charAt(i+1);

        //     if(ch1 % 2 != 0 && ch2 % 2 != 0 || ch1 % 2 == 0 && ch2 % 2 == 0){
        //         if(ch1 > ch2){
        //             ans = s.substring(0, i) + ch2 + ch1 + s.substring(i+2);
        //             if(ans.compareTo(min) < 0){
        //                 min = ans;
        //                 break;
        //             }
        //         }
        //     }
        // }

        // return min;
    }
}
