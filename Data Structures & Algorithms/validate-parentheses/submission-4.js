class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        const brackets = {
            "}": "{",
            ")": "(",
            "]": "["
        };
        let stack = [];

        for(let bracket of s.split("")) {
            if(brackets.hasOwnProperty(bracket) && brackets[bracket] != stack.pop()) {
                return false;
            }

            if(!brackets.hasOwnProperty(bracket)) {
                stack.push(bracket);
            }
        }
        return stack.length === 0;
    }
}
