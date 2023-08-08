package yte.intern.springdata;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor

public class Book {
    @Id
    @GeneratedValue
    private long id;
    @Column(unique = true)
    private String title;
    private String author;
    private Long age;
    private LocalDateTime publishedDate;


    public Book(Long id, String title, String author, Long age, LocalDateTime publishedDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.age = age;
        this.publishedDate = publishedDate;
    }
}
