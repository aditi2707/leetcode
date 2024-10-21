class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        
        Collections.sort(tasks);
        Collections.sort(processorTime);

        int minTime = 0;
        int max = 0;

        int j = processorTime.size();

        for(int i = 0; i < tasks.size(); i++){

            if(i % 4 == 0){
                minTime = Math.max(minTime, max);
                max = 0;
                j--;
            }
            max = Math.max(0, tasks.get(i) + processorTime.get(j));
        }

        return Math.max(minTime, max);
    }
}
