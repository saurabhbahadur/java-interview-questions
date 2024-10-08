<h1 align="center" > Polymorphism </h1>
<p align="center" > (One thing exists in more than on form) </p>

## If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc

### Polymorphism
+ If one thing exists in more than one form , then it is called Polymorphism.
+ Polymorphism is a Greek word, where `Poly` means many and `morphism` means structures or forms.

### How to achieve polymorphism
+ It can be achieved in two ways that is `method overloading` and `method overriding`.


---

<h3> Types of Polymorphism </h3> 

+ Static Polymorphism
+ Dynamic Polymorphism

## Static Polymorphism
+ If polymorphism exists at compilation time then it is static Polymorphism.
+ Example: Overloading

```java

class Multiply {
    static int mul(int a, int b) {
        return a * b;
    }

    static int mul(int a, int b, int c) {
        return a * b * c;
    }
}

public class demo {
    public static void main(String[] args) {
        System.out.println(Multiply.mul(2, 5));
        System.out.println(Multiply.mul(4, 7, 6));
    }
}


```
## Dynamic Polymorphism
+ If the polymrphism exists at runtime then that polymorphism is called Dynamic Polymorphism.
+ Example: Overriding

```java

class Aeroplane {

    public void fly() {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane extends Aeroplane {

    public void fly() {

        System.out.println("CargoPlane is flying");
    }

}

class FighterPlane extends Aeroplane {
    public void fly() {
        System.out.println("FighterPlane is flying");
    }

}

class Airport {
    public void air(Aeroplane ref) {
        ref.fly();
    }
}

public class demo {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();
        a.air(cp);
        a.air(fp);

    }
}


```

## Difference between Method Overriding and Method Overloading

+ ### Method Overloading
    + It is compile-time polymorphism. 
    + It helps to increase the readability of the program.
    + Poor performance due to compile time polymorphism.
    + Static binding is being used for overloaded methods.

+ ### Method Overriding
    + It is a run-time polymorphism.
    + It always needs inheritance.
    + Dynamic binding is being used for overriding methods.
    + Private and final methods can't be overridden.

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

