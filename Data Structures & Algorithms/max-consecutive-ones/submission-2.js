class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMaxConsecutiveOnes(nums) {
        let most = 0, curr = most;
        nums.forEach((num) => {
            curr = num === 1 ? curr + 1 : 0;
            most = Math.max(most, curr);
        });

        return most = Math.max(most, curr);
    }
}
