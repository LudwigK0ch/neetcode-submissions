class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums) {
        let res = new Array(nums.length * 2);
        const length = nums.length;
        for(let i = 0; i < length; i++) {
            res[i] = res[i + length] = nums[i];
        }

        return res;
    }
}
