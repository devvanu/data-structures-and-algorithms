## Exit Point Of A Matrix

### Easy
***

1. You are given, no of rows(n) and no of columns(m)
2. You are given n\*m numbers (1's and 0's), representing elements of 2d arrays.
3. Consider this array a maze and a player enters from top-left corner in east direction.
4. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
5. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

**Example 1:**
<pre>
<b>Input: </b> n=4, m=4, arr[][] = {0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0}
<b>Output: </b> 1 3
</pre>

**Constraints:**
```
1 <= n <= 10^2
1 <= m <= 10^2
e1, e2, .. n * m elements belongs to the set (0, 1)
```
