class Logger {

    Map<String, Integer> map;

    public Logger() {
        map = new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {

        // Time Complexity : O(1)

        // Space Complexity : O(n)
        
        
        if(map.containsKey(message)){
            int t1 = map.get(message);
            if(timestamp - t1 < 10){
                return false;
            }
        }
        map.put(message, timestamp);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
