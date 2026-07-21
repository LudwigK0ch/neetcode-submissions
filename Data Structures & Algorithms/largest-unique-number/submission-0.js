class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    largestUniqueNumber(nums) {
        const unique = new Set();
        nums.forEach((num) => {
            if(unique.has(num)){
                unique.delete(num);
            } else {
                unique.add(num);
            }
        });

        return unique.size > 0 ? Array.from(unique).sort((a, b) => b - a)[0] : -1;
    }
}
