<h1 align="center" > Sorting </h1>
<p align="center" > </p>


#### Inbuilt sorting

```java

        int a[] = {2, 4, 1, 9, 2, 5, 4};
        int n = a.length;
        
        Arrays.sort(a); // O(nlog n)
        
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }


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
        

### ArayList

```java
      ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(8);
        a.add(9);
        a.add(4);
        
        Collections.sort(a);
        
        System.out.println(a);

```


# Sorting
 1. Selection Sort
 2. Bubble Sort
 3. Insertion Sort
 4. Counting Sort
 5. Merge Sort
 6. Quick Sort
 7. Heap Sort


## 1. Selection Sort

#### Complexity
+ Best case - `O(n^2)`
+ Worst case - `O(n^2)`
+ Average ccase- `O(n^2)`

`Use case -`

```java
       int a[] = {2, 4, 1, 9, 2, 5, 4};
        int n = a.length;
        
        for(int i = 0; i < n; i++) {
            int mni = i;
            for(int j = i; j < n; j++) {
                if(a[mni] > a[j]) {
                    mni = j;
                }
            }
            
            int t = a[i];
            a[i] = a[mni];
            a[mni] = t;
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

```


## 2. Bubble Sort


#### Complexity
+ Best case - `O(n)`
+ Worst case - `O(n^2)`
+ Average ccase- `O(n^2)`

`Use case -` Partial Sorting

```java
    
        int a[] = {2, 4, 1, 9, 2, 5, 4};
        int n = a.length;
        
        for(int i = 0; i < n; i++) {
            boolean noSwap = true;
            for(int j = 0; j < n-1-i; j++) {
                if(a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    noSwap = false;
                }
            }
            
            if(noSwap) {
                break;
            }
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

```


## 3. Insertion Sort


#### Complexity
+ Best case - `O()`
+ Worst case - `O()`
+ Average ccase- `O()`

`Use case -`

```java
        int a[] = {2, 4, 1, 9, 2, 5, 4};
        int n = a.length;
        
        for(int i = 1; i < n; i++) {
            int val = a[i];
            int j = i-1;
            
            while(j >= 0 && a[j] > val) {
                a[j+1] = a[j];
                j--;
            }
            
            a[j+1] = val;
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
```

# We will update soon.....

## 4. Counting Sort


#### Complexity
+ Best case - `O(n^2)`
+ Worst case - `O(n^2)`
+ Average ccase- `O(n^2)`

`Use case -`

```java
    int a[] = {2, 4, 1, 9, 2, 5, 4};
    int n = a.length;

```


## 5. Merge Sort


#### Complexity
+ Best case - `O(n^2)`
+ Worst case - `O(n^2)`
+ Average ccase- `O(n^2)`

`Use case -`

```java
    int a[] = {2, 4, 1, 9, 2, 5, 4};
    int n = a.length;

```


## 6. Quick Sort


#### Complexity
+ Best case - `O(n^2)`
+ Worst case - `O(n^2)`
+ Average ccase- `O(n^2)`

`Use case -`

```java
    int a[] = {2, 4, 1, 9, 2, 5, 4};
    int n = a.length;

```


## 7. Heap Sort


#### Complexity
+ Best case - `O(n^2)`
+ Worst case - `O(n^2)`
+ Average ccase- `O(n^2)`

`Use case -`

```java
    int a[] = {2, 4, 1, 9, 2, 5, 4};
    int n = a.length;

```


    

***

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)

