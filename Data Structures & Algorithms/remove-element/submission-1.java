class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;

        for(int r = l; r < nums.length; r++) {
            if(nums[l] == val && nums[r] != val) {
                nums[l] = nums[r];
                nums[r] = val;
                l++;
                continue;
            }

            if(nums[l] != val) {
                l++;
            }
        }

        return l;
    }
}