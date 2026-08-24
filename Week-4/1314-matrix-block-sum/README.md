# Matrix Block Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a `m x n` matrix `mat` and an integer `k`, return  *a matrix*  `answer`  *where each*  `answer[i][j]`  *is the sum of all elements*  `mat[r][c]`  *for* :

- i - k <= r <= i + k,
- j - k <= c <= j + k, and
- (r, c) is a valid position in the matrix.

 

 **Example 1:** 

```
Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 1
Output: [[12,21,16],[27,45,33],[24,39,28]]

```

 **Example 2:** 

```
Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 2
Output: [[45,45,45],[45,45,45],[45,45,45]]

```

 

 **Constraints:** 

- m == mat.length
- n == mat[i].length
- 1 <= m, n, k <= 100
- 1 <= mat[i][j] <= 100

## Solution

**Language:** Java  
**Runtime:** 104 ms (beats 17.61%)  
**Memory:** 46.6 MB (beats 80.62%)  
**Submitted:** 2026-08-24T06:29:15.932Z  

```java
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
       int[][] arr= new int[mat.length][mat[0].length];
       for(int i=0;i<mat.length;i++)
       {
        for(int j=0;j<mat[0].length;j++)
        {
            int sum=0;
            for(int r=Math.max(0,i-k);r<=i+k && r<mat.length;r++)
            {
                for(int c=Math.max(j-k,0);c<=j+k && c<mat[0].length;c++)
                {
                    sum= sum + mat[r][c];
                }
            }
            arr[i][j] = sum;
        }
       }
       return arr; 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/matrix-block-sum/)