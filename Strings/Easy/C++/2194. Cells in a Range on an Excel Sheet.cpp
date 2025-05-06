class Solution {
public:
    vector<string> cellsInRange(string s) {
        vector<string> ans;

        char r1 = s.at(1);
        char r2 = s.at(4);
        char c1 = s.at(0);
        char c2 = s.at(3);

        for(char c = c1; c <= c2; c++){
            for(int d = r1 - '0'; d <= r2 - '0'; d++){
                string str = c + to_string(d);
                ans.push_back(str);
            }
        }

        return ans;
    }
};
