<h1 align="center" > Basics </h1>
<p align="center" > </p>

#### Comments
<p>These are lines of code that does not run (ctrl + / )</p>

+ Single line comment
    ```java
        // Single line comment 
    ```
+ Multiple Line Comment
    ```java
        /**
	     * Multi line comment 
	     * 
	     * line 2 of comment 
	     * 
	     */
    ```

#### Points

+ Capital and small alphabets have different meaning in the language

+ All instruction/statement end with a semi-colon ( ; - Terminator )
	    

#### Three ways to print / Output

```java
    System.out.println("Hello Arjun!!");
    System.out.print("hello");
    System.out.printf("%.5f", 123.45242);
```

| Data    | Data Types     |
| ------------- | ------------- |
| Numbers | int |
| Large Numbers | long |
| Decimal Numbers | float |
| Large Decimal Numbers | double|
| Character | char |
| Text | String |
| True / False | boolean |

        
## Variable 
<p> Box that can store one value of a single data type </p>

#### Rules for naming variables

+ It can contain alphabets, digits and special character _
+ It can begin with alphabet or _
+ It cannot contain spaces. camelCase, SentenceCase, under_score
+ It cannot be a keyword (48 words)
+ We cannot access a variable before creation 
+ There cannot be 2 variables with the same name in the same scope 


#### Scope
<p>Area in which the variable is accessible </p>

+ A variable is only accessible in its scope
+ A variable is accessible in all the child scopes

```java
        
        int a = 20;
        {
            System.out.println(a);
            {
                System.out.println(a);
            }
        }
        
        int a = 20;
        {
            int a = 10; // Error: Variable with the name a already exists 
            System.out.println(a);
        }
        
        {
            int a = 10;
            System.out.println(a);
        }
        
        {
            int a = 20;
            System.out.println(a);
        }

```

        
### Arthmatic operators ( +, -, *, /, %  )

```java
        int a = 17;
        int b = 4;
        
        int s = a + b;
        int d = a - b;
        int m = a * b;
        int q = a / b;
        int r = a % b;
        
        System.out.println(s);
        System.out.println(d);
        System.out.println(m);
        System.out.println(q);
        System.out.println(r);
        
        double d1 = a;
        double d2 = b;
        
        double d = d1 / d2;
        
        System.out.println(d);

```

        
####  byte < short < int < long 
        
####  Default types 
+  numbers - `int`
+ decimal number - `double`
        
```java

        System.out.println(12344);
        System.out.println(13/4);
        
        int a = 12234273874848;
        
        long l = 12234273874848L;
        System.out.println(l);
        
        double d = 14.456323637;
        
        float f = 14.456323F;
        
        System.out.println(f);
        
        char c = ' ';
        
        System.out.print(c);
        System.out.println("hello");
        
        boolean b = false;
        
        System.out.println(b);
```
        
### Units

| Unit   |     |
| ------------- | ------------- |
| 1/0 | 1 bit |
| 4 bits | 1 nibble |
| 8 bits | 1 byte |
| 1024 bytes | 1 KB|
| 1024 KB | 1 MB |
| 1024 MB | 1 GB |
| 1024 GB | 1 TB |

<p>1 KB - 1 kilobytes - 1024 bytes - 1024 * 8 bits </p>
<p>1 Kb - 1 kilobits - 1024 bits</p>
        
### Size of data type

| Data Type   |  Size    |
| ------------- | ------------- |
| byte | 1 byte |
| short | 2 byte |
| int | 4 bytes |
| long | 8 bytes|
| float | 4 bytes |
| double | 8 bytes |
| char | 2 bytes |
| String | 2 * no. of chars |
| boolean | 1 bit |     
        
### Type conversion
<p>conversion of data from one type to another</p>

+ #### Implicit
<p>Conversion that happens automatically</p>
    
+ Storing a number to decimal number 
+ Storing a small box value into a large box

+ #### Explicit
<p>Conversion done forcefully</p>

+ Storing a decimal number into number 
+ Storing a large box value into small box

<p>left -> right -> Implicit</p>

#### int -> long -> float -> double 

<p>right->left -> Explicit</p>
            
```java

    
        long l = 1234747647448l;
        
        float f = l;
        
        System.out.println(f);
        
        double d = 10.3673;
        
        int a = (int)d;
        
        long l = 123436L;
        
        int a = (int) l;
        
        System.out.println(a);
        
        float f = 123.377f;
        
        double d = f;
        
        double d = 13.37484;
        
        float f = (float)d;
        
        System.out.println(f);
        
        int a = 13;
        int b = 4;
        
        double d = (double)a / b;
        
        System.out.println(d);
        
        int a = 10;
        int b = 0;
        
        int c = a / b;
        
        System.out.println(c);
        
        double d = 192.4894;
        
        int a = (int) d;
        
        System.out.println(a);

```
        
#### Ranges of data types

+ `int` - 4 bytes -  -2^31 to 2^31-1
+ `long` - 8 bytes - -2^63 to 2^63-1
         
#### User input

```java
        Scanner sc = new Scanner(System.in);
        nextInt(), nextLong(), nextFloat(), nextDouble(), nextBoolean()
        next() - Reads the first word of input 
        nextLine() - Reads the entire line of input

```

#### char input

```java

        char c = sc.next().charAt(0); 
        
        System.out.println(c);

```
       
#### Math functions

```java

        System.out.println(Math.max(10, 23));
        System.out.println(Math.min(10, 23));
        System.out.println(Math.pow(3, 4)); // 3^4
        System.out.println(Math.sqrt(25));
        System.out.println(Math.round(12.55));
        System.out.println(Math.floor(12.99));
        System.out.println(Math.ceil(12.23));
     
        System.out.println(Math.ceil(-2.34));   
        
        System.out.println(Math.abs(-34));
        
        System.out.println((int)(Math.random() * 10000 + 1000));

```
        
#### Precedence of operators - [ (*, /, %) (+, -) ]     
        
```java

    
        int s = 10 * 3 + 4; // 34

        int s = 10 / 3 * 2 ; // 6  
        
        int s = 10 * 3 / 2 ; // 15 
        
        int s = 10 * (3 / 2);
        
        System.out.println(s);

```



***

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)


