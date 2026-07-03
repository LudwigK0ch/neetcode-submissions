class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        const frequency = {};
        nums.forEach((num) => {
            if(!frequency.hasOwnProperty(num)){
                frequency[num] = 0;
            }
            frequency[num]++;
        });

        const mostFrequentK = Object.entries(frequency).map(([num, freq]) => [
            freq,
            parseInt(num),
        ])
        .sort((a,b) => b[0] - a[0])
        .slice(0, k).map((pair) => pair[1]);

        return mostFrequentK;
    }
}
