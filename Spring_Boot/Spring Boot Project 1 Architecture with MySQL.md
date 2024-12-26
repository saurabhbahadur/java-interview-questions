<h1 align="center" > Spring Boot Architecture  </h1>
<p align="center" > Project 1 with MySQL</p>


+ For creating Spring Boot project we have to create project from [Spring Initializer](https://start.spring.io/index.html) where you have to fill details according to your needs.
+ I am making this project form maven so i will choose maven. After that you have to add dependencies-
    + Spring Web
    + Spring Data JPA
    + MySQL Driver
    + Lombok


***

# Architecture

<p> The flow/folder of architecture we have to follow </p>
    
+ ### Model
+ ### RequestDto
+ ### Converters
+ ### Repository
+ ### Service
+ ### Controller

+ We have to make these all package inside the main package folder `src/main/java/com/mighty/student_library_management_system`


***

<img align="center" src="https://th.bing.com/th/id/OIP.4FpI4mfl38e202XxUXvnSgAAAA?rs=1&pid=ImgDetMain" alt="" height="auto" width="auto" />

***

# Model

+ Create `Model` package
+ Now create every class which you want to create table in database.
+ Let as take one example of `Student` class model and `Card` class model.
+ For creating complete database in spring boot we use so many annotation.

### Student Model

```java

package com.mighty.student_library_management_system.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @Column(name = "name" , nullable = false)
    private int name;

    @Column(name = "email" , nullable = false , unique = true)
    private int email;

    @Column(name = "dob" , nullable = false)
    private int dob;

    @Column(name = "gender" , nullable = false)
    private int gender;

    @Column(name = "mobile" , nullable = false , unique = true)
    private int mobile;

    @Column(name = "dept" , nullable = false)
    private int dept;

    @JsonManagedReference
    @OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)
    private Card card;

}


```

### Card Model

```java
    package com.mighty.student_library_management_system.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "card_status",nullable = false)
    private String cardStatus;

    @Column(name = "create_date",nullable = false)
    @CreationTimestamp // it automatically adds time and date when card is created/added
    private Date createDate;

    @Column(name = "update_date",nullable = false)
    @UpdateTimestamp // it automatically updates time and date when card is updated
    private Date updateDate;

    @JsonBackReference
    @OneToOne
    @JoinColumn // it joins the primary key of student table as foreign key in card table
    private Student student;

    @JsonManagedReference
    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    private List<Book> booksIssuedToCard = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
    private List<Transaction> transactionsIssuedToCard = new ArrayList<>();


    // mappedBy = @JsonManagedReference
    // @JoinColumn  = @JsonBackReference

}


```

| Annotation                                                        | Define                                                                                                                                                                   |
|-------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `@Entity`                                                         | It is used for declaring that this class is used as table in database.                                                                                                   |
| `@Table(name="student")`                                          | It is used for giving name of table name.                                                                                                                                |
| `@Id`                                                             | It is used for making variable as `Primary Key` in table.                                                                                                                |
| `@Column(name = "student_id" , nullable = false , unique = true)` | It is used for declaring that this variable used as column in database.                                                                                                  |
| `@GeneratedValue(strategy = GenerationType.IDENTITY)`             | It is used for generating automatic id and Identity is used for making that id in sequence format. We can use UUID also but it will generate alpha numeric value for id. |
| `@JsonManagedReference`                                           | Use @JsonManagedReference on the collection side or the side where serialization is required                                                                                                                                                                         |
| `@JsonBackReference`                                              | Use @JsonBackReference on the referencing side where you want to avoid circular references.                                                                                                                                                                         |
| `@OneToOne(mappedBy = "student" , cascade = CascadeType.ALL)`     | This is used on the inverse (non-owning) side of the relationship, where mappedBy indicates that this side of the relationship is controlled by another entity's field.                                                                                                                                                                         |
| `@OneToOne`                                                       | A foreign key column is created in the table of the entity annotated with `@OneToOne`                                                                                                                                                                         |
| `@CreationTimestamp`                                              | It will automatic add current time in field                                                                                                                              |
| `@UpdateTimestamp`                                                | It will automatic add updated time in field                                                                                                                              |


# RequestDto

+ Create `RequestDto` package
+ Now create every class which you want to create table in database.
+ Let as take one example of `StudentRequestDto` class
+ For creating complete database in spring boot we use so many annotation.





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

