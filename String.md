<h1 align="center" > String </h1>
<p align="center" > </p>


+ String are the types of objects that can store the character of values.

+ Types of String
	+ Immutable String (non-changeable)
		+ String
	+ Mutable String (changeable)
		+ StringBuilder , StringBuffer



+ String are stored in String constant pool (Part of heap)
+ Strings are immutable in size and value 
+ Strings are passed to function by value 
+ Never use `==` for String comparison
        

### String -> Object -> Heap

+ If we use `new` keyword then string will create in  `String Constant Pool`.
+ In `SCP` duplicate is not allowed.
+ We can duplicate the value in Heap area.



#### Escape sequence

+ `\t` - tab space 
+ `\n` - new line 
+ `\\` - backward slash 
+ `\"` - Double quote 
+ `\'` - Single quote
		
```java
    	
		String s = "Hello world";
		int n = s.length();
		
		System.out.println(s);
		System.out.println(s.charAt(0)); 
	

```

+  Find the index of a given character in string (Return first index incase of multiple occurence)

```java 

		char c = 'w';
		int ind = -1;
		
		for(int i = 0; i < n; i++) { // O(n)
		    if(s.charAt(i) == c) {
		        ind = i;
		        break;
		    }
		}
		
		System.out.println(ind);
		
		System.out.println(s.indexOf(c)); // O(n)
		
		String s = "Hello world";
		int n = s.length();
		
		char c = 'l';
		int ind = -1;
		
		for(int i = n-1; i >= 0; i--) { // O(n)
		    if(s.charAt(i) == c) {
		        ind = i;
		        break;
		    }
		}
		
		System.out.println(ind);
		System.out.println(s.lastIndexOf(c));

```

+ Trim method

```java
        String s = "    hello    a world   ";
        
        System.out.println(s.trim());
        
        int i = 0;
        int n = s.length() - 1;
        
        for(; i < n; i++) {
            if(s.charAt(i) != ' ') {
                break;
            }
        }
        
        for(; n >= 0; n--) {
            if(s.charAt(n) != ' ') {
                break;
            }
        }
        
        String s2 = "";
        for(int j = i; j <= n; j++) {
            s2 = s2 + s.charAt(j);
        }
        
        System.out.println(s2);
```
+ LowerCase & UpperCase

```java

		String s = "HeLLo wORld";
		int n = s.length();
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String s2 = "";
		
		for(int i = 0; i < n; i++) { // O(n^2)
		    char c = s.charAt(i);
		    
		    if(c >= 'A' && c <= 'Z') {
		        c = (char)(c + 32);
		    }
		    
		    s2 = s2 + c;
		}
		
		System.out.println(s2);
```

+ Equals

```java

		String s1 = "hello";
		String s2 = "Hello";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

        String s = "abcabcabb";
        System.out.println(s.contains("de"));
```

+ #### String in Heap memory

```java
		String s1 = new String("Hello");
		String s2 = new String("Hello");

		System.out.println(s1.equals(s2));


```

#### Hashing in String

+ Count the frequency of every char in string

```java
	int ct[] = new int[256];

    String s = "abcbcda";
    int n = s.length();

    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      int asci = c;

      ct[asci]++;
    }

    for (int i = 0; i < 256; i++) {
      if (ct[i] != 0) {
        System.out.println((char) i + " " + ct[i]);
      }
    }



```

### Comparison

+ `==` operator
	+  It compares the `references` of the object.
+ `equals()`
	+ It compares the `content` of the objects.




#### String concatenation

```java

	String s = "1" + 12; // "112"
	String s = 12 + '1'; // error: int cannot converted into char
	String s = 12 + '1' + ""; // "61"
	String s = 12 + "" + 34;  // "1234"
	String s = 12 + 34 + ""; // "46"
	String s = "a" + 12 + 3; // "a123"

	System.out.println(s);

```

<h1 align="center" > StringBuilder </h1>

```java
	StringBuilder s = new StringBuilder("");

	s.append("abc");
	s.indexOf("b");

	System.out.println(s.indexOf("b"));
	
	System.out.println(s.capacity());
    System.out.println(s);


```

+ We can also set capacity of String from passing value in parameters

```java
	StringBuilder s = new StringBuilder(150);
	System.out.println(s.capacity());

```




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
                                                
