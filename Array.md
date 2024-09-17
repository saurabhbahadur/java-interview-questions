<h1 align="center" > Array </h1>
<p align="center" > List of values of a single data type stored in a continous memory location</p>

+ Arrays are immutable in size 
+ Default value is 0 
+ Access an index not present in array - Index out of  bounds 

 + Continous memory 
    1. Advantage - Access of any value in array is a constant time operation 
    2. Disadvanage - Size of array is fixed 


###  User input in Array

```java
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int a[] = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
```

### Print Array

```java
     for (int i = 0; i < n; i++) {
      System.out.println(a[i]);
    }
```


+ Sum of all values in array


```java
     int sum = 0;
        
        for(int i = 0; i < n; i++) {
            sum = sum + a[i];
        }

        System.out.println(sum);
```

+ Print all even number in array
+ Print all prime numbers in array 
        
+ Largest element and its index

```java

    
        int a[] = {8, 4, 9, 3, 5, 4, 1, 9, 7};
        int n = a.length;
        
        int mx = Integer.MIN_VALUE;
        int mxi = -1;
        
        for(int i = 0; i < n; i++) {
            if(a[i] > mx) {
                mx = a[i];
                mxi = i;
            }
        }
        
        System.out.println(mx + " " + mxi);
        

```

#### Second Largest number

+ Can be equal to largest

```java
           
        int smx = Integer.MIN_VALUE;
        int smxi = -1;
        
        for(int i = 0; i < n; i++) {
            if(i == mxi) {
                continue;
            }
            if(a[i] > smx) {
                smx = a[i];
                smxi = i;
            }
        }
        
        System.out.println(smx + " " + smxi);
 

```
        
+ Cannot be equal to largest 

```java
    
        int smx = Integer.MIN_VALUE;
        int smxi = -1;
        
        for(int i = 0; i < n; i++) {
            if(a[i] == mx) {
                continue;
            }
            if(a[i] > smx) {
                smx = a[i];
                smxi = i;
            }
        }
        
        System.out.println(smx + " " + smxi);
   

```

#### Subarray 

<p>   A small continous part of array in the same order as in array </p>
        
+ Print all subarrays of the array 

```java
       int a[] = {8, 4, 9, 3, 2};
        int n = a.length;

        for(int st = 0; st < n; st++) {
            
            for(int ed = st; ed < n; ed++) {
            
                for(int i = st; i <= ed; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
        }
        

```
     
+ Print the sum of each subarray 
        
```java
    for(int st = 0; st < n; st++) {
            
            for(int ed = st; ed < n; ed++) {
                int sum = 0;
                for(int i = st; i <= ed; i++) {
                    sum = sum + a[i];
                }
                System.out.println(st + " " + ed + " " + sum);
            }
        }

        // ----------------------------------------------
        
        for(int st = 0; st < n; st++) { // O(n^2)
            int sum = 0;
            for(int ed = st; ed < n; ed++) {
                sum = sum + a[ed];
                System.out.println(st + " " + ed + " " + sum);
            }
        }
        

```

        
+ Find the subrray with the largest sum 
        
```java
    
        int a[] = {8, -4, -9, 3, 2};
        int n = a.length;
        
        int mx = Integer.MIN_VALUE;
        
        for(int st = 0; st < n; st++) {
            
            for(int ed = st; ed < n; ed++) {
                int sum = 0;
                for(int i = st; i <= ed; i++) {
                    sum = sum + a[i];
                }
                
                if(sum > mx) {
                    mx = sum;
                }
            }
        }
        
        System.out.println(mx);

```
+ Building 

```java        
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
          if(a[i] > mx) {
            mx = a[i];
          }
        }
    
        int p = mx;
        for(int i = 1; i <= mx; i++) {
          for(int j = 0; j < n; j++) {
            if(a[j] >= p) {
              System.out.print("*\t");
            }
            else {
              System.out.print("\t");
            }
          }
          System.out.println();
          p--;
        }


```

<!-- -------------------------------------------------------------------------------------------- -->

<h1 align="center" > 2D Array </h1>

+ int a[][] = new int[row][col];
+ int n = a.length;
+ int m = a[0].length;

#### User input in 2D array

```java
        int a[][] = new int[4][3];
        
     for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 3; c++) {
                a[r][c] = sc.nextInt();
            }
        }

```

#### Print 2D array

```java
       for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 3; c++) {
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }


```
       
+ Pair in array having sum k 

```java
    for(int r = 0; r < n; r++) {
            int sum = 0;
            for(int c = 0; c < m; c++) {
                sum += a[r][c];
            }
            System.out.println(r + " " + sum);
        }
        
        for(int c = 0; c < m; c++) {
            int sum = 0;
            for(int r = 0; r < n; r++) {
                sum += a[r][c];
            }
            System.out.println(c + " " + sum);
        }
        
        // Max in each row 
        // Max in each col 
        // Max in entire matrix 
        
        

```


<h1 align="center" > ArrayList </h1>
        
        
+  int -> Integer, long -> Long, String, double -> Double, float -> Float
       

`add` `size` `set`

```java

    ArrayList<Integer> a = new ArrayList<Integer>();
        
        a.add(10);
        
        System.out.println(a);
        
        a.add(20);
        a.add(30);
        
        System.out.println(a);
        
        int n = a.size();
        
        System.out.println(n);
        
        a.set(2, 50); // a[2] = 50;
        
        System.out.println(a);

```

+ ` get `

```java

    
        System.out.println(a.get(1)); // a[1]
        
        for(int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        
```
+ `remove`

```java
        a.remove(1); // O(n)
        
        System.out.println(a);

```
        
       
<h1 align="center" > 2D ArrayList </h1>  

```java
     ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        
        ArrayList<Integer> row = new ArrayList<Integer>();
        row.add(10);
        row.add(20);
        
        a.add(row);
        
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        row2.add(10);
        row2.add(20);
        
        a.add(row2);
        
        System.out.println(a);

```
```java
       System.out.println(a.get(0));
        
        System.out.println(a.get(0).get(1));
        
        for(int i = 0; i < a.size(); i++) {
            for(int j = 0; j < a.get(i).size(); j++) {
                System.out.print(a.get(i).get(j)); // a[i][j]
            }
            System.out.println();
        }

```

+ `set`

```java
      ArrayList<Integer> row3 = new ArrayList<Integer>();
        row3.add(30);
        row3.add(50);
        
        a.set(1, row3);
        
        System.out.println(a);

```
        
+ Sorting    
        
```java
    int a[] = {2, 4, 1, 9, 2, 5, 4};
        int n = a.length;
        
        Arrays.sort(a);

```
        
```java

      int l = 0;
        int h = n-1;
        
        while(l < h) {
            int t = a[l];
            a[l] = a[h];
            a[h] = t;
            
            l++;
            h--;
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

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
