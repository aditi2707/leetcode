class Solution {
    public boolean canAttendMeetings(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= intervals[i-1][1]){
                continue;
            }
            else{
                return false;
            }
        }

        return true;



        
        
        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // for(int i = 1; i < intervals.length; i++){

        //     if(intervals[i-1][1] > intervals[i][0] && intervals[i-1][1] >= intervals[i][1]){
        //         return false;
        //     }
        //     else if(intervals[i-1][1] > intervals[i][0] && intervals[i-1][1] <= intervals[i][1]){
        //         return false;
        //     }
        //     else{
        //         continue;
        //     }
        // }

        // return true;
    }
}
