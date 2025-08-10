class Solution {
    public int sumOfdiv(int[] nums, int div) {
        int sum = 0;
        for (int num : nums) {
            sum += (int)Math.ceil((double)num / (double)div);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Integer.MAX_VALUE;  
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (sumOfdiv(nums, mid) <= threshold) {
                ans = mid;      
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return ans; 
    }
}
