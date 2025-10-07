# Question : 
https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1 
## solution : 
```
#include <vector>
#include <unordered_map>

class Solution {
public:
    int missingNum(std::vector<int>& arr) {
        std::unordered_map<int ,int > map;
        for (int i = 0; i < arr.size(); i++) {
            auto it = map.find(arr[i]);
            
            if (it != map.end()) {
                it->second++; 
            } else {
                map[arr[i]] = 1; 
            }
        }
        
        for (int i = 1; i <= arr.size() + 1; i++) {
            if (map.find(i) == map.end()) {
                return i;
            }
        }
        
        return -1; 
    }
};
```