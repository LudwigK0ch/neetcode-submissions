class Solution {
    /**
     * @param {number[]} nums
     * @param {number} val
     * @return {number}
     */
    removeElement(nums, val) {
        let insert = 0;
        for(let pointer = insert; pointer < nums.length; pointer++) {
            const num = nums[pointer];
            if(num !== val) {
                nums[insert] = num;
                insert++;
            }
        }

        return insert;
    }
}
