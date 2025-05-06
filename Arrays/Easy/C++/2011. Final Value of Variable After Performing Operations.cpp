class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        
        int X = 0;

        for(int i = 0; i < operations.size(); i++){
            string str = operations[i];
            if(str.at(0) == '+' || str.at(2) == '+'){
                X += 1;
            }
            else{
                X -= 1;
            }
        }

        return X;
    }
};
