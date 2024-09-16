class Solution {
    public int findMinDifference(List<String> timePoints) {
        
        int minDiff = Integer.MAX_VALUE;
        int[] min = new int[timePoints.size()];

        for(int i = 0; i < timePoints.size(); i++){
            String[] s = timePoints.get(i).split(":");
            min[i] = Integer.parseInt(s[1]) + 60 * (Integer.parseInt(s[0]));
        }

        Arrays.sort(min);

        for(int i = 1; i < min.length; i++){
            minDiff = Math.min(minDiff, min[i]-min[i-1]);
        }

        return Math.min(
            minDiff,
            24 * 60 - min[min.length - 1] + min[0]
        );
        
    }
}
