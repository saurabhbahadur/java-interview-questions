<h1 align="center"> Application Programming Interface (API) </h1>
<p align="center" > () </p>

### Application Programming Interface
+ An API refers to a set of classes, methods, functions, and protocols that allow interactions between different software components.
+ APIs define how different software components should interact, making it easier to develop applications by providing pre-define functionalities.

__Types of API encounters in JAVA__

### 1. Java Standard Edition (SE) API: 
+ This is the core API provided by Java, offering essential functionalities for tasks like input/output operations, networking, collections, concurrency, and more. It includes packages like java.lang, java.util, java.io, etc.

### 2. Java Enterprise Edition (EE) API: 
+ This extends the functionality of the Java SE API to support enterprise-level applications, including web services, servlets, Java Persistence API (JPA), JavaServer Pages (JSP), and more.

### 3. Third-Party APIs: 
+ These are APIs developed by third-party vendors or open-source communities to provide additional functionalities not included in the core Java APIs. Examples include libraries like Gson for JSON processing, Apache HttpClient for HTTP requests, and many more.

### 4. Custom APIs: 
+ Developers can create their own APIs to define interfaces and functionalities specific to their applications, allowing other developers to interact with their software components.


### Date and Time API (Joda-Time API)
+ Until Java `1.7v` the classe present in Java.util package to handle Date and Time(like Date , Calender , TimeZone etc) are not up to the mark with respect to convenience and performance.

```java
import java.util.Date;

public class demo {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        long timeInMs = date.getTime();

        java.sql.Date dt = new java.sql.Date(timeInMs);
        System.out.println(dt);

    }
}

```

+ To overcome this problem in the `1.8v` __Oracle__ people introduced `Joda-Time API`.
+ This API developed by `joda.org` and available in Java in the form of `java.time` package.

```java
import java.time.LocalDate;
import java.time.LocalTime;

public class demo {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day + "/" + month + "/" + year);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nano = time.getNano();

        System.out.println(hour + ":" + min + ":" + sec + ":" + nano);

    }
}

```

### ForEach() Method

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class demo {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(2, 4, 5, 7, 6, 1);
        System.out.println(lst);

        // for (Integer i : lst) {      // for each loop
        //     System.out.println(i);
        // }

        // Consumer<Integer> cons = (i) -> {System.out.println(i);}; // lambda expression 

        // lst.forEach(cons);
        lst.forEach(i->System.out.println(i));

    }
}
```

### Stream API *
+ The Stream API in Java is part of the `java.util.stream` package and was introduced in `Java 8`. 
+ It provides a powerful way to process and `manipulate` collections of objects in a functional programming style. 
+ Streams enable you to perform various operations on collections, such as filtering, mapping, reducing, and more, using concise and readable code.

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(4, 7, 3, 7, 9, 3, 9, 1);
        Stream<Integer> streamData = lst.stream();
        Stream<Integer> finalStream = streamData.filter(n -> n % 2 == 0).sorted().map(n -> n * 2);

        finalStream.forEach(n -> System.out.println(n));

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
