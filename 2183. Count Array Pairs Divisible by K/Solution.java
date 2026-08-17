class Solution {
    public long countPairs(int[] nums, int k) {
        int n = nums.length;
        long count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                long product = (long) nums[i] * nums[j];

                if(product % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
