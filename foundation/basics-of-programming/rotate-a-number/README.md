## Rotate A Number

### Easy
***

1. You are given two numbers n and k. 
2. You are required to rotate n, k times to the right/left. 
3. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. 
4. Do the reverse for negative value of k. 
5. Also k can have an absolute value larger than number of digits in n..
7. Print the rotated number.
8. **Note** - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given  
   n = 12340056, k = 3, r = 05612340

**Example 1:**
<pre>
<b>Input: </b> 27391 2
<b>Output: </b> 91273
</pre>

**Example 2:**
<pre>
<b>Input: </b> 27391 6
<b>Output: </b> 12739
</pre>

**Example 3:**
<pre>
<b>Input: </b> 27391 -2
<b>Output: </b> 39127
</pre>


**Constraints:**
```
1 <= n < 10^9
-10^9 < k < 10^9
```
