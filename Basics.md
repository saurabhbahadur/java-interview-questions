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
	    

#### Four ways to print / Output

```java
    System.out.println("Hello Arjun!!");
    System.out.print("hello");
    System.out.printf("%.5f", 123.45242);
    System.out.println(String.format("%.4f", 12.34673637));
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


#### Conditionals

<p>If</p>

```java
     
        if(condition) {
            // statement/s;
        }

```

#### Relational Operator

<p> <, >, <=, >=, == (equals to), != (not equals to) </p>
       

#### Logical Operator

<p> &&, ||, !  </p>

<p>Precedence of logical operators - ! && || </p>
        
```java
     // Check whether a number is in a range of 1 to 100 
        
        int a = sc.nextInt();
        
        if(1 <= a && a <= 100) {
            System.out.println("In range");
        }
        else {
            System.out.println("Not in range");
        }
        
```
        
       
        
        
#### ASCII - American standard code for information interchange 

+ a-z -> 97-122 
+ A-Z -> 65-90
+ 0-9 -> 48-57

```java
         char c = sc.next().charAt(0);
        
        if(c >= 'a' && c <= 'z') {
            char c2 = (char)(c - 32);
            
            System.out.println(c2);
        }
```
      
##### Leap Year

+ divisible by 4 and not by 100 -> 2012, 2016, 2020, 1996 
+ divisible by  100 and by 400 -> 1600, 2000, 2400


#### Any if block can have at max one else

```java
        int a = 5;
        
        if(a > 10) {
            System.out.println("Hello");
        }
        else {
            System.out.println("Hello 2");
        }
        else { // error: else without if 
            System.out.println("Hello 3");
        }
```

#### Without brackets we can have at max 1 statement as a part of if 

```java
        if(a > 3) 
            System.out.println("Hello");
            System.out.println("Hello 3");
        else // error: else is without 
            System.out.println("Hello 2");
```
        
        
    
        
#### `Dangling else` - Else always belong to the immediate if 
        
```java
            int a = 5;
        
        if(a < 10) 
            if(a > 20)
                System.out.println("Hello");
            else 
                System.out.println("Hello 2");
        
        int a = 5;
        
        if(a > 10) 
            if(a > 20)
                System.out.println("Hello");
            else 
                System.out.println("Hello 2");
        else 
            System.out.println("Hello 3");
        
        int a = 5;
        
        if(a > 10) 
            if(a > 20)
                System.out.println("Hello");
            else if(a < 15)
                System.out.println("Hello 2");
            else 
                System.out.println("Hello 3");


```


<h1 align="center" > Loops </h1>
<p> Runs a code for some fixed number of times/iterations </p>

+ I -> C -> B -> U -> C -> B -> U -> C -> B -> U -> C -> B -> U -> C 

```java

    //  Product of all numbers from 1 to 10 
        int p = 1;
        
        for(int i = 1; i <= 10; i = i + 1) {
            p = p * i;
        }
        
        System.out.println(p);

```
        
+ Factorial of a number  
        
```java
        int n = sc.nextInt();
        
        int f = 1; 
        
        for(int i = 1; i <= n; i = i + 1) {
            f = f * i;
        }
        
        System.out.println(f);


```
        
####    Flow control statement - break/continue 

```java
     
        for(int i = 1; i <= 10; i = i + 1) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }
        
      
        
        for(int i = 1; i <= 10; i = i + 1) {
            if(i == 5) {
                continue;
            }
            System.out.println(i);
        }

```
        
+ While loop
    + C -> B -> C -> B -> C 
      
#### Digit manipulation 

```java
         // Print all digits of a number 
        
        int n = 3284;
        int p = n;
        
        while(n > 0) {
            int d = n % 10;
            System.out.println(d);
            n = n / 10;
        }
        
        System.out.println(p);
        

```

+  Find the reverse of the number

```java

     int n = 23178;
        
        while(n > 0) {
            int d = n % 10;
            System.out.print(d);
            n = n / 10;
        }

```
      
+ Count trailing zeros in a number 
        
```java
         int a = 102300;
        int ct = 0;
        
        while(a > 0) {
            int d = a % 10;
            if(d == 0) {
                ct = ct + 1;
            }
            else {
                break;
            }
            a = a / 10;
        }
        
        System.out.println(ct);

```
        
+ Factors of number

```java
      int n = 24;
        
        for(int i = 1; i <= n; i = i + 1) {
            if(n % i == 0) {
                System.out.println(i);
            }
        }

```
#### do while

+ B -> C -> B -> C -> B -> C

+ `Entry controlled loops -` These are loops where condition check is happening prior to the body. Ex: `for`, `while` 
+ `Exit controlled loops -` These are loops where condition check happens after the body. Ex: `do while` 

#### Nested Loops      

+ 
+ 
+ 

#### Range question

+ Find the sum of digits of all the numbers in range of 1 to 50

```java
     for(int i = 1; i <= 50; i++) {
            int n = i;
            int sum = 0;
            
            while(n != 0) {
                int d = n % 10;
                sum = sum + d;
                n = n / 10;
            }
            
            System.out.println(sum);
        }

```

+ Find all the prime numbers in the range of 1 to 100 

```java
      
        for(int j = 1; j <= 100; j = j + 1) {
            int n = j;
            int ct = 0;
            
            for(int i = 1; i <= n; i = i + 1) {
                if(n % i == 0) {
                    ct++;
                }
            }
            
            if(ct == 2) {
                System.out.println(n);
            }
        }
        

```
        
#### Pattern printing

+ Outer loop should run for the number of  rows in pattern 
+ Inner loop should run for number of values in each row 

```java
    for(int i = 1; i <= 5; i = i + 1) {
            for(int j = 1; j <= i; j = j + 1) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        // 1
        // 12 
        // 123 
        // 1234 
        // 12345 


```



***

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)


