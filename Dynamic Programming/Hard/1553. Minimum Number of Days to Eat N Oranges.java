class Solution {

    public int eatOranges(int n, Map<Integer, Integer> map){

        if(n <= 0){
            return 0;
        }

        if(map.containsKey(n)){
            return map.get(n);
        }

        int a = 2000000001, b = 2000000001, c = 2000000001;

        if((n % 2 != 0) || (n % 3 != 0)){
            c = eatOranges(n - 1, map);
        }
        if(n % 2 == 0){
            a = eatOranges(n / 2, map);
        }
        if(n % 3 == 0){
            b = eatOranges(n / 3, map);
        }

        map.put(n, 1 + Math.min(a, Math.min(b, c)));
        return map.get(n);
    }

    public int minDays(int n) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        return eatOranges(n, map);  
    }
}
