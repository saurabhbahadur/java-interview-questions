<h1 align="center" > Map </h1>
<p align="center" > (collection of key-value pair) </p>

### Map
+ A Map is an Interface that represents a collection of key-value pairs, where each key and value pair is known as an entry. A map contains unique keys.
+ A Map is useful if you have to search, update or delete elements on the basis of a key.

### Map Hierarchy
+ Map
  + HashTable
  + HashMap
    + LinkedHashMap
  + SortedMap
    + NavigableMap
    + TreeMap

### HashMap
+ Java HashMap allows null key and null values.
+ HashMap is not an ordered collection. You can iterate over HashMap entries through keys set but they are not guranteed to be in the order of their addition to the HashMap.
+ HashMap almost similar to HashTable except that it's non-synchronized and allows null key and values.

```java
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class demo {
    public static void main(String[] args) {
        System.out.println("HashMap");
        HashMap hm = new HashMap<>();
        hm.put(01, "Apple");
        hm.put(02, "Mango");
        hm.put(03, "WaterMelon");
        hm.put(04, "Banana");

        System.out.println(hm);

        System.out.println("LinkedHashMap");
        LinkedHashMap lhm = new LinkedHashMap<>();
        lhm.put(01, "Apple");
        lhm.put(02, "Mango");
        lhm.put(03, "WaterMelon");
        lhm.put(04, "Banana");

        System.out.println(lhm);

        System.out.println("TreeMap");
        TreeMap tm = new TreeMap<>();
        tm.put(01, "Apple");
        tm.put(02, "Mango");
        tm.put(03, "WaterMelon");
        tm.put(04, "Banana");

        System.out.println(tm);
    }

}
```

Output

```
HashMap
{1=Apple, 2=Mango, 3=WaterMelon, 4=Banana}
LinkedHashMap
{1=Apple, 2=Mango, 3=WaterMelon, 4=Banana}
TreeMap
{1=Apple, 2=Mango, 3=WaterMelon, 4=Banana}
```

###  Inbuilt methods under Map Hierarchy
+ clear()
+ containsKey()
+ containsValue()
+ entrySet()
+ equals()
+ get()
+ hashCode()
+ isEmpty()
+ keySet()
+ put( obj , obj  )


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
