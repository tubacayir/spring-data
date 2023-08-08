    package yte.intern.springdata;

    import org.springframework.data.domain.Page;
    import org.springframework.data.domain.Sort;
    import org.springframework.data.jpa.repository.JpaRepository;

    import java.awt.print.Pageable;
    import java.util.List;

    public interface BookRepository extends JpaRepository<Book, Long> {
        Book findByTitle(String title);

        List<Book> customFindByTitle(String title);
        List<Book> findByAgeGreaterThan(int age,Sort sort);

        List<Book> findByYearPublishedAfter(int year);

        Page<Book> findByTitleContaining(String keyword, Pageable pageable);

        List<Book> findByAuthorAndAgeGreaterThan(String author, int age);

        long countByAuthor(String author);

        boolean existsByAuthor(String author);
    }
