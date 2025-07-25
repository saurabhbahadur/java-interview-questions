<h1 align="center" > Hashing </h1>
<p align="center" > </p>


### Hashing

## 🧠 What is HashMap?
- A part of Java's Collection Framework.
- Implements the `Map` interface.
- Stores data as **key-value** pairs.
- Allows **one null key** and **multiple null values**.
- Unordered — does **not maintain insertion order**.

---

## 🛠️ Internal Working of HashMap
### Step-by-step:
1. When you call `put(key, value)`:
   - Java calls `hashCode()` of the key.
   - Calculates bucket index using:
     ```java
     index = (n - 1) & hash(key);
     ```
   - If no collision → stores the entry.
   - If collision → resolves using **chaining** (linked list or tree).

2. When calling `get(key)`:
   - Uses `hashCode()` to find the bucket.
   - Traverses the list/tree to find the matching key using `equals()`.

---

## 📊 HashMap Data Structure (Java 8+)
- **Array of Node<K, V>**
- Each bucket:
  - Empty ➝ null
  - Single entry ➝ Node
  - Collisions ➝ Linked list or Tree (TreeMap-like)

### Treeify Conditions:
- If number of entries in a bucket > **8**
- And overall map size > **64**
- Then linked list → Red-Black Tree (for faster lookup)

---

## 📦 Constructors of HashMap
```java
HashMap<K, V> map = new HashMap<>();
HashMap<K, V> map = new HashMap<>(initialCapacity);
HashMap<K, V> map = new HashMap<>(initialCapacity, loadFactor);
HashMap<K, V> map = new HashMap<>(anotherMap);
```













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
