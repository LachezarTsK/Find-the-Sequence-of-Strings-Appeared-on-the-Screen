
class Solution {

    private companion object {
        const val EMPTY_SPACE_TO_FILL = ' '
    }

    fun stringSequence(target: String): List<String> {
        val stringSequence = ArrayList<String>()
        val previousSequence = StringBuilder()

        for (letter in target) {
            previousSequence.append(EMPTY_SPACE_TO_FILL)
            for (currentChange in 'a'..letter) {
                previousSequence[previousSequence.length - 1] = currentChange
                stringSequence.add(previousSequence.toString())
            }
        }

        return stringSequence
    }
}
