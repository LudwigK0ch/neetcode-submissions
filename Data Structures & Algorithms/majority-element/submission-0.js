class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    majorityElement(nums) {
        let count = {};
        nums.forEach((num) => {
            if(!count.hasOwnProperty(num)) {
                count[num] = 0;
            }
            count[num]++;
        });

        const majority = nums.length / 2;
        for(const [key, value] of Object.entries(count)) {
           if(value > majority) {
                return key;
           }
        }

        return -1;
    }
}
