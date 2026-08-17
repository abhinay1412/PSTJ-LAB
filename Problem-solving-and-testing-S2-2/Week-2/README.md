# 🚀 Week 2: Core Data Structures & Algorithms

Welcome to **Week 2** of my Problem Solving and Testing journey! This week was heavily focused on strengthening my foundational algorithmic skills using **Java**. I dove deep into working with Arrays, Hash Maps, Prefix Sums, and classic optimization techniques.

## 🎯 Learning Objectives & Impact

The challenges this week were carefully selected to build proficiency in identifying patterns and writing highly optimized Java code. By solving these problems, I significantly improved my ability to write clean, efficient, and scalable code.

Here are the key takeaways and the impact of this week's learning:
- **Two-Pointer Techniques:** Mastered optimizing space complexity to $O(1)$ by manipulating arrays in-place (e.g., removing elements and duplicates). This is a crucial skill for memory-constrained environments.
- **Prefix Sums:** Learned to precompute running totals to answer accumulation queries in $O(1)$ time, optimizing array traversal operations.
- **Hashing & Maps:** Utilized `HashMap` for $O(1)$ lookups, enabling efficient grouping (Anagrams) and frequency counting (Top K Elements).
- **Kadane's Algorithm:** Grasped dynamic programming for contiguous subarray problems, reducing $O(N^2)$ brute-force solutions to an elegant $O(N)$ approach.
- **Priority Queues (Heaps):** Handled top-K elements efficiently without the overhead of sorting the entire dataset.

## 💻 Problems Solved & Java Implementation

Here is the list of problems I conquered this week, along with the core concepts applied in my Java implementations:

| Problem | Core Concept / Algorithm | Time Complexity | Space Complexity |
| :--- | :--- | :---: | :---: |
| 🔄 **[Group Anagrams](./group-anagrams/)** | Hash Maps, String Sorting | $O(N \cdot K \log K)$ | $O(N \cdot K)$ |
| 📈 **[Maximum Subarray](./maximum-subarray/)** | Kadane's Algorithm (DP) | $O(N)$ | $O(1)$ |
| 🧹 **[Remove Duplicates from Sorted Array](./remove-duplicates-from-sorted-array/)** | Two Pointers (In-place) | $O(N)$ | $O(1)$ |
| 🗑️ **[Remove Element](./remove-element/)** | Two Pointers (In-place) | $O(N)$ | $O(1)$ |
| ➕ **[Running Sum of 1d Array](./running-sum-of-1d-array/)** | Prefix Sum | $O(N)$ | $O(1)$ |
| 🏔️ **[Find the Highest Altitude](./find-the-highest-altitude/)** | Prefix Sum | $O(N)$ | $O(1)$ |
| 🔀 **[Shuffle the Array](./shuffle-the-array/)** | Array Manipulation | $O(N)$ | $O(N)$ |
| 🔝 **[Top K Frequent Elements](./top-k-frequent-elements/)** | Hash Maps, Priority Queue (Min-Heap) | $O(N \log K)$ | $O(N)$ |

*(Note: $N$ is the number of elements in the array/collection, $K$ is the length of strings or target frequency)*

## 🛠️ Tech Stack & Best Practices
- **Language:** Java ☕
- **Focus:** 
  - Strict Time and Space Complexity Analysis.
  - Writing clean, readable, and well-structured code.
  - Handling edge cases effectively (empty arrays, negative numbers, etc.).

---
*"Consistency is the key to mastering algorithms. Every problem solved is a new pattern recognized."*