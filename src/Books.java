import java.util.Objects;

public class Books {
    private String name;
    private int date;
    private Author author;

    public Books(String name, int date, Author author) {
        this.name = name;
        this.date = date;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getDate() {
        return this.date;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Books book = (Books) o;
        return date == book.date && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }
    public int hashCode() {
        return java.util.Objects.hash(name, date, author);
    }
    public String toString() {
        return "Название: " + this.name + ". Год изд: " + this.date + " " + this.author.toString();
    }
}