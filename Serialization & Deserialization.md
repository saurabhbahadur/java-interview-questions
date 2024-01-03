<h1 align="center"> Serialization and Deserialization </h1>
<p align="center" > (file operation) </p>

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

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)


