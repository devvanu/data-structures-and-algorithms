# Recursion
- A function is said to be recursive if it **calls itself**.
- Recursion has two stages- High level thinking and Low level thinking. 

### # High level thinking :
1. Establish the Expectation
2. Establish the Faith
3. Link the Expectation with Faith

- Let's take the example to print `5 4 3 2 1`.
  > &nbsp;  
  > **Expectation**: Display(5) will print (5 4 3 2 1)  
  > **Faith**:  &nbsp;&nbsp;&nbsp; Display(4) will print (4 3 2 1) for sure  
  > **Link**:  &nbsp;&nbsp; Display(5) will print { 5 Display(4) }  
  >  &nbsp;  
- In General, `Display(n)` will print { n Display(n-1) }

### # Low level thinking :
1. Dry run the code and try to look at the stack frame after each recursive call.
2. This helps us to identify the base case (condition to stop the recursion)

- So for above `Display(n)` example
  > &nbsp;  
  > base condition would be (n == 0)
  > &nbsp;        
