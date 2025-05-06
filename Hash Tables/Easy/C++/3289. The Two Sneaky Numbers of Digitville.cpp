class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        
        set<int> s;
        vector<int> ans;

        for(int i: nums){
            if(!s.contains(i)){
                s.insert(i);
            }
            else{
                ans.push_back(i);
            }
        }

        return ans;
    }
};
