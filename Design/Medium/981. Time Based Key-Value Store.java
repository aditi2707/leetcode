class TimeMap {

    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
            
        }
        map.get(key).add(new Pair<>(value, timestamp));

        return;
    }
    
    public String get(String key, int timestamp) {

        // Time Complexity : O(log n)
        

        String value = "";

        if(!map.containsKey(key)){
            return value;
        }

        int low = 0, high = map.get(key).size() - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            Pair<String, Integer> p = map.get(key).get(mid);

            if(p.getValue() == timestamp){
                value = p.getKey();
                return value;
            }
            else if(p.getValue() < timestamp){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(high < 0){
            return "";
        }

        Pair<String, Integer> p = map.get(key).get(high);
        return p.getKey();




        // // Time Complexity : O(n)

        
        // String value = "";

        // if(!map.containsKey(key)){
        //     return value;
        // }

        // for(int i = map.get(key).size() - 1; i >= 0; i--){
        //     Pair<String, Integer> p = map.get(key).get(i);
        //     if(p.getValue() <= timestamp){
        //         return p.getKey();
        //     }
        // }

        // return value;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
