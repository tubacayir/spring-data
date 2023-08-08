package yte.intern.springdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Sort;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);
		BookRepository bookRepository = context.getBean(BookRepository.class);
		List<Book> exampleBooks = new ArrayList<>();
		exampleBooks.add(new Book(null, "Clean Code", "Robert C. Martin", 11L, LocalDateTime.parse("2008-07-11T00:00")));
		exampleBooks.add(new Book(null, "Clean Agile", "Robert C. Martin", 0L, LocalDateTime.parse("2019-09-12T00:00")));
		exampleBooks.add(new Book(null, "Agile Software Development", "Robert C. Martin", 17L, LocalDateTime.parse("2002-10-25T00:00")));
		exampleBooks.add(new Book(null, "Code Complete 2", "Steve McConnell", 26L, LocalDateTime.parse("1993-05-30T00:00")));
		exampleBooks.add(new Book(null, "Essential Scrum", "Kenneth S. Rubin", 7L, LocalDateTime.parse("2012-07-20T00:00")));
		exampleBooks.add(new Book(null, "Design Patterns", "Gang of Four", 25L, LocalDateTime.parse("1994-10-01T00:00")));
		exampleBooks.add(new Book(null, "Domain Driven Design", "Eric Evans", 16L, LocalDateTime.parse("2003-08-30T00:00")));
		exampleBooks.add(new Book(null, "Test Driven Development", "Kent Beck", 17L, LocalDateTime.parse("2002-11-18T00:00")));
		exampleBooks.add(new Book(null, "Refactoring", "Kent Beck", 7L, LocalDateTime.parse("2012-03-09T00:00")));
		exampleBooks.add(new Book(null, "Extreme Programming Explained", "Kent Beck", 15L, LocalDateTime.parse("2004-11-26T00:00")));
		System.out.println(bookRepository.findByTitle("Domain Driven Design"));
	}
}
