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
