class Solution {
    public int maximum69Number (int num) {

        if(num == 9 || num == 99 || num == 999 || num == 9999 || num == 99999){
            return num;
        }

        String s = Integer.toString(num);
        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++){
            if(c[i] == '6'){
                c[i] = '9';
                break;
            }
        }

        return Integer.parseInt(String.valueOf(c));

 
        // if(num == 9 || num == 99 || num == 999 || num == 9999 || num == 99999){
        //     return num;
        // }

        // int max = num;
        // String s = Integer.toString(num);
        // String temp = "";

        // for(int i = 0; i < s.length(); i++){
        //     char ch = s.charAt(i);

        //     if(ch == '9'){
        //         temp = s.substring(0, i) + '6' + s.substring(i+1);
        //     }
        //     else{
        //         temp = s.substring(0, i) + '9' + s.substring(i+1);
        //     }

        //     int n = Integer.parseInt(temp);
        //     max = Math.max(max, n);
        // }

        // return max;
        
    }
}
