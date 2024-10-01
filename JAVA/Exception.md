<h1 align="center" > Exception </h1>
<p align="center" > (Unwanted event that distrub the flow) </p>

### Exception
+ An unwanted/expected event that disturbs the normal flow of execution of a program is called Exception.
+ The main objective of exception handling is to handle the exception.
+ It is available for graceful termination of program.

### Try-Catch

```java


public class demo {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;

        try {
            result = num1 / num2;
            System.out.println("in try block");
        }

        catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }

        System.out.println(result);
        System.out.println("Bye");
    }
}

```
### Handling vs Ducking an Exception
+ It is highly recomended to handle Exception.
+ In our program the code which may rise exception is called "risky code"
+ We have to place our risky code inside the try block and corresponding handling code inside the catch block.


### Rethrowing an Exception (throw , throws, finally) and custom exception

#### throw keyword in Java
+ This keyword is used in Java to throw the exception object manually and inform jvm to handle this exception.
+ __Syntax:__ throw new Arithmetic Exception ("/ by zero");

#### customized exception (User defined exception)
+ Sometimes we can create our own exception to meet our programming requirements.

#### Finally Block
+ It is not recomended to clean up code inside a try block because there is no gurantee for the exception of every statement inside a try block.

```java


public class demo {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        try {
            result = num1 / num2;

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        } finally {
            System.out.println("Finally block: This always gets executed!");
        }

        System.out.println(result);
    }

}

```

### Final , Finally , Finalize

#### Final
+ final is the modifier applicable for classes, methods and variable
+ If a class is declared as the final then child class creation is not possible.
```java

final int x = 10;

```

#### Finally
+ It is a final block associated with try-catch to maintain clean up code, which should be executed always irrespective of whether exception are raised or not raised and whether handled or not handled

```java
finally {
            System.out.println("Finally block: This always gets executed!");
        }

```

#### Finalize
+ It is a method, always invoked by Garbage Collctor just before destroying an object to perform cleanup activities






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
