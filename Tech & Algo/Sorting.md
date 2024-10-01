<h1 align="center" > Sorting </h1>
<p align="center" > Algo </p>


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

