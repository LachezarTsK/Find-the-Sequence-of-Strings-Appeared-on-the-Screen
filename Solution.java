
import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static final char EMPTY_SPACE_TO_FILL = ' ';

    public List<String> stringSequence(String target) {
        List<String> stringSequence = new ArrayList<>();
        StringBuilder previousSequence = new StringBuilder();

        for (char letter : target.toCharArray()) {
            previousSequence.append(EMPTY_SPACE_TO_FILL);
            for (char currentChange = 'a'; currentChange <= letter; ++currentChange) {
                previousSequence.setCharAt(previousSequence.length() - 1, currentChange);
                stringSequence.add(previousSequence.toString());
            }
        }

        return stringSequence;
    }
}
