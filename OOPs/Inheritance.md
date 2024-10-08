<h1 align="center" > Inheritance </h1>
<p align="center" > (Used to inherit other class) </p>

## When one object acquires all the properties and behaviours of a parent  object, it is known as inheritance.

### Inheritance
+ It is one of the pillar of Object Orientation.
+ It always speaks about reusability.
+ Using inheritance productivity of the code can be improved
+ If we use inheritance, lines of codes can be reduced in the application.
+ In Java, inheritance is achieved through the "extends" keyword.

### Some remebering points
+ If the parent class has any private variable then it will not extend by child class.
+ Parent class constructor is not inherit in the child class. But it is access or run by super() method


---

<h3> Types of Inheritance </h3> 

+ Single-level inheritance
+ Multi-level inheritance
+ Hierarchical inheritance
+ Multiple inheritance (it achieve form interface...)

## Single-level Inheritance

```java

class One {
    public void single() {
        System.out.println("Single");
    }
}

class Two extends One {
    public void level() {
        System.out.println("Level");
    }
}

public class demo {
    public static void main(String[] args) {
        Two obj = new Two();
        obj.single();
        obj.level();
        System.out.println("Inheritance");
    }
}


```
## Multi-level Inheritance

```java

class One {
    public void multi() {
        System.out.println("Multi");
    }
}

class Two extends One {
    public void level() {
        System.out.println("Level");
    }
}

class Three extends Two {
    public void inheritance() {
        System.out.println("Inheritance");
    }
}

public class demo {
    public static void main(String[] args) {
        Three obj = new Three();
        obj.multi();
        obj.level();
        obj.inheritance();
    }
}


```

## Hierarchical Inheritance
```java

class One {
    public void first() {
        System.out.println("Class One method");
    }
}

class Two extends One {
    public void second() {
        System.out.println("Class two mthod");
    }
}

class Three extends One {
    public void third() {
        System.out.println("Class three method");
    }
}

public class demo {
    public static void main(String[] args) {
        Two obj2 = new Two();

        obj2.first();
        obj2.second();

        Three obj3 = new Three();

        obj3.first();
        obj3.third();

    }
}


```

### Types of methods used in Inheritance
+ Inherited
+ Overridden
+ Specialized

```java

class Aeroplane {
    public void takeOff() {
        System.out.println("Aeroplane is takingOFF");
    }

    public void fly() {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane extends Aeroplane {

    public void fly() { // fly method is modified so it is Overridden method
        super.fly(); // extended fly method from parent class
        System.out.println("CargoPlane is flying");
    }

    public void carryGoods() { // carryGoods is created in this class so it is Specialized method
        System.out.println("CargoPlane carrying Goods");
    }
}

class FighterPlane extends Aeroplane {
    public void fly() {
        System.out.println("FighterPlane is flying");
    }

    public void carryWeapons() {
        System.out.println("FighterPlane carrying Weapons");
    }
}

public class demo {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.carryGoods();

        FighterPlane fp = new FighterPlane();
        fp.takeOff();
        fp.fly();
        fp.carryWeapons();

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
