
package main

const EMPTY_SPACE_TO_FILL byte = ' '

func stringSequence(target string) []string {
    stringSequence := []string{}
    previousSequence := []byte{}

    for _, letter := range target {
        previousSequence = append(previousSequence, EMPTY_SPACE_TO_FILL)
        for currentChange := byte('a'); currentChange <= byte(letter); currentChange++ {
                previousSequence[len(previousSequence) - 1] = currentChange
                stringSequence = append(stringSequence, string(previousSequence))
            }
    }

    return stringSequence
}
