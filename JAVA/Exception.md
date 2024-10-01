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


***


### More Topics

+ ### [Encapsulation](https://github.com/saurabhbahadur/java-prep/blob/main/Encapsulation.md)
+ ###  [Constructor](https://github.com/saurabhbahadur/java-prep/blob/main/Constructor.md)
+ ###  [Inheritance](https://github.com/saurabhbahadur/java-prep/blob/main/Inheritance.md)
+ ###  [Polymorpphism](https://github.com/saurabhbahadur/java-prep/blob/main/Polymorphism.md)
+ ###  [Abstraction](https://github.com/saurabhbahadur/java-prep/blob/main/Abstraction.md)
+ ###  [Interface](https://github.com/saurabhbahadur/java-prep/blob/main/Interface.md)
+ ###  [Exception](https://github.com/saurabhbahadur/java-prep/blob/main/Exception.md)
+ ###  [Collection](https://github.com/saurabhbahadur/java-prep/blob/main/Collection.md)
+ ### [Map](https://github.com/saurabhbahadur/java-prep/blob/main/Map.md)
+ ###  [Generics](https://github.com/saurabhbahadur/java-prep/blob/main/Generics.md)
+ ###  [Files Operation](https://github.com/saurabhbahadur/java-prep/blob/main/FilesOperation.md)
+ ### [Serialization & Deserialization](https://github.com/saurabhbahadur/java-prep/blob/main/Serialization%20%26%20Deserialization.md)
+ ###  [Application Programming Interface (Stream*)](https://github.com/saurabhbahadur/java-prep/blob/main/API.md)
+ ###  [ENUMS and Annotation](https://github.com/saurabhbahadur/java-prep/blob/main/Enums%20%26%20Annotations.md)
+ ###  [Thread](https://github.com/saurabhbahadur/java-prep/blob/main/Thread.md)


***

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)


