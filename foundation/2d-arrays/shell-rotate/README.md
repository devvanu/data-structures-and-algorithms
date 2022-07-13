## Shell Rotate

### Easy
***

1. You are given, no of rows(n) and no of columns(m)
2. You are given n\*m numbers (1's and 0's), representing elements of 2d arrays.
3. You will be given a ring number 's' representing the shell of the matrix
4. You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
5. You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.

**Example 1:**
<pre>
<b>Input: </b>
n=5, m=7
arr[][] = { 11 12 13 14 15 16 17 
            21 22 23 24 25 26 27 
            31 32 33 34 35 36 37 
            41 42 43 44 45 46 47 
            51 52 53 54 55 56 57 } 
s=2, r=3

<b>Output: </b>
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57
</pre>

**Constraints:**
```
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
0 < s <= min(n, m) / 2
-10^9 <= r <= 10^9
```
