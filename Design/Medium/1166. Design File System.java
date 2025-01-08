class FileSystem {

    Map<String, Integer> map;

    public FileSystem() {
        map = new HashMap<>();
    }
    
    public boolean createPath(String path, int value) {
        
        String parent = path.substring(0, path.lastIndexOf("/"));
        if(map.containsKey(path) || 
        (!map.containsKey(parent) && path.indexOf("/") != path.lastIndexOf("/"))){
            return false;
        }
        
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
