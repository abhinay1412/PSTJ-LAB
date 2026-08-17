# Week 3: Java Utilities, Collections, and Date/Time Processing

## Overview
Welcome to Week 3! This week's focus is on mastering essential Java utilities and data structures, and applying them to solve algorithmic problems across LeetCode and HackerRank. The exercises are designed to build a strong foundation in handling dates, dynamic collections, and custom object sorting.

Key concepts covered include:
- The Java **Date and Time API** (`LocalDate`, `Calendar`)
- The Java **Collections Framework** (specifically `ArrayList` and `PriorityQueue`)
- Custom sorting mechanisms using the `Comparator` interface and `Collections.sort()`

---

## Directory Structure & Problem Breakdown

### LeetCode Challenges (Date and Time Focus)
These problems emphasize parsing and manipulating dates to extract specific information or calculate intervals.

| Problem | Difficulty | Description | Concepts Used |
| :--- | :--- | :--- | :--- |
| **[1154. Day of the Year](./1154-day-of-the-year)** | Easy | Calculate the exact day of the year from a "YYYY-MM-DD" string, taking leap years into account. | String Parsing, Date Logic |
| **[1185. Day of the Week](./1185-day-of-the-week)** | Easy | Determine the day of the week (e.g., "Sunday", "Monday") for any valid date between 1971 and 2100. | `java.time.LocalDate` |
| **[1360. Number of Days Between Two Dates](./1360-number-of-days-between-two-dates)** | Easy | Compute the absolute difference in days between two given date strings. | `LocalDate`, `ChronoUnit` |

### HackerRank Challenges (Java Data Structures & Core Utilities)
These problems focus on practical implementation of Java's built-in data structures and object-oriented sorting techniques.

| Problem | Difficulty | Description | Concepts Used |
| :--- | :--- | :--- | :--- |
| **[Java ArrayList](./java-arraylist)** | Medium | Manage varying quantities of numbers using dynamic multidimensional lists. Includes querying specific positions and handling out-of-bounds exceptions. | `ArrayList<ArrayList<Integer>>`, Exception Handling |
| **[Java Comparator](./java-comparator)** | Medium | Sort an array of custom `Player` objects by multiple fields: first by score (descending), then by name (ascending). | `Comparator` Interface, Custom Object Sorting |
| **[Java Date and Time](./java-date-and-time)** | Easy | Write a function to return the day of the week in uppercase for a given year, month, and day. | `java.time.LocalDate` or `Calendar` |
| **[Java Priority Queue](./java-priority-queue)** | Medium | Process a stream of events to maintain a dynamically prioritized queue of students based on CGPA, name, and ID. | `PriorityQueue`, Custom `Comparator` |
| **[Java Sort](./java-sort)** | Easy | Sort a list of student objects based on their cumulative grade point average (CGPA) using standard Java collections sorting. | `Collections.sort()`, `Comparator` |

---

## Key Takeaways
- **Robust Date Handling:** Gained practical experience utilizing modern Java time APIs (`java.time.LocalDate`) to simplify complex date calculations, replacing error-prone manual arithmetic.
- **Dynamic Collections:** Leveraged the flexibility of `ArrayList` over static arrays to handle arbitrary input sizes and dynamic datasets efficiently.
- **Custom Ordering & Priority:** Mastered the `Comparator` interface to define complex, multi-tiered sorting rules. Applied these rules to standard sorting algorithms and dynamic structures like `PriorityQueue`.
- **Exception Management:** Practiced safe data retrieval with `try-catch` blocks to gracefully handle queries outside the bounds of dynamic arrays.
