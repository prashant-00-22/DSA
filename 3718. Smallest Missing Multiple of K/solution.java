class Solution {
    public int missingMultiple(int[] nums, int k) {
HashSet<Integer> set = new HashSet<>();

for (int num : nums) {
    set.add(num);
}

int j = 1;

while (true) {
    int product = j * k;

    if (!set.contains(product)) {
        return product;
    }

    j++;
}
    }
}
