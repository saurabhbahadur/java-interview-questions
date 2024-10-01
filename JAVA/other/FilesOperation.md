<h1 align="center"> Files Handling/Operation in Java </h1>
<p align="center" > (file operation) </p>

### Files Operation
+ File Class, we can work with files. This File Class is inside the java.io package. The File class can be used by creating an object of the class and then specifying the name of the file.



### Creating File and Directory 


```java
import java.io.File;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {

        File file = new File("demo.txt");

        System.out.println(file.exists()); // False

        file.createNewFile();
        System.out.println(file.exists()); // True

        File dir = new File("Demo");
        System.out.println(dir.exists()); // False

        dir.mkdir();
        System.out.println(dir.exists()); // True

    }
}

```

### Writing Data Onto File Using FileWriter 

```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {

        File file = new File("demo.txt");
        file.createNewFile();
        System.out.println(file.exists()); // True
        FileWriter fw = new FileWriter(file);
        fw.write("Demo file text ");
        fw.write("\n");
        fw.write(85);
        fw.write("\n");
        fw.write(25);
        fw.write("\n");
        char ch[] = { 'a', 'e', 'i', 'o', 'u' };
        fw.write("\n");
        fw.write(ch);
        fw.close();
        System.out.println("Open demo.txt file to see result");
    }
}

```
### Reading Data From the File Using FileReader 

```java
import java.io.File;
import java.io.FileReader;

public class demo {
    public static void main(String[] args) throws Exception {

        File file = new File("demo.txt");
        FileReader fr = new FileReader(file);

        char ch[] = new char[(int) file.length()];
        fr.read(ch);
        for (char data : ch) {
            System.out.print(data);
        }

        // int i = fr.read();
        // while (i != -1) {
        // System.out.print(i + "--->");
        // System.out.println((char) i);
        // i = fr.read();
        // }

    }
}

```
### Writing Data Onto File Using BufferedWriter 

```java
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {

        File file = new File("demo.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Buffered Writer");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        bw.write(68);
        bw.newLine();
        bw.write(70);
        bw.newLine();

        bw.flush();
        bw.close();
        System.out.println("Open demo.txt file to see result");
    }
}

```
### Reading Data From the File Using BufferedReader

```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class demo {
    public static void main(String[] args) throws Exception {

        File file = new File("demo.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();

        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }

    }
}

```

### Write Operation with PrintWriter
```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class demo {
    public static void main(String[] args) throws IOException {

        File file = new File("demo.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.write(85);
        pw.write("\n");
        pw.println("Print Writer");
        pw.println('a');
        pw.println(50.5);
        pw.println(true);
        pw.close();
        System.out.println("Open demo.txt file to see result");
    }
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


