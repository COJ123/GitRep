package bookstore.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "author", unique = true)
    private String author;

    @ManyToMany( mappedBy = "authors", fetch = FetchType.EAGER,
            cascade = {CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH})
    /*
    @JoinTable(name = "books_authors", joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))*/
    //@Fetch(FetchMode.JOIN)
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author1 = (Author) o;
        return id == author1.id &&
                Objects.equals(author, author1.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, author);
    }


}
