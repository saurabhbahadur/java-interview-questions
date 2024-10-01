<h1 align="center" > Interface </h1>
<p align="center" > (Use to achieve Abstraction) </p>

### Interface
+ It will allow only abstract methods.
+ It cannot be instantiated.
+ Variables are `public static final`
+ Methods are `public and abstract`
+ No constructor in interface
+ It achieve through `implements` keyword.  

Syntax

```java
interface Computer {
    void compileCode();
}

```

Example

```java
interface Computer {
    void compileCode();
}

class Laptop implements Computer {
    public void compileCode() {
        System.out.println(" Laptop :Slower than Desktop");
    }
}

class Desktop implements Computer {
    public void compileCode() {
        System.out.println("Computer : Faster than Laptop");
    }
}

class Developer {
    public void buildApp(Computer obj) {
        System.out.println("Developing....");
        obj.compileCode();
    }
}

public class demo {
    public static void main(String[] args) {
        Computer obj = new Desktop();
        Developer dev = new Developer();
        dev.buildApp(obj);
    }
}

```

### Types of Interfaces
+ Single Abstract Method : It is same as Functional Interface
+ Normal Interface : More than one methods used in Interface
+ Marker Interface : Zero methods used in Interface

## Java 8 Features over Interface
+ Default methods in Interface
+ Static methods in Interface
+ Functional Interface / Single Abstract Method Interface

### Default and Static Methods in Interface

```java

interface Computer {
    void compileCode();

    default void runCode() { // default methods in interface
        System.out.println("Code is running from default method ");
    }

    static void output() { // static methods in interface
        System.out.println("output from static method");
    }
}

class Laptop implements Computer {
    public void compileCode() {
        System.out.println(" Laptop :Slower than Desktop");
    }
}

public class demo {
    public static void main(String[] args) {
        Computer c = new Laptop();
        c.compileCode();
        c.runCode();

        Computer.output();
    }
}

```

### Functional Interface
+ If any Java Interface allow only `one abstract method` then it is called a Functional Interface.
+ To make any interface as Functional Interface then we have to use the following annotation just above of the interface `@FunctionalInterface`
+ Example
    + java.lang.Runnable
    + java.lang.Comparable


```java

class A {
    public void show() {
        System.out.println("In Show");
    }

    class B {
        public void display() {
            System.out.println("In display");
        }
    }
}

public class demo {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj2 = obj.new B();
        obj.show();
        obj2.display();
    }
}

```
### Lambda Expression Syntax
+ Java lambda expression is consisted of three components.

```
    (parameter-list)->{body}
```

__Argument-List:__ It can be empty or non-empty as well.
__Arrow-Token:__ It is used to link arguments-list and body of expression.
__Body:__ It contains expression and statements for Lambda Expression.

```java
@FunctionalInterface
interface Car {
    void drive();
}

public class demo {
    public static void main(String[] args) {
        // Car obj = new Car() {
        // public void drive() {
        // System.out.println("driving");
        // }
        // };
        Car obj = () -> System.out.println("driving"); // lambda expression
        obj.drive();
    }
}

```

---

### Abstract vs Interface

| Abstract | Interface |
| ------ | ----------- |
|If we are talking about implementation but not completely(partial implementation) then we should go for abstract class  | If we don't know anything about implementation just we have requirement specification then we should go for an Interface |
| Every method present inside abstract class need not to be public and abstract | Every method present inside the interface is always public and abstract whether we are declaring or not |
|There are no restrictions on abstract class method modifiers  | We can't declare interface methods with the modifiers private, protected, final , static , synchronized, native.  |
| Every absract class variables need not be a public static final | Every interface variable is always a public static final whether we are declaring or not following modifiers private , protected , final , transient , volatile |
| Inside the abstract class we can take constructor | Inside the interface we can't take constructor |


***




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
