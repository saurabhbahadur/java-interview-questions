<h1 align="center" > Array </h1>
<p align="center" > List of values of a single data type stored in a continous memory location</p>

+ Arrays are immutable in size 
+ Default value is 0 
+ Access an index not present in array - Index out of  bounds


 + Continous memory 
    1. Advantage - Access of any value in array is a constant time operation 
    2. Disadvanage - Size of array is fixed 


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





***

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)

