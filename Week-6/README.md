# 🚀 Week 6: Advanced String Algorithms, Palindromes & Sliding Window

Welcome to **Week 6** of the Problem Solving and Testing journey! This week centers on advanced string algorithms, sliding window frequency tracking, palindromic transformations, string invariance, and high-performance pattern matching in **Java**.

---

## 🎯 Learning Objectives & Algorithmic Paradigms

- **Expand Around Center (Palindromic Substrings):** Expands outward from odd and even center candidates to discover the longest palindromic substring in $O(N^2)$ time with $O(1)$ space.
- **Sliding Window with Frequency Hashes (Anagram Search):** Employs fixed-size 26-element integer frequency arrays to match permutation signatures in linear $O(N)$ time.
- **String Doubling & Concatenation Invariance:** Exploits circular periodicity properties ($S+S$) to solve string rotations and repeated substring validations in elegant linear time.
- **Z-Algorithm & Suffix Matching:** Computes the Longest Common Prefix (LCP) array between a string and all its suffixes in optimal linear time for complex similarity searches.
- **Fast I/O & Range Querying for Large-Scale Challenges:** Handles high-volume competitive inputs ($N = 5 \times 10^5$) using `BufferedReader`, `BufferedWriter`, and sparse table preprocessing.

---

## 💻 Problems Solved & Java Implementation

### LeetCode Challenges

| Problem | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| 🪞 **[5. Longest Palindromic Substring](./0005-longest-palindromic-substring/)** | 🟡 Medium | Expand Around Center / Palindrome Sieve | $O(N^2)$ | $O(1)$ | [Java](./0005-longest-palindromic-substring/solution.java) |
| 📍 **[28. Find Index of First Occurrence](./0028-find-the-index-of-the-first-occurrence-in-a-string/)** | 🟢 Easy | Sliding Window / Substring Comparison | $O((N-M+1) \cdot M)$ | $O(1)$ | [Java](./0028-find-the-index-of-the-first-occurrence-in-a-string/solution.java) |
| 🔠 **[438. Find All Anagrams in a String](./0438-find-all-anagrams-in-a-string/)** | 🟡 Medium | Sliding Window Frequency Vector ($26$-bucket) | $O(N)$ | $O(1)$ | [Java](./0438-find-all-anagrams-in-a-string/solution.java) |
| 🔁 **[459. Repeated Substring Pattern](./0459-repeated-substring-pattern/)** | 🟢 Easy | Divisor Slicing / Periodicity Check | $O(N \cdot \sqrt{N})$ | $O(N)$ | [Java](./0459-repeated-substring-pattern/solution.java) |
| 🔄 **[796. Rotate String](./0796-rotate-string/)** | 🟢 Easy | Concatenation Invariance ($S + S$) | $O(N)$ | $O(N)$ | [Java](./0796-rotate-string/solution.java) |

### HackerRank Challenges

| Problem | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| 🔄 **[Circular Palindromes](./circular-palindromes/)** | 🔴 Hard | Manacher's / Center Radius / Sparse Table | $O(N \log N)$ | $O(N \log N)$ | [Java](./circular-palindromes/solution.java) |
| 📡 **[Mars Exploration](./mars-exploration/)** | 🟢 Easy | Modulo 3 Periodic Signature Check | $O(N)$ | $O(1)$ | [Java](./mars-exploration/solution.java) |
| 🧩 **[Palindrome Index](./palindrome-index/)** | 🟡 Medium | Two-Pointer Mismatch Lookahead | $O(N)$ | $O(1)$ | [Java](./palindrome-index/solution.java) |
| ⚡ **[String Similarity](./string-similarity/)** | 🟡 Medium | Z-Algorithm (Longest Common Prefix Array) | $O(N)$ | $O(N)$ | [Java](./string-similarity/solution.java) |
| 🔤 **[Two Strings](./two-strings/)** | 🟢 Easy | Character Set / Frequency Match | $O(A+B)$ | $O(1)$ | [Java](./two-strings/solution.java) |

---

## 🛠️ Summary Statistics

| Metric | Details |
| :--- | :---: |
| **Total Problems** | **10** |
| **Platforms** | LeetCode (5) · HackerRank (5) |
| **Difficulty** | 🟢 Easy: 4 &nbsp;\|&nbsp; 🟡 Medium: 5 &nbsp;\|&nbsp; 🔴 Hard: 1 |
| **Language** | Java ☕ |

---

<div align="center">

*Week 6 completed successfully!*

</div>
