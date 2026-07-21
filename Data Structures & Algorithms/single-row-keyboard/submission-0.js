class Solution {
    /**
     * @param {string} keyboard
     * @param {string} word
     * @return {number}
     */
    calculateTime(keyboard, word) {
        const keyMap = {};
        keyboard.split("").forEach((key, index) => {
            keyMap[key] = index;
        });

        let position = 0;
        let time = 0;
        word.split("").forEach((ch) => {
            let newPosition = keyMap[ch];
            time += Math.abs(newPosition - position);
            position = newPosition;
        });

        return time;
    }
}
