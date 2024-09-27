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
}