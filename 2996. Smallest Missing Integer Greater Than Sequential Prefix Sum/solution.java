class Solution {
    public int missingInteger(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

  
        for(int num : nums) {
            map.put(num, 1);
        }

        int sum = nums[0];

        int i = 1;

        while(i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }


        while(map.containsKey(sum)) {
            sum++;
        }

        return sum;
    }
}
