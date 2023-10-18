package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private String firstName;
    private  String lastName;
    private  Long id;
    @ManyToMany(mappedBy = "authors")
    public  Set<Book> books;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        return getId().equals(author.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
