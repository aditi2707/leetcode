class Vector2D {

    List<Integer> flatten;
    int ind = 0;

    public Vector2D(int[][] vec) {

        flatten = new ArrayList<>();
        
        for(int i = 0; i < vec.length; i++){
            for(int j = 0; j < vec[i].length; j++){
                flatten.add(vec[i][j]);
            }
        }
    }
    
    public int next() {
        
        if(hasNext()){
            int nex = flatten.get(ind);
            ind++;
            return nex;
        }

        return -501;
    }
    
    public boolean hasNext() {
        
        return ind < flatten.size();
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D obj = new Vector2D(vec);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
