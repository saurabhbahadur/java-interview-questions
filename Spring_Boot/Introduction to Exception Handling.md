<h1 align="center" > Exception Handling </h1>
<p align="center" > (Error) </p>

# Exception Handling

+ It is a mechanism that allows us to handle runtime errors, ensuring the normal flow of the program.
+ It is done using `try`, `catch`, `finally`, `throw`, and `throws` keywords.

### Key Concepts

+ `Checked Exceptions:` Must be handled explicitly (e.g., IOException).
+ `Unchecked Exceptions:` Occur at runtime due to programming errors (e.g., NullPointerException).
+ `Error:` Irrecoverable issues (e.g., OutOfMemoryError).


```java
    public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}


```

### Exception Handling in Spring Boot

+ Spring Boot provides a robust way to handle exceptions using the `@ExceptionHandler`, `@ControllerAdvice`, and global exception handling.


#### Example of Exception Handling in Spring Boot

```java
    @RestController
    @RequestMapping("/api")
    public class DemoController {

    @GetMapping("/divide")
    public int divide(@RequestParam int a, @RequestParam int b) {
        return a / b; // Can throw ArithmeticException
    }
    
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handleArithmeticException(ArithmeticException e) {
        return new ResponseEntity<>("Cannot divide by zero!", HttpStatus.BAD_REQUEST);
    }
}


```

#### Using @ControllerAdvice for Global Exception Handling

```java
    @RestControllerAdvice
    public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(Exception e) {
        return new ResponseEntity<>("Something went wrong: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    }


```











***

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
