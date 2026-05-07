class Solution {
    public int findDuplicate(int[] nums) {
        int result = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            result = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (result == nums[j]) {
                    return result;
                }
            }
        }
        return result;
    }
}
