# Stack in JavaScript
- Stack is a linear data structure (where data elements are arranged sequentially or linearly). 
- Here, we can traverse all the data items in a single pass.
- It follows a **Last In First Out** (LIFO) order for doing various operations. 
- **JS Array** type provides the `push()` & `pop()` methods that allow you to use an array as a stack.


## # Operations & Implementation : 

```javascript
// Program to implement stack data structure

class Stack{
  
    constructor(){
      this.items = [];
    }

    push(element){  /* add an element on the top of the stack
                       if the stack is full, then it is a Stack Overflow Condition */
      // ( assume the stack can grow dynamically, we are not considering the overflow condition here )
      this.items.push(element);
    }

    pop(){  /* removes and returns the top element of the stack.
               if the stack is empty, then it is a Stack Underflow Condition */
      if(this.items.length == 0) return "underflow";
      return this.items.pop();
    }

    peek(){  // returns top element of the stack, but does not remove it.
      return this.items[this.items.length - 1];
    }

    size(){  // returns the number of elements present in the stack.
      return this.items.length;
    }

    isEmpty(){  // returns true if stack is empty, else false
      return this.items.length == 0;
    }

    clear(){  // clear the stack
      this.items = [];
    }
  
}

let stack = new Stack();     // creating object for Stack class

// testing isEmpty() and pop() on empty stack
console.log(stack.isEmpty());   // true
console.log(stack.pop());       // "underflow"

// adding element to the stack
stack.push(10);
stack.push(20);
stack.push(30);
console.log(stack.items);     // [10, 20, 30]

// removing element
console.log(stack.pop());     // 30
console.log(stack.items);     // [10, 20]

// printing top element of the stack
console.log(stack.peek());    // 20

// printing stack size
console.log(stack.size());    // 2

// checking whether stack is empty or not
console.log(stack.isEmpty());  // false

// clearing the stack
stack.clear();
console.log(stack.items);     // []
```

## # Application :
- Reverse a word
- *Undo* mechanism in text editors
- Syntax parsing
- Expression Conversion (infix, prefix, postfix)
