
using System;
using System.Collections.Generic;

public class Solution
{
    private static readonly char EMPTY_SPACE_TO_FILL = ' ';

    public IList<string> StringSequence(string target)
    {
        IList<string> stringSequence = new List<string>();
        StringBuilder previousSequence = new StringBuilder();

        foreach (char letter in target)
        {
            previousSequence.Append(EMPTY_SPACE_TO_FILL);
            for (char currentChange = 'a'; currentChange <= letter; ++currentChange)
            {
                previousSequence[previousSequence.Length - 1] = currentChange;
                stringSequence.Add(previousSequence.ToString());
            }
        }

        return stringSequence;
    }
}
