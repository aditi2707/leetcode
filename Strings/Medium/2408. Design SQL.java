class SQL {

    //HashMap<String, HashMap<Integer, List<String>>> db;
    //HashMap<String, Integer> ids;
    HashMap<String, List<List<String>>> db;
    
    public SQL(List<String> names, List<Integer> columns) {
        
        db = new HashMap<>();
        //ids = new HashMap<>();
        for(String name: names){
            //db.put(name, new HashMap<>());
            db.put(name, new ArrayList<>());
            //ids.put(name, 0);
        }
    }
    
    public void insertRow(String name, List<String> row) {
        
        //int id = ids.get(name) + 1;
        //db.get(name).put(id, row);
        //ids.put(name, id);
        db.get(name).add(row);
    }
    
    public void deleteRow(String name, int rowId) {
        
        //db.get(name).remove(rowId);
    }
    
    public String selectCell(String name, int rowId, int columnId) {
        
        return db.get(name).get(rowId-1).get(columnId-1);
    }
}

/**
 * Your SQL object will be instantiated and called as such:
 * SQL obj = new SQL(names, columns);
 * obj.insertRow(name,row);
 * obj.deleteRow(name,rowId);
 * String param_3 = obj.selectCell(name,rowId,columnId);
 */
