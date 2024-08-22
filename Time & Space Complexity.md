<h1 align="center" > Time and Space Complexity </h1>
<p align="center" > </p>


#### Memory 
        
+ `Primitive` - Inbuilt data types -> int, long, float, double, boolean  
+ `Derived` - Dervied from primitive data types -> arrays, string, objects 
        
1. Java divides the memory in 2 parts -> `Stack`, `Heap `
2. Stack stores all data for which size is known in compile time (`compile time allocation`)
3. Heap stores all data for which size is known in runtime (`runtime allocation`)
        
       
####  Time and space complexity

+ 10^8 lines of code / sec
+ Big-O notation - O(varing factor)
+ O(log n) < O(sqrt(n)) < `O(n)` < O(n^2) < O(n^3) < O(2^n)
        
```java
        
        for(int i = 1; i <= n; i++) { // O(n^3)
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {
                    
                }
            }
        }
        
        for(int i = 1; i <= Math.pow(2, n); i++) { // O(2^n)
            
        }
        
        for(int i = 1; i <= Math.sqrt(n); i++) { // O(sqrt(n))
            
        }
        
        for(int i = 1; i*i <= n; i++) { // O(sqrt(n))
            
        }
        
        for(int i = 1; i <= n; i = i * 2) { // O(log n)
            
        }
        
        for(int i = n; i >= 1; i = i / 2) { // O(log n)
            
        }
        
        for(int i = 1; i <= n; i++) { // O(n sqrt(n))
            for(int j = 1; j <= Math.sqrt(n); j++) {
                
            }
        }

```
    



***

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)

