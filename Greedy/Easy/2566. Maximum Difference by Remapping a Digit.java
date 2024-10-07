class Solution {
    public int minMaxDifference(int num) {

        char[] max = String.valueOf(num).toCharArray();
        char[] min = String.valueOf(num).toCharArray();

        char a = max[0];
        char b = max[0];

        for(int i = 0; i < max.length; i++){
            if(max[i] != '9'){
                a = max[i];
                break;
            }
        }

        for(int i = 0; i < max.length; i++){
            if(max[i] == a){
                max[i] = '9';
            }
        }

        for(int i = 0; i < min.length; i++){
            if(min[i] == b){
                min[i] = '0';
            }
        }

        return Integer.parseInt(String.valueOf(max)) - Integer.parseInt(String.valueOf(min));








        
        // char max = ' ';
        // char min = ' ';
        // String maxStr = "";
        // String minStr = "";

        // String s = String.valueOf(num);
        // char[] c = s.toCharArray();

        // for(int i = 0; i < c.length; i++){
        //     if(c[i] != '9' && max == ' '){
        //         max = c[i];
        //     }

        //     if(c[i] != 0 && min == ' '){
        //         min = c[i];
        //     }
        // }

        // for(int i = 0; i < c.length; i++){
        //     if(c[i] == max){
        //         maxStr += '9';
        //     }
        //     else{
        //         maxStr += c[i];
        //     }
        //     if(c[i] == min){
        //         minStr += '0';
        //     }
        //     else{
        //         minStr += c[i];
        //     }
        // }

        // return Integer.parseInt(maxStr) - Integer.parseInt(minStr);
    }
}
