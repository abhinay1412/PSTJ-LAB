# Two Strings

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two strings, determine if they share a common substring.  A substring may be as small as one character.  

**Example**   
$s1 = \text{'and'}$  
$s2 = \text{'art'}$  

These share the common substring $a$.  

$s1 = \text{'be'}$  
$s2 = \text{'cat'}$  

These do not share a substring.  

**Function Description**

Complete the function *twoStrings* in the editor below.    

twoStrings has the following parameter(s):  

- *string s1:*  a string
- *string s2:*  another string    

**Returns**  

- *string:* either `YES` or `NO`

**Input Format**

The first line contains a single integer $p$, the number of test cases.		

The following $p$ pairs of lines are as follows:

- The first line contains string $s1$.
- The second line contains string $s2$.

**Constraints**

- $s1$ and $s2$ consist of characters in the range ascii[a-z].
- $1 \le p \le 10$
- $1 \le |s1|, |s2| \le 10^5$

**Output Format**

For each pair of strings, return `YES` or `NO`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T12:30:09.524Z  

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
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
    for (char c = 'a'; c <= 'z'; c++) {
        if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
            return "YES";
        }
    }
    return "NO";
}
    }


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = Result.twoStrings(s1, s2);

                bufferedWriter.write(result);
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

[View on HackerRank](https://www.hackerrank.com/challenges/two-strings/problem)