<h1 align="center" > Constructor </h1>
<p align="center" > (Special method used to initialize object ) </p>

### Constructor
+ A constructor in Java is a special method that is used to initialize objects.
+ Constructor is a block of codes similar to the method.
+ Constructors must have the same name as the class within which it is defined it is not necessary for the method in Java.

---

<h3> Types of Constructor </h3> 

+ Default Constructor
+ Parametrized Constructor
+ Copy Constructor

```java

class Person {

    private String name; // Instance Variable
    private int age; // Instance Variable

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name; // Getters for Name
    }

    public int getAge() {
        return age; // Getters for Age
    }

}

public class demo {
    public static void main(String[] args) {
        Person person = new Person("adam", 32); // creating object person

        System.out.println("Name:" + person.getName());
        System.out.println("Age:" + person.getAge());
    }
}



```

### This() vs Super()
+ This()
    + this() can be used to invoke the current class constructor 
    + It can be passed as an argument in the method call
    + It can be passed as an method in the constructor call.

+ Super()
    + super() calls the parent constructor
    + It can be used to call methods from the parent.
    + It returned with no argument. 

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


