# Matrix Layer Rotation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a 2D  matrix of dimension $m \times n$ and a positive integer $r$. You have to rotate the matrix $r$ times and print the resultant matrix. Rotation should be in anti-clockwise direction.  

Rotation of a $4x5$ matrix is represented by the following figure. Note that in one rotation, you have to shift elements by one step only.

![matrix-rotation](https://hr-challenge-images.s3.amazonaws.com/2517/matrix-rotation.png)

It is guaranteed that the minimum of _m_ and _n_ will be even.  

As an example rotate the Start matrix by 2:

<pre>
	Start		  First 		  Second
	 1 2 3 4	   2  3  4  5      3  4  5  6
	12 1 2 5  ->   1  2  3  6 ->   2  3  4  7
	11 4 3 6      12  1  4  7      1  2  1  8
	10 9 8 7      11 10  9  8     12 11 10  9
</pre>

**Function Description**  

Complete the *matrixRotation* function in the editor below.  

matrixRotation has the following parameter(s):  

- *int matrix[m][n]:* a 2D array of integers  
- *int r:* the rotation factor   

**Prints**   
It should print the resultant 2D integer array and return nothing.  Print each row on a separate line as space-separated integers.  

**Input Format**

The first line contains three space separated integers, $m$, $n$, and $r$, the number of rows and columns in $matrix$, and the required rotation.    
The next $m$ lines contain $n$ space-separated integers representing the elements of a row of $matrix$.  

**Constraints**

$2 \le \text{m, n} \le 300$  
$1 \le r \le 10^9$  
$min(m, n) \% 2 = 0$  
$1 \le matrix[i][j] \le 10^8 \text{ where }i \in [1 \dots m] \text{ and }j \in [1 \dots n]$
 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T06:34:12.399Z  

```java
import java.io.*;
import java.util.*;

class Result {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();
        int numRings = Math.min(m, n) / 2;

        for (int k = 0; k < numRings; k++) {
            List<Integer> ring = new ArrayList<>();
            
            // 1. Extract the current ring/layer
            // Top row
            for (int j = k; j < n - k; j++) {
                ring.add(matrix.get(k).get(j));
            }
            // Right column
            for (int i = k + 1; i < m - k; i++) {
                ring.add(matrix.get(i).get(n - 1 - k));
            }
            // Bottom row
            for (int j = n - 2 - k; j >= k; j--) {
                ring.add(matrix.get(m - 1 - k).get(j));
            }
            // Left column
            for (int i = m - 2 - k; i > k; i--) {
                ring.add(matrix.get(i).get(k));
            }

            // 2. Rotate the elements and put them back
            int len = ring.size();
            int rot = r % len; 
            int idx = rot;
            
            // Top row
            for (int j = k; j < n - k; j++) {
                matrix.get(k).set(j, ring.get(idx % len));
                idx++;
            }
            // Right column
            for (int i = k + 1; i < m - k; i++) {
                matrix.get(i).set(n - 1 - k, ring.get(idx % len));
                idx++;
            }
            // Bottom row
            for (int j = n - 2 - k; j >= k; j--) {
                matrix.get(m - 1 - k).set(j, ring.get(idx % len));
                idx++;
            }
            // Left column
            for (int i = m - 2 - k; i > k; i--) {
                matrix.get(i).set(k, ring.get(idx % len));
                idx++;
            }
        }

        // 3. Print the rotated matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix.get(i).get(j) + (j == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);
        int n = Integer.parseInt(firstMultipleInput[1]);
        int r = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] matrixRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> matrixRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int matrixItem = Integer.parseInt(matrixRowTempItems[j]);
                matrixRowItems.add(matrixItem);
            }
            matrix.add(matrixRowItems);
        }

        Result.matrixRotation(matrix, r);

        bufferedReader.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/matrix-rotation-algo/problem)