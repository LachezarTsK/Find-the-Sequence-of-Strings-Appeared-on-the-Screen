
function stringSequence(target: string): string[] {
    const ASCII_SMALL_CASE_A: number = 97;
    const stringSequence: string[] = new Array();
    let previousSequence: string = "";

    for (let letter of target) {
        const ascii_letter: number = letter.codePointAt(0);
        for (let currentChange = ASCII_SMALL_CASE_A; currentChange <= ascii_letter; ++currentChange) {
            stringSequence.push(previousSequence + String.fromCodePoint(currentChange));
        }
        previousSequence = stringSequence[stringSequence.length - 1];
    }
    return stringSequence;
};
