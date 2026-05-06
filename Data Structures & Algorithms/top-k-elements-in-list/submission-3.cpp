#include <vector>
#include <unordered_map>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        // 1. Đếm tần suất xuất hiện bằng unordered_map
        unordered_map<int, int> counts;
        for (int num : nums) {
            counts[num]++;
        }

        // 2. Chuyển các cặp (Key, Value) từ map sang vector để sắp xếp
        // Mỗi phần tử trong vector là một pair<int, int>: {giá trị, tần suất}
        vector<pair<int, int>> freqList(counts.begin(), counts.end());

        // 3. Sắp xếp vector theo tần suất (Value) từ lớn đến bé
        // Chúng ta sử dụng một lambda function để định nghĩa logic so sánh
        sort(freqList.begin(), freqList.end(), [](const pair<int, int>& a, const pair<int, int>& b) {
            return a.second > b.second; // Sắp xếp giảm dần theo tần suất
        });

        // 4. Lấy ra k phần tử đầu tiên
        vector<int> result;
        for (int i = 0; i < k; i++) {
            result.push_back(freqList[i].first);
        }

        return result;
    }
};