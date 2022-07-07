## String Compression

### Easy
***

1. You are given a string. 
2. You have to compress the given string in the following two ways - 
3. First compression- The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
4. For "aaabbccdee", the compressed string will be "abcde".
5. Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
6. For "aaabbccdee", the compressed string will be "a3b2c2de2".

**Example 1:**
<pre>
<b>Input: </b> wwwwaaadexxxxxx
<b>Output: </b> 
wadex
w4a3dex6
</pre>

**Constraints:**
```
1 <= length of string <= 1000
```
