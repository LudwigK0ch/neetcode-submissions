class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    canPermutePalindrome(s) {
        const oddChars = new Set();
        s.split("").forEach((ch) => {
            if(oddChars.has(ch)) {
                oddChars.delete(ch);
            } else {
                oddChars.add(ch);
            }
        });

        return s.length % 2 === 0 ? oddChars.size === 0 : oddChars.size === 1;
    }
}
