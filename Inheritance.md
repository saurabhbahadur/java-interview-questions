<h1 align="center" > Inheritance </h1>
<p align="center" > (Used to inherit other class) </p>

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

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)


