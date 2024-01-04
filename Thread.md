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

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)


