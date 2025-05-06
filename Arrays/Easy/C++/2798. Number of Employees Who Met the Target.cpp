class Solution {
public:
    int numberOfEmployeesWhoMetTarget(vector<int>& hours, int target) {
        
        int count = 0;

        for(int i: hours){
            if(i >= target){
                count++;
            }
        }

        return count;
    }
};
