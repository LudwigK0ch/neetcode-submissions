class Solution {
    /**
     * @param {string[]} arr
     * @param {number} k
     * @return {string}
     */
    kthDistinct(arr, k) {
        let count = {};
        arr.forEach((s) => {
            if(!count.hasOwnProperty(s)) {
                count[s] = 0;
            }

            count[s]++;
        });

        for(let s of arr) {
            if(count[s] === 1 && --k === 0) {
                return s;
            }
        }

        return "";
    }
}
