
/**
 * @param {string} target
 * @return {string[]}
 */
var stringSequence = function (target) {
    const ASCII_SMALL_CASE_A = 97;
    const stringSequence = new Array();
    let previousSequence = "";

    for (let letter of target) {
        const ascii_letter = letter.codePointAt(0);
        for (let currentChange = ASCII_SMALL_CASE_A; currentChange <= ascii_letter; ++currentChange) {
            stringSequence.push(previousSequence + String.fromCodePoint(currentChange));
        }
        previousSequence = stringSequence[stringSequence.length - 1];
    }
    return stringSequence;
};
