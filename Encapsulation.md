<h1 align="center" > Encapsulation </h1>
<p align="center" > ( aim to restrict direct access ) </p>

## Binding code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines.

### Encapsulation
+ Binding of `data` and corresponding `methods` into a single unit is called "Encapsulation".
+ If any java class follows `data hiding` and `abstraction` then such class is referred as "Encapsulation class"

<h3 align="center" > Encapsulation = Data Hiding + Data Abstraction </h3> 

---
```java

class Person {
    private String name; // Instance Variable
    private int age; // Instance Variable

    public String getName() {
        return name; // Getters for Name
    }

    public void setName(String name) {
        this.name = name; // Setters for Name
    }

    public int getAge() {
        return age; // Getters for Age
    }

    public void setAge(int age) {
        this.age = age; // Setters for Age
    }
}

public class demo {
    public static void main(String[] args) {
        Person person = new Person(); // creating object person
        person.setName("Rohit");
        person.setAge(22);

        System.out.println("Name:" + person.getName());
        System.out.println("Age:" + person.getAge());
    }
}

```

### Shadowing Problem:
+ If both __local variable__ and __instance variable__ have the __same name__ inside the __method__ then it would result in a name_class and __jvm__ will always give __preference__ for __local variable__. This approach is called the "Shadowing Problem".

### Getters
*Getters method are used to __get the value from the instance variable__ of the class.*

__Syntax for getters method__
+ the method name should __start__ with __get__
+ it should be __public__
+ return type should __not be void__
+ it should __not__ have any __arguments__

```java
public String getName() {
        return name; // Getters for Name
    }
```

### Setters
*Setters method are used to __set the value to the instance variables__ of the class.*

__Syntax for setters method__
+ the method name should __start__ with __set__
+ it should be __public__
+ return type __should be void__
+ it should __have some arguments__

```java
public void setName(String name) {
        this.name = name; // Setters for Name
    }
```

<h1 align="center" > Interview Question </h1>

<h1> 1. What is Encapsulation in Java? Why is it called Data hiding?</h1>
<h5>Ans:</h5> `Encapsulation` refers to the bundling of fields and methods inside a single class. `Data Hiding`

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


