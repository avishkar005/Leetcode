class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canFinish(piles, h, mid)) {
                right = mid; // Try smaller k
            } else {
                left = mid + 1; // Need faster eating speed
            }
        }

        return left;
    }

    // Gets the maximum number of bananas in a single pile
    private int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }

    // Determines whether Koko can eat all bananas at speed k within h hours
    private boolean canFinish(int[] piles, int h, int k) {
        int time = 0;
        for (int pile : piles) {
            // Ceiling division without using floating point
            time += (pile + k - 1) / k;
        }
        return time <= h;
    }
}
