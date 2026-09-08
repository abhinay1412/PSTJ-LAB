# Circular Palindromes

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A *palindrome* is a string that reads the same from left to right as it does from right to left.

Given a string, $S$, of $N$ lowercase English letters, we define a *$k$-length rotation* as cutting the first $k$ characters from the beginning of $S$ and appending them to the end of $S$. For each $S$, there are $N$ possible $k$-length rotations (where $0 \le k \lt N$). See the *Explanation* section for examples.

Given $N$ and $S$, find all $N$ $k$-length rotations of $S$; for each rotated string, $S_k$, print the maximum possible length of any palindromic substring of $S_k$ on a new line.

**Input Format**

The first line contains an integer, $N$ (the length of $S$).	
The second line contains a single string, $S$.

**Constraints**

- $1 \le N \le 5 \times 10^5$
- $0 \le k \lt N$
- $\textit{S is comprised of lowercase English letters.}$

**Output Format**

There should be $N$ lines of output, where each line $k$ contains an integer denoting the maximum length of any palindromic substring of rotation $S_k$.

**Sample Input 0**

    13
    aaaaabbbbaaaa
    
**Sample Output 0**

    12
    12
    10
    8
    8
    9
    11
    13
    11
    9
    8
    8
    10

**Sample Input 1**

    7
    cacbbba
    
**Sample Output 1**

    3
    3
    3
    3
    3
    3
    3


**Sample Input 2**

    12
    eededdeedede

**Sample Output 2**

    5
    7
    7
    7
    7
    9
    9
    9
    9
    7
    5
    4

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T12:44:47.513Z  

```java
import java.io.*;
import java.util.*;

public class Solution {
    
    static int[] log2;
    static int[][] st;

    public static void main(String[] args) throws IOException {
        // Fast I/O is mandatory for N = 5*10^5 to prevent TLE
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String s = bufferedReader.readLine().trim();

        List<Integer> results = circularPalindromes(s, n);

        for (int i = 0; i < results.size(); i++) {
            bufferedWriter.write(String.valueOf(results.get(i)));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        bufferedReader.close();
    }

    public static List<Integer> circularPalindromes(String s, int n) {
        String doubledStr = s + s;
        
        // Step 1: Preprocess string for Manacher's Algorithm
        int tLen = 2 * doubledStr.length() + 1;
        char[] t = new char[tLen];
        Arrays.fill(t, '#');
        for (int i = 0; i < doubledStr.length(); i++) {
            t[2 * i + 1] = doubledStr.charAt(i);
        }
        
        // Manacher's Algorithm
        int[] p = new int[tLen];
        int center = 0, right = 0;
        
        for (int i = 0; i < tLen; i++) {
            int mirror = 2 * center - i;
            if (right > i) {
                p[i] = Math.min(right - i, p[mirror]);
            }
            while (i - (1 + p[i]) >= 0 && i + (1 + p[i]) < tLen && t[i - (1 + p[i])] == t[i + (1 + p[i])]) {
                p[i]++;
            }
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }
        
        // Pre-compute Log2 array for O(1) query time
        log2 = new int[tLen + 1];
        log2[1] = 0;
        for (int i = 2; i <= tLen; i++) {
            log2[i] = log2[i / 2] + 1;
        }
        
        // Step 2: Build Sparse Table for Range Maximum Queries (RMQ)
        int maxLog = log2[tLen] + 1;
        st = new int[maxLog][tLen];
        
        for (int i = 0; i < tLen; i++) {
            st[0][i] = p[i];
        }
        
        for (int j = 1; j < maxLog; j++) {
            int len = 1 << (j - 1);
            for (int i = 0; i + (1 << j) <= tLen; i++) {
                st[j][i] = Math.max(st[j - 1][i], st[j - 1][i + len]);
            }
        }
        
        List<Integer> result = new ArrayList<>(n);
        
        // Step 3: Binary Search the maximum bounded palindrome for each rotation
        for (int k = 0; k < n; k++) {
            int low = 0;
            int high = n;
            int ans = 0;
            
            while (low <= high) {
                int mid = (low + high) / 2;
                
                // Calculate the valid search window bounds mapping to the 't' array
                // The center must be at least 'mid' distance from the rotation edges
                int L = 2 * k + mid;
                int R = 2 * k + 2 * n - mid;
                
                // Check if a palindrome of at least radius 'mid' exists in the valid center range
                if (L <= R && queryRMQ(L, R) >= mid) {
                    ans = mid;
                    low = mid + 1;  // Try to find a larger palindrome
                } else {
                    high = mid - 1; // Shrink the requirement
                }
            }
            result.add(ans);
        }
        
        return result;
    }

    // O(1) Sparse Table RMQ query
    private static int queryRMQ(int L, int R) {
        if (L > R) return -1;
        int j = log2[R - L + 1];
        return Math.max(st[j][L], st[j][R - (1 << j) + 1]);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/circular-palindromes/problem)