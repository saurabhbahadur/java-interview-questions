<h1 align="center" > String </h1>
<p align="center" > </p>


### Stack

+ A stack is a linear data structure that follows the `LIFO` (Last In, First Out) principle. It means the last element added to the stack will be the first one to be removed.

### Key Operation
1. `push(element):` Adds an element to the top of the stack.
2. `pop():` Removes the element from the top of the stack.
3. `peek():` Returns the top element of the stack without removing it.
4. `isEmpty():` Checks if the stack is empty.
5. `size():` Returns the number of elements in the stack.

+ Java provides a built-in `Stack` class from `java.util` package.

```java
        Stack<Integer> stack = new Stack<>();

        // Push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop element from the stack
        int removedElement = stack.pop();
        System.out.println("Popped element: " + removedElement);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Stack after pop operation
        System.out.println("Stack after pop: " + stack);

        // Size of the stack
        System.out.println("Size of stack: " + stack.size());

```

#### Key Characteristics

+ `LIFO` : The last element pushed onto the stack is the first one to be removed
+ `Fixed size or dynamic`: Stack can be implemented as a dynamic structure using Java's Stack class or as a fixed-size array if manually implemented.

#### Common Use Cases

+ `Function Call Stack`: Keeps track of function calls in recursion.
+ `Expression Evaluation`: Used for parsing expressions (e.g., converting infix to postfix).
+ `Undo Operations`: Software with undo features often uses a stack to keep track of user actions.
+ `Backtracking`: In algorithms like Depth First Search (DFS), stack is used to explore all paths.

#### Key Points

+ Stacks can be implemented using both `arrays` and `linked lists`.
+ The Stack class in Java is part of java.util and inherits from `Vector`. However, it is often recommended to use `Deque` (Double-ended Queue) from `ArrayDeque` as a stack due to better performance and modern design.


---


+ ### [Basic](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Basics.md)
+ ### [Introduction to Java](https://github.com/saurabhbahadur/java-interview-questions/blob/main/JAVA/Introduction%20to%20Java.md)
+ ### [Array](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Data%20Strucures/Array.md)
+ ### [Time and Space Complexity](https://github.com/saurabhbahadur/java-interview-questions/blob/main/JAVA/Time%20%26%20Space%20Complexity.md)
+ ### [Sorting](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Tech%20%26%20Algo/Sorting.md)
+ ### [String](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Data%20Strucures/String.md)
+ ### [Recursion](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Tech%20%26%20Algo/Recursion.md)
+ ### [OOPs](https://github.com/saurabhbahadur/java-interview-questions/tree/main/OOPs)
+ ### [Linked List](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Data%20Strucures/LinkedList.md)

---


<h3 align="center">Connect with me:</h3>
<p align="center">
<a href="https://twitter.com/saurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="saurabhbahadur" height="30" width="40" /></a>
<a href="https://linkedin.com/in/saurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="saurabhbahadur" height="30" width="40" /></a>
<a href="https://fb.com/singhsaurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/facebook.svg" alt="singhsaurabhbahadur" height="30" width="40" /></a>
<a href="https://instagram.com/saurabhbahadur_" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="saurabhbahadur_" height="30" width="40" /></a>
<a href="https://www.youtube.com/c/mighty saur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/youtube.svg" alt="mighty saur" height="30" width="40" /></a>
<a href="https://www.hackerrank.com/saurabhbahadur" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/hackerrank.svg" alt="saurabhbahadur" height="30" width="40" /></a>
<a href="https://discord.gg/aQR27Bg7de" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/discord.svg" alt="aQR27Bg7de" height="30" width="40" /></a>
</p>




---
