<h1 align="center" > Collection </h1>
<p align="center" > (Framework to implement algorithm) </p>

### Collection
+ The Collection framework (1.2v) is a set of interfaces , implementations, and algorithms that provide a standarized way to work with groups of objects. It was introduced to simplify the process of storing , manipulating , and processing collection of data in Java applications  

### Collection Hierarchy

+ Iterable
    + Collections
        + List
            + Array List
            + Linked List
            + Vector
            + Stack
        + Queue
            + Priority Queue
            + Deque
            + Array Dequeue
        + Set
            + Hash Set
            + Linked Hashset
            + Sorted Set
            + Tree Set


### List Interface
+ List Interface is the child interface of collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate value.
+ List Interface is implemented by the classes Array List , Linked List , Vector and Stack

#### ArrayList
+  The ArrayList class implements the List Interface.
+ It uses a dynamic array to store the duplicate element of different data types.
+ The ArrayList class maintains the insertion order and is non-synchronized.
+ The elements stored in the ArrayList class can be randomly accessed.

```java
import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(24);
        al.add(45);
        al.add(254);
        al.add("Saurabh");
        al.add(214.456);
        System.out.println(al);

        ArrayList al2 = new ArrayList<>();

        al2.addAll(al);
        al2.add("Bahadur");
        System.out.println(al2);
    }

}


```

Output

```
[24, 45, 254, Saurabh, 214.456]
[24, 45, 254, Saurabh, 214.456, Bahadur]

```

#### ArrayDequeue
+ ArrayDequeue class implements the dequeue interface.
+ It facilitates us to use the Deque. Unlike queue , we can add or delete the elements from both the ends.
+ ArrayDequeue is faster than ArrayList and Stack and has no capacity restrictions.

```java
import java.util.ArrayDeque;

public class demo {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque<>();
        ad.add(46);
        ad.add(1546);
        ad.add("Saurabh");
        ad.add(45646);
        ad.offer(466);
        ad.addFirst(4346);
        ad.addLast(456);
        ad.offerFirst(254);
        ad.offerLast(7899);

        System.out.println(ad);
    }

}

```

Output

```
[254, 4346, 46, 1546, Saurabh, 45646, 466, 456, 7899]
```

### PriorityQueue (min-heap)
+ The PriorityQueue class implements the Queue interface.
+ It holds the elements or objects which are to be processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.

```java
import java.util.PriorityQueue;

public class demo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();

        pq.add(456);
        pq.add(78);
        pq.add(25);
        pq.add(67);
        pq.add(64);
        pq.add(7);

        System.out.println(pq);
    }

}
```

Output

```
[7, 64, 25, 456, 67, 78]
```

### TreeSet (BST)
+ TreeSet class implements the set interface that uses a tree for storage.
+ TreeSet also contains unique elements.
+ However, the access and retrieval time of TreeSet is quite fast.
+ The elements in TreeSet stored in ascending order.

```java
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(24);
        ts.add(58);
        ts.add(62);
        ts.add(54);
        ts.add(78);
        ts.add(61);
        System.out.println(ts);
        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));
        System.out.println(ts.ceiling(60));
        System.out.println(ts.floor(60));
    }

}
```

Output

```
[24, 54, 58, 61, 62, 78]
54
24
61
58
```

### HashSet (1.2v)
__HashSet class is used to create a collection that uses a hash table for storage. It inherits the Abstract Set class and implement Set Interface.__

+ HashSet stores the elements by using a mechanism called Hashing.
+ HashSet contains unique elements only.
+ HashSet allows null value.
+ HashSet class is not synchronized.
+ The initial default capacity of HashSet is 16, and the load factor is 0.75.


```java
import java.util.HashSet;

public class demo {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add(26);
        hs.add(25);
        hs.add(45);
        hs.add(34);
        hs.add(87);
        hs.add(75);
        System.out.println(hs);
    }

}
```

Output

```
[34, 87, 25, 26, 75, 45]
```

### LinkedHashSet
__It is a HashTable  and LiskedList implementation of the Set Interface. It inherits the HashSet class and implement the Set interface.__

+ LinkedHashSet clas contains unique elements only like HashSet.
+ Provides all optional set operations and permits null elements is non-synchronized.
+ maintains insertion order


```java
import java.util.LinkedHashSet;

public class demo {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet<>();
        lhs.add(45);
        lhs.add(34);
        lhs.add(85);
        lhs.add(95);
        lhs.add(15);
        System.out.println(lhs);
    }

}
```

Output

```
[45, 34, 85, 95, 15]
```

### Iterator , List Iterator
+ An Iterator is an interface and we can traverse the element of a list in a forward direction whereas __ListIterator__ is an interface that extends the Iterator Interface and we can traverse the elements in both forward and backward directions.
+ An Iterator can be used in these collection types like List, Set, and Queue whereas ListIterator can be used in List collection only.
+ The important methods of Iterator Interface are `hasNext()` , `next()` and `remove()` whereas important methods of ListIterator Interface are `add()` , `hasNext()` , `hasPrevious()` and `remove()`.  


```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class demo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(24);
        al.add(45);
        al.add(254);
        al.add("Saurabh");
        al.add(214.456);
        System.out.println(al);

        System.out.println("Iterator Output:");
        Iterator itr = al.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("ListIterator Output:");
        ListIterator litr = al.listIterator(al.size());

        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }

}
```

Output

```
[24, 45, 254, Saurabh, 214.456]
Iterator Output:
24
45
254
Saurabh
214.456
ListIterator Output:
214.456
Saurabh
254
45
24
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
