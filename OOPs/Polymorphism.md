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


