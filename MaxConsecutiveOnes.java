class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt); // Use Math.max
            } else {
                cnt = 0;
            }
        }
        return maxi;
    }
}
