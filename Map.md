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


