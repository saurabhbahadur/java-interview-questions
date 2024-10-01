<h1 align="center" > Recursion </h1>
<p align="center" > When a function call itself (Tech)</p>

# When a function call itself

+ When we are solving any problem by
    + Loops known as `Iterative method`
    + Recursion known as `Recursive method`

```java

    
public class demo {

  public static long sum(int n) {

    if (n == 1) {
      return 1;
    }

    return n + sum(n - 1);

  }

  public static void main(String[] args) {
    System.out.println(sum(5));

  }
}

```

+ Basic Steps
    + Function Statement 
    + Base condition
    + Recursive Part

#### Pre and Post area of recursion

```java
    
public class demo {

  public static void solve(int n) {

    if (n == 0) {
      return;
    }

    System.out.println(n); // Pre area of Recursion
    solve(n - 1);
    System.out.println(n); // Post area of Recurison

  }

  public static void main(String[] args) {
    solve(5);

  }
}

```


#### Recursive Tree

+ It store in stack

```java
    solve(1) // 5
    solve(2) // 4
    solve(3) // 3 
    solve(4) // 2
    solve(5) // 1
    main() // 0

```

#### Some examples

+ Sum of natural number

```java
    static long NumberSum(long n) {
        //Write your code here
        if(n==1){
            return 1;
        }
        return n + NumberSum(n-1);
    
    }

    // call in main
    System.out.println(NumberSum(N));
```

+ Find no of digit

```java
    static int numOfDigi(int n) {
        //Write code her
        if(n==0){
            return 0;
        }

        return 1 + numOfDigi(n/10);

    }
```

+ Keypad Combination

```java
    
static String table[] = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

static void solve(String s, String ans) {
    if (s.length() == 0) {
        System.out.println(ans);
        return;
    }
    String temp = table[s.charAt(0) - '0'];
    for (int i = 0; i < temp.length(); i++) {
        solve(s.substring(1), ans + temp.charAt(i));
    }
}

static void printKPC(String ques) {
    // Write your code here
    solve(ques, "");
}

```

+ Print all subsequences of a String

```java
  
static void printSubsequence(String s) {
    // Write your code here
    solve(s, 0, "");
}

static void solve(String s, int i, String s1) {
    if (i == s.length()) {
        System.out.print(s1 + " ");
        return;
    }

    solve(s, i + 1, s1 + s.charAt(i));
    solve(s, i + 1, s1);
}

```

+ Print Stair Path

```java
  
static void printStairPaths(int n, String pathSoFar) {
    // Write your code here
    if (n == 0) {
        System.out.println(pathSoFar);
        return;
    }
    if (n >= 1) {
        printStairPaths(n - 1, pathSoFar + "1");
    }
    if (n >= 2) {
        printStairPaths(n - 2, pathSoFar + "2");
    }
    if (n >= 3) {
        printStairPaths(n - 3, pathSoFar + "3");
    }

}

// in main
  main(){
    printStairPaths(n,"");
  }
```
+ one more way

```java
  
static void helper(int i, int n, String path) {
    if (i == n) {
        System.out.println(path);
        return;
    }
    if (i > n)
        return;
    helper(i + 1, n, path + "1");
    helper(i + 2, n, path + "2");
    helper(i + 3, n, path + "3");
}

static void printStairPaths(int n, String pathSoFar) {
    // Write your code here
    helper(0, n, "");

}

```

+ Permutation String 

```java
      public void solve(String str, String ans) {
    if (str.length() == 0) {
        System.out.println(ans);
        return;
    }

    // take each option left
    for (int i = 0; i < str.length(); i++) {
        if (i == str.length() - 1 || (str.charAt(i) != str.charAt(i + 1))) {
            String reducedStr = str.substring(0, i) + str.substring(i + 1);
            solve(reducedStr, ans + str.charAt(i));
        }
    }
}

public void printPermutations(String str) {
    // write your code here
    char arr[] = str.toCharArray();
    Arrays.sort(arr);
    str = String.valueOf(arr);

    solve(str, "");
}
```

<h1 align="center" > Backtracking </h1>

+ Finding a solution incrementally by trying different option and undoing them if they lead to dead end.
+ When a deadend is reached, the algo backtracks to previous decision point and esplores a different paths unstil a solution is found or all posibilities have been checked.

```java
        public static boolean check(int row, int col, int chess[][], int n) {

        for (int i = 0; i < row; i++) { // coloumn
            if (chess[i][col] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) { // left diagonal
            if (chess[i][j] == 1) {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) { // right diagonal
            if (chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static int solve(int row, int chess[][], int n) {
        if (row == n) {
            return 1;
        }

        int ans = 0;
        for (int col = 0; col < n; col++) {
            if (check(row, col, chess, n) == true) {
                chess[row][col] = 1;
                ans = ans + solve(row + 1, chess, n);
                chess[row][col] = 0;
            }
        }
        return ans;
    }

    public static int totalNQueens(int n) {
        int chess[][] = new int[n][n];
        int ans = solve(0, chess, n);
        return ans;
    }

```



---




+ ### [Basic](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Basics.md)
+ ### [Introduction to Java](https://github.com/saurabhbahadur/java-interview-questions/blob/main/JAVA/Introduction%20to%20Java.md)
+ ### [Array](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Data%20Strucures/Array.md)
+ ### [Time and Space Complexity](https://github.com/saurabhbahadur/java-interview-questions/blob/main/JAVA/Time%20%26%20Space%20Complexity.md)
+ ### [Sorting](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Tech%20%26%20Algo/Sorting.md)
+ ### [String](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Data%20Strucures/String.md)
+ ### [Recursion](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Tech%20%26%20Algo/Recursion.md)
+ ### [OOPs](https://github.com/saurabhbahadur/java-interview-questions/tree/main/OOPs)
+ ### [Linked List](https://github.com/saurabhbahadur/java-interview-questions/blob/main/Data%20Strucures/LinkedList.md)

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
