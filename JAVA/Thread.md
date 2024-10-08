<h1 align="center"> Thread</h1>
<p align="center" > () </p>

### Thread
+ A thread is a very light-weighted process, or we can that the smallest part of the  process that allows a program to operate more efficiently by running multiple tasks simultaneously.

### How to create Threads
+ By Extending Thread Class
+ By Implementing Runnable Interface

### By extending Thread Class

```java
import java.util.Scanner;

class Calc extends Thread {
    public void run() {
        System.out.println("Calculation Task Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number");
        int num2 = sc.nextInt();

        int res = num1 + num2;
        System.out.println(res);

        System.out.println("Calculation Task Ended");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

class Message extends Thread {
    public void run() {
        System.out.println("Displaying important message task");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is important to master skill");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some Problem");
        }
        System.out.println("Displaying important message task ended");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

public class demo {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        Calc t1 = new Calc();

        Message t2 = new Message();
        t1.start();
        t2.start();
    }

}

```

### By implementing Runnable Interface

```java
import java.util.Scanner;

class Calc implements Runnable {
    public void run() {
        System.out.println("Calculation Task Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1 = sc.nextInt();

        System.out.println("Please enter second number");
        int num2 = sc.nextInt();

        int res = num1 + num2;
        System.out.println(res);

        System.out.println("Calculation Task Ended");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

class Message implements Runnable {
    public void run() {
        System.out.println("Displaying important message task");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is important to master skill");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some Problem");
        }
        System.out.println("Displaying important message task ended");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

public class demo {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        Calc c = new Calc();
        Message m = new Message();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(m);

        t1.start();
        t2.start();

    }

}

```

### Thread Scheduler
+ If multiple threads are waiting to execute, then which thread will execute `1st` is decided by Thread Scheduler which is part of JVM.
+ In the case of multithreading we can't predict the exact output, only possible output we can expect.

### run() method
+ The run() method is available in the thread class contructed using a separate Runnable object.
+ Otherwise, this method does nothing and returns. We can call the run() method multiple times.
+ The run() method can be called in two ways which are as follows:
    + Using the start() method.
    + Using the run() method itself.

### Difference between start() & run()
+ If we call start() and separates thread will be created which is responsible to execute the run() method.
+ If we call run() , no separate thread will be created, rather the method will be called just like a normal method by main method. 

### Importance of Thread class start() method
+ For every thread, required mandatory activities like registering the thread with Thread Scheduler will be taken care by Thread class.
+ start() method and the programmer is responsible for just doing the job of the Thread inside run() method.
+ start() acts like an assistance to programmers.
+ We can conclude that without executing the Thread class start() method there is no chance of starting a new Thread in java.
+ Due to this, start() is considered the `heart of multithreading`.

### Different states of Thread
+ A thread is a path of execution in a program that goes throgh the following states of a thread.
    1. New
    2. Runnable
    3. Running 
    4. Blocked(Non-runnable state)
    5. Dead


***




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
