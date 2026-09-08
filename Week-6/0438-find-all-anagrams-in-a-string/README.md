# Find All Anagrams in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings `s` and `p`, return an array of all the start indices of `p`'s anagrams in `s`. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

```

 **Example 2:** 

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".

```

 

 **Constraints:** 

- 1 <= s.length, p.length <= 3 * 104
- s and p consist of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 66.99%)  
**Memory:** 46.8 MB (beats 58.51%)  
**Submitted:** 2026-08-26T12:32:58.752Z  

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) return ans;

        int[] pFreq = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < k; i++) {
            window[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pFreq, window)) {
            ans.add(0);
        }

        for (int i = k; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            window[s.charAt(i - k) - 'a']--;

            if (Arrays.equals(pFreq, window)) {
                ans.add(i - k + 1);
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-all-anagrams-in-a-string/)