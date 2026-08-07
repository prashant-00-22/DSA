class Solution {
    public int maximumCount(int[] nums) {

        int n = nums.length;

        // Find first positive number (>0)
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] > 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        int positive = n - lo;

        // Find first non-negative number (>=0)
        lo = 0;
        hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] >= 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        int negative = lo;

        return Math.max(positive, negative);
    }
}
