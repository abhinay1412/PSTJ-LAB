# String Similarity

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

For two strings A and B, we define the similarity of the strings to be the length of the longest prefix common to both strings. For example, the similarity of strings "abc" and "abd" is 2, while the similarity of strings "aaa" and "aaab" is 3.

Calculate the sum of similarities of a string S with each of it's suffixes.


**Input Format**

The first line contains the number of test cases *t*.  
Each of the next *t* lines contains a string to process, $s$.


**Constraints**

- $1 \le t \le 10$    
- $1 \le |s| \le 100000$  
- $s$ is composed of characters in the range ascii[a-z]  


**Output Format**

Output *t* lines, each containing the answer for the corresponding test case.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T12:28:08.395Z  

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
     * Complete the 'stringSimilarity' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

   public static long stringSimilarity(String s) {
    int n = s.length();
    char[] str = s.toCharArray();
    int[] z = new int[n];
    long totalSimilarity = n; // The string's similarity with itself is its full length
    
    int l = 0, r = 0;
    for (int i = 1; i < n; i++) {
        // If i is within the current window, initialize z[i] using previously computed values
        if (i <= r) {
            z[i] = Math.min(r - i + 1, z[i - l]);
        }
        // Expand the window to the right as long as characters match the prefix
        while (i + z[i] < n && str[z[i]] == str[i + z[i]]) {
            z[i]++;
        }
        // Update the window [l, r] if we found a new rightmost boundary
        if (i + z[i] - 1 > r) {
            l = i;
            r = i + z[i] - 1;
        }
        
        totalSimilarity += z[i];
    }
    
    return totalSimilarity;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

               long result = Result.stringSimilarity(s);
                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
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

[View on HackerRank](https://www.hackerrank.com/challenges/string-similarity/problem)