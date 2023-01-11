public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В.", 385756, "Программирование", "05.07.1900", "+7 (985)000-33-66");
        Reader reader2 = new Reader("Иванов П. А.", 728723, "Математика ", "25.10.2000", "+7 (915)232-99-11");
        Book book1 = new Book("Грокаем Алгоритмы", "Адитья Бхаргава");
        Book book2 = new Book("Python", "Б.Дауни");

        System.out.println(reader1);
        System.out.println(reader2);
        System.out.println(book1);
        System.out.println(book2);
        reader1.takeBook(3);
        System.out.println();
        reader1.takeBook(new String[]{"Приключения", "Словарь", "Энциклопедия"});
        reader1.returnBook(new String[]{"Словарь"});
        reader2.takeBook(new Book[]{new Book("New book", "New Author")});
        reader1.returnBook(3);
        reader1.takeBook(new Book[]{book1, book2});
        reader1.returnBook(new Book[]{book1});
    }
}