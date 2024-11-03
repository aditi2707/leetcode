class TimeMap {

    Map<String, Map<Integer, String>> timemap;
    Map<String, List<Integer>> timestamps;

    public TimeMap() {
        timemap = new HashMap<>();
        timestamps = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!timemap.containsKey(key)){
            timemap.put(key, new HashMap<>());
            timestamps.put(key, new ArrayList<>());
        }

        timemap.get(key).put(timestamp, value);
        timestamps.get(key).add(timestamp);
    }
    
    public String get(String key, int timestamp) {
        
        String ans = "";

        if(!timestamps.containsKey(key)){
            return ans;
        }
        
        int low = 0, high = timestamps.get(key).size() - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(timestamps.get(key).get(mid) <= timestamp){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        if(high >= 0){
            ans = timemap.get(key).get(timestamps.get(key).get(high));
        }
        
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
