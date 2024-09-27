public class Main {

    public static void printNameOfBook() {
        System.out.print("Название книги - ");
    }

    public static void printDateOfBook() {
        System.out.print("Дата выхода книги - ");
    }

    public static void printAuthorOfBook() {
        System.out.print("Автор книги - ");
    }


    public static void main(String[] args) {
        Author glukhovsky = new Author("Дмитрий ", "Глуховский");
        Author herbert = new Author("Фрэнк ", "Хёрберт");


        Books metro2033 = new Books("Метро 2033", 2002, glukhovsky);
        Books dune = new Books("Дюна", 1965, herbert);

        metro2033.setDate(2003);
        printNameOfBook();
        System.out.println(metro2033.getName());
        printDateOfBook();
        System.out.println(metro2033.getDate());
        printAuthorOfBook();
        System.out.println(metro2033.getAuthor());

        System.out.println();

        printNameOfBook();
        System.out.println(dune.getName());
        printDateOfBook();
        System.out.println(dune.getDate());
        printAuthorOfBook();
        System.out.println(dune.getAuthor());

        System.out.println(metro2033.equals(dune));
        System.out.println(metro2033.hashCode());

    }
}