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
