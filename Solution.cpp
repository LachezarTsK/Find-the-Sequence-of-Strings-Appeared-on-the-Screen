
#include <vector>
#include <string>
using namespace std;

class Solution {

    static const char EMPTY_SPACE_TO_FILL = ' ';

public:
    vector<string> stringSequence(const string& target) const {
        vector<string> stringSequence;
        string previousSequence;

        for (const auto& letter : target) {
            previousSequence.push_back(EMPTY_SPACE_TO_FILL);
            for (char currentChange = 'a'; currentChange <= letter; ++currentChange) {
                previousSequence[previousSequence.size() - 1] = currentChange;
                stringSequence.push_back(previousSequence);
            }
        }
        return stringSequence;
    }
};
