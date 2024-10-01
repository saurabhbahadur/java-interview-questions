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
