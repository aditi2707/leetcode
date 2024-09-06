class Solution {
    public String intToRoman(int num) {

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numerals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int i = 0;
        String str = "";

        while(num > 0){
            if(num >= numerals[i]){
                str += roman[i];
                num -= numerals[i];
            }
            else{
                i++;
            }
        }

        return str;

        
        // String n = String.valueOf(num);
        // int countZero = n.length()-1;
        // String ans = "";

        // for(int i = 0; i < n.length(); i++){

        //     char ch = n.charAt(i);
        //     if(countZero == 3){
        //         for(int j = 1; j <= Integer.parseInt(""+ch); j++){
        //             ans += "M";
        //         }
        //     }
        //     else if(countZero == 2){
        //         if(Integer.parseInt(""+ch) < 4){
        //             for(int j = 1; j <= Integer.parseInt(""+ch); j++){
        //                 ans += "C";
        //             }
        //         }
        //         else if(Integer.parseInt(""+ch) == 4){
        //             ans += "CD";
        //         }
        //         else if(Integer.parseInt(""+ch) >= 5 && Integer.parseInt(""+ch) < 9){
        //             ans += "D";
        //             for(int j = 6; j <= Integer.parseInt(""+ch); j++){
        //                 ans += "C";
        //             }
        //         }
        //         else{
        //             ans += "CM";
        //         }
        //     }
        //     else if(countZero == 1){
        //         if(Integer.parseInt(""+ch) < 4){
        //             for(int j = 1; j <= Integer.parseInt(""+ch); j++){
        //                 ans += "X";
        //             }
        //         }
        //         else if(Integer.parseInt(""+ch) == 4){
        //             ans += "XL";
        //         }
        //         else if(Integer.parseInt(""+ch) >= 5 && Integer.parseInt(""+ch) < 9){
        //             ans += "L";
        //             for(int j = 6; j <= Integer.parseInt(""+ch); j++){
        //                 ans += "X";
        //             }
        //         }
        //         else{
        //             ans += "XC";
        //         }
        //     }
        //     else if(countZero == 0){
        //         if(Integer.parseInt(""+ch) < 4){
        //             for(int j = 1; j <= Integer.parseInt(""+ch); j++){
        //                 ans += "I";
        //             }
        //         }
        //         else if(Integer.parseInt(""+ch) == 4){
        //             ans += "IV";
        //         }
        //         else if(Integer.parseInt(""+ch) >= 5 && Integer.parseInt(""+ch) < 9){
        //             ans += "V";
        //             for(int j = 6; j <= Integer.parseInt(""+ch); j++){
        //                 ans += "I";
        //             }
        //         }
        //         else{
        //             ans += "IX";
        //         }
        //     }
        //     countZero--;
        // }

        // return ans;
    }
}
