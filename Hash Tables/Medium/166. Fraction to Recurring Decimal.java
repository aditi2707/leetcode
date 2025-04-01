class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
        String ans = "";
        Map<Long, Integer> map = new HashMap<>();

        if(numerator == 0){
            return "0";
        }

        if((numerator < 0) ^ (denominator < 0)){
            ans += "-";
        }

        long n = Math.abs((long)numerator);
        long d = Math.abs((long)denominator);

        long q = n / d;
        long r = n % d;

        ans += String.valueOf(q);

        if(r == 0){
            return ans;
        }

        ans += ".";

        while(r != 0){
            if(map.containsKey(r)){
                ans = ans.substring(0, map.get(r)) + "(" + ans.substring(map.get(r)) + ")";
                break;
            }

            map.put(r, ans.length());
            r *= 10;
            q = r / d;
            ans += String.valueOf(q);
            r %= d;
        }

        return ans;
    }
}
