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

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)


