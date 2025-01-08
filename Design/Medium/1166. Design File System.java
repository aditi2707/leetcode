class FileSystem {

    Map<String, Integer> map;

    public FileSystem() {
        map = new HashMap<>();
        map.put("", 0);
    }
    
    public boolean createPath(String path, int value) {
        
        String parent = path.substring(0, path.lastIndexOf("/"));
        int firstSlash = path.indexOf("/");
        int lastSlash = path.lastIndexOf("/");

        if(!map.containsKey(parent) || map.containsKey(path)){
            return false;
        }

        // if(map.containsKey(path) || 
        // (!map.containsKey(parent) && firstSlash != lastSlash)){
        //     return false;
        // }
        
        map.put(path, value);
        return true;
    }
    
    public int get(String path) {
        
        if(!map.containsKey(path)){
            return -1;
        }

        return map.get(path);
    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * boolean param_1 = obj.createPath(path,value);
 * int param_2 = obj.get(path);
 */
