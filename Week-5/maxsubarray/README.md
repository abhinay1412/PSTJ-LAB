# The Maximum Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

We define *subsequence* as any subset of an array.  We define a *subarray* as a *contiguous subsequence* in an array.  

Given an array, find the maximum possible sum among:

1. all nonempty subarrays. 
2. all nonempty subsequences. 

Print the two values as space-separated integers on one line. 

**Note** that empty subarrays/subsequences should not be considered. 

**Example**  
$arr = [-1, 2, 3, -4, 5, 10]$   

The maximum subarray sum is comprised of elements at inidices $[1-5]$.  Their sum is $2 + 3 + -4 + 5 + 10 = 16$.  The maximum subsequence sum is comprised of elements at indices $[1, 2, 4, 5]$ and their sum is $2 + 3 + 5 + 10 = 20$.  

**Function Description**  

Complete the *maxSubarray* function in the editor below.    

maxSubarray has the following parameter(s):  

- *int arr[n]:* an array of integers  

**Returns**  

- *int[2]:* the maximum subarray and subsequence sums  

**Input Format**

The first line of input contains a single integer $t$, the number of test cases.

The first line of each test case contains a single integer $n$.   
The second line contains $n$ space-separated integers $arr[i]$ where $0 \le i \lt n$.   

**Constraints**

- $1 \le t \le 10$
- $1 \le n \le 10^5$   
- $-10^4 \le arr[i] \le 10^4$   


*The subarray and subsequences you consider should have at least one element.*

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T12:16:30.018Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    /*
     * Complete the 'maxSubarray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int maxSubarray = arr.get(0);
        int currentSubarray = arr.get(0);
        int maxSubsequence = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            int val = arr.get(i);

            // 1. Max Subarray: Kadane's Algorithm
            currentSubarray = Math.max(val, currentSubarray + val);
            maxSubarray = Math.max(maxSubarray, currentSubarray);

            // 2. Max Subsequence: Greedily add positives, or track max negative
            maxSubsequence = Math.max(Math.max(maxSubsequence, val), maxSubsequence + val);
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result.maxSubarray(arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/maxsubarray/problem)