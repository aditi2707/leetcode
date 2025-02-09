class Solution {
    public int romanToInt(String s) {

        int i = 0;
        int ans = 0;

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        while(i < s.length() - 1){

            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                ans -= map.get(s.charAt(i));
                i++;
            }
            else{
                ans += map.get(s.charAt(i));
                i++;
            }
        }

        if(i == s.length() - 1){
            ans += map.get(s.charAt(i));
        }

        return ans;



        
        // int i = 0;
        // int ans = 0;

        // Map<String, Integer> special = new HashMap<>();
        // Map<Character, Integer> map = new HashMap<>();

        // special.put("IV", 4);
        // special.put("IX", 9);
        // special.put("XL", 40);
        // special.put("XC", 90);
        // special.put("CD", 400);
        // special.put("CM", 900);

        // map.put('I', 1);
        // map.put('V', 5);
        // map.put('X', 10);
        // map.put('L', 50);
        // map.put('C', 100);
        // map.put('D', 500);
        // map.put('M', 1000);

        // while(i < s.length() - 1){

        //     String roman = "" + s.charAt(i) + s.charAt(i + 1);
        //     if(special.containsKey(roman)){
        //         ans += special.get(roman);
        //         i += 2;
        //     }
        //     else{
        //         ans += map.get(s.charAt(i));
        //         i++;
        //     }
        // }

        // if(i == s.length() - 1){
        //     ans += map.get(s.charAt(i));
        // }

        // return ans;
    }
}
