# Stack in Java

- Stack is a linear data structure (where data elements are arranged sequentially or linearly). Here, we can traverse all the data items in a single pass.
- It follows a **Last In First Out** (LIFO) order for doing various operations.

## #1 Declaration :

```java
Stack<Integer> st = new Stack<>();  // creating an empty stack
```
- **Note**: if we hadn't initialized the stack with the `new` keyword, then only a reference of the stack would have been created in RAM's stack and it would have pointed to NULL. 


## #2 Operations :

### 1. push(ele)
- add an element on the top of the stack.
- if the stack is full, then it is a Stack Overflow Condition.

```java
st.push(10); 
st.push(20);
st.push(30);
st.push(40);
System.out.println(st);  // [10, 20, 30, 40]
```

### 2. peek()
- returns top element of the stack, but does not remove it.
- it will give runtime error if there is no element in the stack.

```java 
st.peek();   // 40
```

### 3. pop()
- removes and returns the top element of the stack.
- if the stack is empty, then it is a Stack Underflow Condition.

```java
st.pop();  // 40
st.pop();  // 30
```

### 4. size()
- returns the number of elements present in the stack.

```java
st.size();  // 2
```

### 5. empty()
- returns `true` if stack is empty, else `false`

```java
st.empty();  // false
```

<br />

- **Note:** All the above Operations are constant operations as the time complexity is O(1) per call.
