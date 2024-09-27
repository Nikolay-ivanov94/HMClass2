import java.util.Objects;

public class Author {
    String authorName;
    String authorSurname;

    public Author (String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }


    public String getAuthorSurname() {
        return this.authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }

    public int hashCode() {
        return java.util.Objects.hash(authorName, authorSurname);
    }
    public String toString() {
        return "Автор: " + this.authorName + " " + this.authorSurname;
    }
}