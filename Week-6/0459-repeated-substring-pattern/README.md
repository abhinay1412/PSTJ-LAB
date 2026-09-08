# Repeated Substring Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

 

 **Example 1:** 

```
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

```

 **Example 2:** 

```
Input: s = "aba"
Output: false

```

 **Example 3:** 

```
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

```

 

 **Constraints:** 

- 1 <= s.length <= 104
- s consists of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 91.62%)  
**Memory:** 46.7 MB (beats 69.43%)  
**Submitted:** 2026-08-26T12:28:45.487Z  

```java
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0 && s.substring(0, i).repeat(n / i).equals(s)) {
                return true;
            }
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/repeated-substring-pattern/)