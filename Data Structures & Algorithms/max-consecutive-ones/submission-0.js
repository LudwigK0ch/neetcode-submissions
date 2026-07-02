class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums) {
        let most = 0;
        let curr = most;
        nums.forEach((num) => {
            if(num === 1) {
                curr++;
            }
            else {
                most = most > curr ? most : curr;
                curr = 0;
            }
        });

        return most > curr ? most : curr;
    }
}
