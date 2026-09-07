# Maximum Sum Circular Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a  **circular integer array**  `nums` of length `n`, return  *the maximum possible sum of a non-empty  **subarray**  of* `nums`.

A  **circular array**  means the end of the array connects to the beginning of the array. Formally, the next element of `nums[i]` is `nums[(i + 1) % n]` and the previous element of `nums[i]` is `nums[(i - 1 + n) % n]`.

A  **subarray**  may only include each element of the fixed buffer `nums` at most once. Formally, for a subarray `nums[i], nums[i + 1],..., nums[j]`, there does not exist `i <= k1`, `k2 <= j` with `k1 % n == k2 % n`.

 

 **Example 1:** 

```
Input: nums = [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3.

```

 **Example 2:** 

```
Input: nums = [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.

```

 **Example 3:** 

```
Input: nums = [-3,-2,-3]
Output: -2
Explanation: Subarray [-2] has maximum sum -2.

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 3 * 104
- -3  *104 <= nums[i] <= 3*  104

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 50.50%)  
**Memory:** 51.3 MB (beats 8.99%)  
**Submitted:** 2026-08-26T12:17:08.872Z  

```java
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int currMaxSum = nums[0];
        int currMinSum = nums[0];
        int totalSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Kadane's algorithm for maximum sum
            // Either extend previous subarray or start a new one
            currMaxSum = Math.max(currMaxSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currMaxSum);
            
            // Kadane's algorithm for minimum sum
            // Either extend previous subarray or start a new one
            currMinSum = Math.min(currMinSum + nums[i], nums[i]);
            minSum = Math.min(minSum, currMinSum);
            
            // Calculate the total sum of all elements
            totalSum += nums[i];
        }
        
        // The circular sum is the total sum minus the minimum subarray sum
        int circularSum = totalSum - minSum;
        
        // Edge case: if all numbers are negative, then maxSum will be negative
        // and circularSum will be 0 (empty subarray), but we need to return the max negative value
        if (circularSum == 0) {
            return maxSum;
        }
        
        // Return the maximum of the regular subarray sum and the circular subarray sum
        return Math.max(maxSum, circularSum);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-sum-circular-subarray/)