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
+ Now create every class which you want to take input request form client/Postman.
+ Let as take one example of `StudentRequestDto` class.
+ It is used to take input request field.
+ DTO - Data Transfer Object
+ Use that variable which you want to take as a user-input.

### StudentRequestDto

```java
package com.mighty.student_library_management_system.requestdto;

import lombok.Data;

@Data
public class StudentRequestDto {

    private int name;
    private int email;
    private int dob;
    private int gender;
    private int mobile;
    private int dept;


}


```


| Annotation               | Define                                                                                        |
|--------------------------|-----------------------------------------------------------------------------------------------|
| `@Data`                  | It is used for getter/setter and constructor injection. Lombok dependency has this annotation |


# Converters

+ Create `Converters` package.
+ It converts the coming input request dto into model or entity class which represents database table.
+ Let as take one example of `StudentConverter` class.
+ It converts the studentRequestDto into student model class.

```java
package com.mighty.student_library_management_system.converters;

import com.mighty.student_library_management_system.model.Student;
import com.mighty.student_library_management_system.requestdto.StudentRequestDto;

public class StudentConverter {

    public static Student convertsStudentRequestDtoToStudent ( StudentRequestDto studentRequestDto){
        
        Student student = new Student();
        
        student.setName(studentRequestDto.getName());
        student.setMobile(studentRequestDto.getMobile());
        student.setGender(studentRequestDto.getGender());
        student.setEmail(studentRequestDto.getEmail());
        student.setDob(studentRequestDto.getDob());
        student.setDept(studentRequestDto.getDept());

        return student;
    }

}


```


# Repository

+ Create `Repository` package
+ Create Interface of each model.
+ Let as take one example of `StudentRepository` `Interface`.
+ This interface is used for make `Bean` object for creating API.
+ `JpaRepository` contains all the inbuilt methods for database operation like create , insert , alter , delete everything.

```java
package com.mighty.student_library_management_system.repository;

import com.mighty.student_library_management_system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student , Integer> {

}


```


| Annotation    | Define                                                               |
|---------------|----------------------------------------------------------------------|
| `@Repository` | It is used to declare for that this interface is used for Repository |


# Service

+ Create `Service` package.
+ Now create every class of models for writing api logic in .
+ Let as take one example of `StudentService` class.

```java
package com.mighty.student_library_management_system.service;

import com.mighty.student_library_management_system.converters.StudentConverter;
import com.mighty.student_library_management_system.model.Card;
import com.mighty.student_library_management_system.model.Student;
import com.mighty.student_library_management_system.repository.StudentRepository;
import com.mighty.student_library_management_system.requestdto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String addStudent(StudentRequestDto studentRequestDto){
        // we do not save directly studentRequestDto, we have to first convert it to student model class
        // after that we can save it.

        // convert requestdto into model class so that it is saved in database
        Student student = StudentConverter.convertsStudentRequestDtoToStudent(studentRequestDto);

        // whenever student gets created card also gets created
        Card card = new Card();
        card.setCardStatus("ACTIVE");

        student.setCard(card);
        card.setStudent(student);

        studentRepository.save(student);
        return "Student saved successfully";
    }


    public Student getStudentById(int id){
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.get();
    }

    public List<Student> getAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public String countStudents(){
        long count = studentRepository.count();
        return "Total number of students present are :"+count;
    }

    public String deleteStudentById(int id){
        studentRepository.deleteById(id);
        return "Student with id : "+id+" got deleted";
    }

    public String updateStudent(int id, StudentRequestDto studentRequestDto){
        // first find student id is present in database or not
        // if present the update
        // else no update
        Student student = getStudentById(id);
        if(student!=null){
            // update operation can be performed
            student.setName(studentRequestDto.getName());
            student.setGender(studentRequestDto.getGender());
            student.setMobile(studentRequestDto.getMobile());
            student.setEmail(studentRequestDto.getEmail());
            student.setDob(studentRequestDto.getDob());
            student.setDept(studentRequestDto.getDept());

            studentRepository.save(student);
            return "Student updated successfully";
        } else {
            // cannot update
            return " student cannot be updated";
        }
    }


}


```


| Annotation | Define                                                                               |
|------------|--------------------------------------------------------------------------------------|
| `@Service` | It is used to declare that this class is used for services where we write api logic. |
| `@Autowired` | It is used to create internal bean object used in whole package |


# Controller

+ Create `Controller` package.
+ We write api in this class.
+ In this class api path also mentioned.
+ Let as take one example of `StudentController` class.


```java

package com.mighty.student_library_management_system.controller;

import com.mighty.student_library_management_system.model.Student;
import com.mighty.student_library_management_system.requestdto.StudentRequestDto;
import com.mighty.student_library_management_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/apis")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public String saveStudent(@RequestBody StudentRequestDto studentRequestDto) {
        String response = studentService.addStudent(studentRequestDto);
        return response;
    }

    @GetMapping("/find/{id}")
    public Student findStudentById(@PathVariable int id){
        Student student = studentService.getStudentById(id);
        return student;
    }

    @GetMapping("/findAll")
    public List<Student> findAllStudent(){
        List<Student> studentList = studentService.getAllStudents();
        return studentList;
    }

    @GetMapping("/count")
    public String countStudents(){
        String response = studentService.countStudents();
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable int id){
        String response = studentService.deleteStudentById(id);
        return response;
    }

    @PutMapping("/update/{id}")
    public String updateStudentById(@PathVariable int id,@RequestBody StudentRequestDto studentRequestDto){
        String response = studentService.updateStudent(id,studentRequestDto);
        return response;
    }

    // @RequestParam - takes request as query parameters
//    @PatchMapping("/updatePatch/{id}")
//    public String updateStudentMobileByPatch(@PathVariable int id,@RequestParam String mobile){
//        String response = studentService.updateStudentByPatch(id,mobile);
//        return response;
//    }

}


```


| Annotation                         | Define                                                      |
|------------------------------------|-------------------------------------------------------------|
| `@RestController`                  | It is used for declaring that this class work as controller |
| `@RequestMapping("/student/apis")` | It is used to give path for api.                            |
| `@GetMapping("/find/{id}")`        | It is used to read operation from database                  |
| `@PostMapping("/save")`            | It is used to create operation from database                |
| `@DeleteMapping("/delete/{id}")`   | It is used to delete operation from database                |
| `@PutMapping("/update/{id}")`      | It is used to update operation from database                |

***



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

