<h1 align="center" > Abstraction </h1>
<p align="center" > (Hiding unnecessary details) </p>

## Hiding internal details and showing functionality is known as abstraction. For example phone call, we don't know the internal processing

### Abstraction
+ Data Abstraction is the process of hiding certain details and showing only essential information to the user.

### Abstract keyword and Abstraction
+ The abstract keyword is used to achieve abstraction in java. It is non-access modifier which is used to create abstract class and method.
+ The role of an abstract class to contain abstract methods. However, it may also contain non-abstract method.
+ The method is declared with an abstract keyword and doesn't have any implementation is known as an abstract method.

Syntax

```java

abstract class Aeroplane {
    abstract public void takeOff();

    abstract public void fly();

    public void landing() {
        System.out.println("Aeroplane landing.......");
    }
}

```


---

### Abstract Class and Abstract Method

+ In Java application, if we declare any abstract class with abstarct methods, then it is convention to implement all the abstract method by taking subclas.
+ To access the abstract class members, we have to create an object for the subclass and we have to create a reference variable either for abstract class or for the subclass.
+ If we create reference variablles for abstract class members, we are unable to access subclass own members.
+ If we declare a reference variable for subclass then we are able to access both abstract class members and subclass members.

```java

abstract class Aeroplane {
    abstract public void takeOff();

    abstract public void fly();

    public void landing() {
        System.out.println("Aeroplane landing.......");
    }
}

class CargoPlane extends Aeroplane {
    public void takeOff() {
        System.out.println("CargoPlane taking0ff.....");
    }

    public void fly() {
        System.out.println("CargoPlane is flying...");
    }

    public void alert() {
        System.out.println("Alert!");
    }
}

public class demo {
    public static void main(String[] args) {
        Aeroplane ref = new CargoPlane();
        ref.takeOff();
        ref.fly();
        ref.landing();

        ((CargoPlane) ref).alert(); // changing behaviour / typecasting because alert method is not present in parent class
    }
}

```

### Final Class , Final Variable , Final method

+ ### Final Class
    + If a class is marked as final, then the class won't participate in inheritance.
    + If we try to do so then it would result "Compile Time Error". 
+ ### Final Variable
    + If a variable is marked as final, then those variables are treated as compile time constants and we can't  change the value of those vaiable.
+ ### Final method
    + If the method is declared as final then those methods we can't override.

```java

// final class Animal{
//     final void sleep(){
//         System.out.println("Sleeping...");
//     }
//     final int age = 19;
// }

class Animal {
    final void sleep() {
        System.out.println("Sleeping...");
    }

    final int age = 19;
}

class tiger extends Animal {
    // void sleep(){

    // }

}

public class demo {
    public static void main(String[] args) {
        tiger t = new tiger();
        t.sleep();
    }
}

```

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
