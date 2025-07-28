class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;  // Missing number found
            }
        }

        return -1; // This should not be reached as per problem constraints
    }
}
