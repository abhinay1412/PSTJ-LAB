# Day of the Year

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `date` representing a Gregorian calendar date formatted as `YYYY-MM-DD`, return  *the day number of the year*.

 

 **Example 1:** 

```
Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.

```

 **Example 2:** 

```
Input: date = "2019-02-10"
Output: 41

```

 

 **Constraints:** 

- date.length == 10
- date[4] == date[7] == '-', and all other date[i]'s are digits
- date represents a calendar date between Jan 1st, 1900 and Dec 31st, 2019.

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 97.06%)  
**Memory:** 47.1 MB (beats 45.12%)  
**Submitted:** 2026-08-10T06:05:53.831Z  

```java
class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        
        int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        // Check for leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonths[1] = 29;
        }
        
        int dayNumber = day;
        for (int i = 0; i < month - 1; i++) {
            dayNumber += daysInMonths[i];
        }
        
        return dayNumber;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/day-of-the-year/)