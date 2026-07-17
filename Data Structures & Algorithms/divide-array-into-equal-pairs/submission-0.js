class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    divideArray(nums) {
        let map = {};
        nums.forEach((num) => {
            if(!map.hasOwnProperty(num)){
                map[num] = 0;
            }

            map[num]++;
        });

        console.log(Object.values(map));

        return !Object.values(map).find((el) => el%2 !== 0);
    }
}
