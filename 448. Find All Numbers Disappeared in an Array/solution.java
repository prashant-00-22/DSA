class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();

        Arrays.sort(nums);

        int i = 0;
        int expected = 1;

        while (i < nums.length) {

            if (nums[i] == expected) {
                expected++;
                i++;
            }
            else if (nums[i] < expected) {
             
                i++;
            }
            else {
                
                arr.add(expected);
                expected++;
            }
        }

       
        while (expected <= nums.length) {
            arr.add(expected);
            expected++;
        }

        return arr;
    }
}
