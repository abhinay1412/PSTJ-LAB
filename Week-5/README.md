# 🚀 Week 5: Subarrays, Dynamic Programming & String State Machines

Welcome to **Week 5** of the Problem Solving and Testing journey! This week is dedicated to mastering contiguous subarray optimizations, dynamic programming paradigms (Kadane's algorithm and circular variants), sliding window mechanics, and robust string parsing / state machines in **Java**.

---

## 🎯 Learning Objectives & Algorithmic Paradigms

- **Kadane's Dynamic Programming Algorithm:** Efficiently computes maximum contiguous subarray sums in linear $O(N)$ time with $O(1)$ auxiliary space.
- **Circular Subarray Sum Optimization:** Leverages dual Kadane evaluations (Maximum Subarray Sum and Minimum Subarray Sum) combined with total array sum to solve wrap-around circular boundaries.
- **Sliding Window Search:** Dynamically expands and shrinks window boundaries using hash sets and character index tracking to solve substring problems in $O(N)$ time.
- **String Parsing & Deterministic State Transitions:** Implements character-by-character validation, integer parsing with clamp arithmetic for 32-bit integer overflow protection (`atoi`), and isomorphic pattern matching.
- **Greedy Character Reductions:** Eliminates consecutive duplicate characters and evaluates subsequence totals in optimal single-pass linear scans.

---

## 💻 Problems Solved & Java Implementation

### LeetCode Challenges

| Problem | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| 🪟 **[3. Longest Substring Without Repeating Characters](./0003-longest-substring-without-repeating-characters/)** | 🟡 Medium | Sliding Window, Hash Set | $O(N)$ | $O(\min(N, \Sigma))$ | [Java](./0003-longest-substring-without-repeating-characters/solution.java) |
| 🔢 **[8. String to Integer (atoi)](./0008-string-to-integer-atoi/)** | 🟡 Medium | State Machine / DFA, Clamp Logic | $O(N)$ | $O(1)$ | [Java](./0008-string-to-integer-atoi/solution.java) |
| 📈 **[53. Maximum Subarray](./0053-maximum-subarray/)** | 🟡 Medium | Kadane's Algorithm (DP) | $O(N)$ | $O(1)$ | [Java](./0053-maximum-subarray/solution.java) |
| 🔠 **[890. Find and Replace Pattern](./0890-find-and-replace-pattern/)** | 🟡 Medium | Isomorphic Normalization / First Index Map | $O(N \cdot K)$ | $O(K)$ | [Java](./0890-find-and-replace-pattern/solution.java) |
| 🔄 **[918. Maximum Sum Circular Subarray](./0918-maximum-sum-circular-subarray/)** | 🟡 Medium | Dual Kadane (Max + Min Subarray) | $O(N)$ | $O(1)$ | [Java](./0918-maximum-sum-circular-subarray/solution.java) |
| 🔍 **[1408. String Matching in an Array](./1408-string-matching-in-an-array/)** | 🟢 Easy | Brute-Force Substring Search | $O(N^2 \cdot L)$ | $O(1)$ | [Java](./1408-string-matching-in-an-array/solution.java) |

### HackerRank Challenges

| Problem | Difficulty | Algorithmic Paradigm | Time Complexity | Space Complexity | Solution |
| :--- | :---: | :--- | :---: | :---: | :---: |
| ✂️ **[Alternating Characters](./alternating-characters/)** | 🟡 Medium | Greedy Adjacent Scan / Deletions | $O(N)$ | $O(1)$ | [Java](./alternating-characters/solution.java) |
| 📊 **[The Maximum Subarray](./maxsubarray/)** | 🟡 Medium | Kadane's DP + Greedy Subsequence Sum | $O(N)$ | $O(1)$ | [Java](./maxsubarray/solution.java) |
| 🍫 **[Subarray Division (Birthday Bar)](./the-birthday-bar/)** | 🟡 Medium | Fixed-Length Sliding Window / Prefix Sum | $O(N)$ | $O(1)$ | [Java](./the-birthday-bar/solution.java) |

---

## 🛠️ Summary Statistics

| Metric | Details |
| :--- | :---: |
| **Total Problems** | **9** |
| **Platforms** | LeetCode (6) · HackerRank (3) |
| **Difficulty** | 🟢 Easy: 1 &nbsp;\|&nbsp; 🟡 Medium: 8 &nbsp;\|&nbsp; 🔴 Hard: 0 |
| **Language** | Java ☕ |

---

<div align="center">

*Week 5 completed successfully!*

</div>
