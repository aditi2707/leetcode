class Solution {
public:
    vector<int> findIntersectionValues(vector<int>& nums1, vector<int>& nums2) {
        
        set<int> s1;
        set<int> s2;
        int answer1 = 0, answer2 = 0;

        for(int i: nums1){
            s1.insert(i);
        }

        for(int i: nums2){
            s2.insert(i);
        }

        for(int i: nums1){
            if(s2.contains(i)){
                answer1++;
            }
        }

        for(int i: nums2){
            if(s1.contains(i)){
                answer2++;
            }
        }

        return {answer1, answer2};
    }
};
