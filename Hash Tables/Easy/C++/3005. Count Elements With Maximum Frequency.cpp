class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        
        int maxFreq = 0;
        unordered_map<int, int> m;
        int count = 0;

        for(int i: nums){
            m[i]++;
            maxFreq = max(maxFreq, m[i]);
        }

        for(int i: nums){
            if(m[i] == maxFreq){
                count++;
            }
        }

        return count;
    }
};
