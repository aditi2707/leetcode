class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] inDegree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int[] topo = new int[numCourses];
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < prerequisites.length; i++){
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
            inDegree[prerequisites[i][0]]++;
        }

        // for(int i = 0; i < prerequisites.length; i++){
        //     inDegree[prerequisites[i][0]]++;
        // }

        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                queue.add(i);
            }
        }

        int index = 0;

        while(!queue.isEmpty()){

            int curr = queue.poll();
            topo[index++] = curr;

            for(int i = 0; i < list.get(curr).size(); i++){
                inDegree[list.get(curr).get(i)]--;
                if(inDegree[list.get(curr).get(i)] == 0){
                    queue.add(list.get(curr).get(i));
                }
            }
        }

        if(index != numCourses){
            return new int[0];
        }
        
        return topo;
    }
}
