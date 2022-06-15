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

<img src="https://raw.githubusercontent.com/devvanu/hosted-assets/main/general/memory.jpg" width="600" height="" alt="memory" />

### #3 Implications:

1. **Performance**: 
    <br />  
    <img src="https://github.com/devvanu/hosted-assets/blob/main/general/performance.jpg" width="600" height="" alt="performance" />
    
    - Both will take the same time because in both cases we know the exact memory location. 
    
2. **Assignment**:
    <br />   
    <img src="https://github.com/devvanu/hosted-assets/blob/main/general/assignment.jpg" width="600" height="" alt="assignment" />
    
    - Heap will only allocate new memory space only if you use the new keyword.
    - Otherwise, a simple shallow copy will take place.

3. **Functions**: 
    - When we pass arrays as a parameter to a function only shallow copy takes place. 
    - And if any changes occur inside the function then the changes will be reflected everywhere. 
    <br />
     <img src="https://github.com/devvanu/hosted-assets/blob/main/general/functions.jpg" width="600" height="" alt="functions" target="none" />

### #4 Advantages
- **Random access**: we can get any data located at an index position

### #5 Disadvantages
- **Size limit**: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically.
