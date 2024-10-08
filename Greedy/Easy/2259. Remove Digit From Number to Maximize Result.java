class Solution {
    public String removeDigit(String number, char digit) {
        
        String max = "";
        
        for(int i = 0; i < number.length(); i++){
            char ch = number.charAt(i);

            if(ch == digit){
                if(max == ""){
                    max = number.substring(0, i) + number.substring(i+1);
                }
                else{
                    String temp = number.substring(0, i) + number.substring(i+1);
                    if(temp.compareTo(max) > 0){
                        max = temp;
                    }
                }
            }
        }

        return max;
    }
}
