
# LeetCode 45 - Jump Game II

## Logic

The idea is to find the **minimum number of jumps** needed to reach the last index.

Instead of deciding the next jump immediately, we first explore all the indices that are reachable with the current jump.

We maintain three variables:

* **farthest** → The farthest index we can reach from the current jump range.
* **end** → The end of the current jump range.
* **jumps** → Number of jumps taken.

### Steps

1. Start from index `0`.
2. For every index, calculate the farthest position that can be reached:

   ```java
   farthest = Math.max(farthest, i + nums[i]);
   ```
3. Continue exploring all indices in the current jump range.
4. When the current index reaches `end`, it means we have explored the entire current range.
5. Increase the jump count and update the new range:

   ```java
   jumps++;
   end = farthest;
   ```
6. Repeat until the last index is reached.

## Example

Input:

```text
nums = [2,3,1,1,4]
```

Current Jump Range:

```text
Index: 0 1 2 3 4
Value: 2 3 1 1 4
```

* From index `0`, we can reach indices `1` and `2`.
* Index `1` can reach `4`.
* Index `2` can reach `3`.
* The farthest reachable index is `4`, so the next jump range becomes `[3...4]`.
* Total jumps required = **2**.

## Time Complexity

* **O(n)**

## Space Complexity

* **O(1)**

