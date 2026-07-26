class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int i = 0;
        int j = n - 1;

        for (int k = 0; k < n; k++) {
            if (nums[k] % 2 == 0) {
                arr[i] = nums[k];
                i++;
            } else {
                arr[j] = nums[k];
                j--;
            }
        }

        return arr;
    }
}
