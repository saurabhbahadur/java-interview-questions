<h1 align="center" > Generics </h1>
<p align="center" > (type safety using Generics) </p>

### Generics and Basic of Generics
+ It was introduced from `JDK 5`. Generics is a feature in Java that allows for the creation of classes, interfaces and methods that can operate on a variety of data types.
+ It provides compile-time type safety by enabling the specification of the data type of object that a class or method can work with.
+ Generics are implemented using type parameters, which are specified inside angle bracets `<>`.

### Collections class and its inbuilt methods in Java
+ The collection class in Java is a utility class that provides a set of static methods for working with collections.
+ The class provides methhods for manipulating and searching collections , sorting list , finding the minimum and maximum values in a collection and more.

```java

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        System.out.println("Generics");
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(25);
        al.add(85);
        al.add(14);
        // al.add("hello");
        System.out.println(al);
    }

}

```

### Comparator vs Comparable Interface
+ #### Comparable
    + The Comparable Interface is used to define the natural ordering of a class.
    + The compareTo() method is defined in the Comparable Interface.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Student implements Comparable<Student> {
    int marks;
    int age;
    String name;

    public Student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "" + marks + "-" + age + "-" + name;
    }

    public int compareTo(Student a) {
        if (this.age > a.age)
            return 1;
        else
            return -1;
    }
}

public class demo {
    public static void main(String[] args) {

        Student st1 = new Student(25, 40, "Jack");
        Student st2 = new Student(78, 42, "Adam");
        Student st3 = new Student(68, 45, "Smith");

        List<Student> lst = new ArrayList<>();

        lst.add(st1);
        lst.add(st2);
        lst.add(st3);

        System.out.println(lst);

        Collections.sort(lst);
        System.out.println(lst);

    }
}
```

+ #### Comparator
    + The Comparator Interface is used to define a custom ordering of objects.
    + The compare() method is defined in the Comparator interface.
    + It is a Functional Interface

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int marks;
    int age;
    String name;

    public Student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "" + marks + "-" + age + "-" + name;
    }
}

// class Alpha implements Comparator<Student> {
// public int compare(Student a, Student b) {
// if (a.marks > b.marks)
// return 1;
// else
// return -1;
// }
// }

public class demo {
    public static void main(String[] args) {

        Student st1 = new Student(25, 14, "Jack");
        Student st2 = new Student(78, 24, "Adam");
        Student st3 = new Student(68, 18, "Smith");

        List<Student> lst = new ArrayList<>();

        lst.add(st1);
        lst.add(st2);
        lst.add(st3);

        System.out.println(lst);

        // Alpha a = new Alpha();
        // we can also do comarator through lambda expression
        Comparator<Student> com = (Student a, Student b) -> { // le
            if (a.marks > b.marks)
                return 1;
            else
                return -1;

        };
        // Collections.sort(lst, a);
        Collections.sort(lst, com); // le
        System.out.println(lst);

    }
}

```

#### String toString() Method

```java
  public String toString() {
        return "" + marks + "-" + age + "-" + name;
    }
```

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


