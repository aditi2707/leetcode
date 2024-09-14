class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        Queue<Integer> queue = new LinkedList<>();
        int[] inDegree = new int[numCourses];
        List<Integer> topo = new ArrayList<>();

        for(int i = 0; i < prerequisites.length; i++){
            inDegree[prerequisites[i][0]]++;
        }

        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int curr = queue.poll();
            topo.add(curr);

            for(int i = 0; i < prerequisites.length; i++){
                if(prerequisites[i][1] == curr){
                    inDegree[prerequisites[i][0]]--;
                    if(inDegree[prerequisites[i][0]] == 0){
                        queue.add(prerequisites[i][0]);
                    }
                }
            }            
        }

        if(topo.size() != numCourses){
            return false;
        }
        return true;
    }
}
