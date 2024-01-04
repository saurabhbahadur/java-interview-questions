<h1 align="center"> Enums</h1>
<p align="center" > () </p>

### Enums
+ Enum concept introduced in `1.5v`.
+ When compared with old languages enum java's enum is more powerful.
+ By using enum we can define our own datatypes which are also come `enumerated` datatypes.


```java

enum Week {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class demo {
    public static void main(String[] args) {

        Week w = Week.FRI;
        System.out.println(w);

        Week wr[] = Week.values();
        for (Week we : wr) {
            System.out.println(we + ":" + we.ordinal());
        }

    }
}

```

### Annotation

+ An Annotation is a type of metadata that can be added to a class, method, field , parameters or other program element to provide additional information about the element.

### Custom Annotaion And Reteriving value using `Refelection API`

```java
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer {
    String country() default "India";

    int age() default 26;
}

@CricketPlayer
class Virat {
    @CricketPlayer
    private int innings;

    @CricketPlayer
    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}

public class demo {
    public static void main(String[] args) {
        Virat v = new Virat();
        v.setInnings(3000);

        System.out.println(v.getInnings());
    }

}

``` 







***

# Feel Free to connect
+ ### [LinkedIn](https://www.linkedin.com/in/saurabhbahadur) 
+ ### [Mail](mailto:singhsaurabhbahadur@gmail.com)
+ ### [Instagram](https://www.instagram.com/saurabhbahadur_)
+ ### [Discord](https://discord.gg/aQR27Bg7de)


