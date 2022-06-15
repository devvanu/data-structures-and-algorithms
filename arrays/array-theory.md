## Java Array
- array is a collection of similar type of elements which has contiguous memory location.
- arrays in Java are 0-indexed

### #1 Creating, initializing and accessing an Array
```java
int[] marks;  // declaration   
marks = new int[5];  // memory allocation

marks[0] = 51; // initialization
marks[1] = 33;
marks[2] = 44;
marks[3] = 67;
marks[4] = 98;

// traversing an array
for(int i=0; i<marks.length; i++){
    System.out.print(marks[i] + " ");
}
```

### #2 Memory Management


### #3 Advantages
- **Random access**: we can get any data located at an index position

### #4 Disadvantages
- **Size limit**: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically.
