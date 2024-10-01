<h1 align="center"> Serialization and Deserialization </h1>
<p align="center" > ( converts the state of an object into a byte stream) </p>

### Serialization(1.1v)
+ The process of saving (or) writing state of an object to a file is called Serialization but strictly speaking it is the process of converting an object from java supported form to either network supported form to either network supported form to either network supported form (or) file supported form.
+ By using FileOutputStream and ObjectOutputStream classes. We achieve serialization process.

```java
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Player implements Serializable {
    private String name;
    private int age;
    private int runs;

    public Player(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
}

public class demo {
    public static void main(String[] args) throws Exception {
        Player p = new Player("Sachin", 24, 255);
        FileOutputStream fos = new FileOutputStream("demo.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(p);
        oos.flush();
        oos.close();

    }
}
```



### Deserialization 
+ The process of reading state of an object from a file is called Deserialization but strictly speaking it is the process of converting an object from file supported form (or) network supported form to java supported form.
+ By using FileInputStream and ObjectInputStream classes we can achieve Deserialization.

```java
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Player implements Serializable {

    private String name;
    private int age;
    private int runs;

    public Player(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}

public class demo {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("demo.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Player pl = (Player) ois.readObject();
        pl.disp();
        ois.close();

    }
}

```

```java
Exception in thread "main" java.io.InvalidClassException: Player; local class incompatible: stream classdesc serialVersionUID = -6023507081811510214, local class serialVersionUID = 9134839684087160594
        at java.base/java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:601)
        at java.base/java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:2062)
        at java.base/java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1909)
        at java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2235)
        at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1744)
        at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:514)
        at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:472)
        at demo.main(demo.java:32)

```

### Transient (selective Serialization)
```java
class Player implements Serializable {
    private String name;
    transient int age;  // Selective Serialization
    private int runs;

    public Player(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
}
```


### Input Stream
+ The InputStream class of the `java.io` package is an abstract superclass that represents an input stream of bytes.
+ InputStream is an abstract class, it is not useful by itself. However, its subclass can be used to read data.

### Output Stream
+ The Output Stream class of the `java.io` package is an abstract superclass that represents an output stream of bytes.
+ Output Stream is an abstract class, it is not useful by itself. However, it subclass can be used  to write data.

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
