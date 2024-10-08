class Solution {
    public String maximumTime(String time) {
        
        String[] divide = time.split(":");

        if(divide[0].charAt(0) == '?'){
            if(divide[0].charAt(1) >= '4' && divide[0].charAt(1) <= '9'){
                divide[0] = "1" + divide[0].charAt(1);
            }
            else{
                divide[0] = "2" + divide[0].charAt(1);
            }
            
        }
        if(divide[0].charAt(1) == '?'){
            if(divide[0].charAt(0) == '2'){
                divide[0] = divide[0].charAt(0) + "3";
            }
            else{
                divide[0] = divide[0].charAt(0) + "9";
            }
        }
        if(divide[1].charAt(0) == '?'){
            divide[1] = "5" + divide[1].charAt(1);
        }
        if(divide[1].charAt(1) == '?'){
            divide[1] = divide[1].charAt(0) + "9";
        }

        return new String(divide[0] + ":" + divide[1]);
    }
}
