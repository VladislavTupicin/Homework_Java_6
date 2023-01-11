import java.util.StringJoiner;

class Reader {
    private final String fullName;
    private final int ticketNumber;
    private final String faculty;
    private final String birthday;
    private final String phoneNumber;

    public Reader(String fullName, int ticketNumber, String faculty, String birthday, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Информция о посетителе библиотеки: \nФИО - " + this.fullName + "\nФакультет - " + this.faculty + "\nДень рождения - " + this.birthday + "\nНомер мобильного телефона  - " + this.phoneNumber + "\n";
    }

    public void takeBook(Book... books) {
        StringJoiner sj = new StringJoiner(", ");
        Book[] var3 = books;
        int var4 = books.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Book book = var3[var5];
            sj.add(book.toString());
        }

        System.out.printf("%s взял книги: %s\n", this.fullName, sj);
    }

    public void returnBook(Book... books) {
        StringJoiner sj = new StringJoiner(", ");
        Book[] var3 = books;
        int var4 = books.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Book book = var3[var5];
            sj.add(book.toString());
        }

        System.out.printf("%s вернул книги: %s\n", this.fullName, sj);
    }

    public void takeBook(String... books) {
        StringJoiner sj = new StringJoiner(", ");
        String[] var3 = books;
        int var4 = books.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String book = var3[var5];
            sj.add(book);
        }

        System.out.printf("%s взял книги: %s\n", this.fullName, sj);
    }

    public void returnBook(String... books) {
        StringJoiner sj = new StringJoiner(", ");
        String[] var3 = books;
        int var4 = books.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            String book = var3[var5];
            sj.add(book);
        }

        System.out.printf("%s вернул книги: %s\n", this.fullName, sj);
    }

    public void takeBook(int count) {
        String strBook = null;
        if (count == 1) {
            strBook = "книга";
        } else if (count > 1 && count < 5) {
            strBook = "книги";
        } else {
            strBook = "книг";
        }

        System.out.printf("%s взял %s %s\n", this.fullName, count, strBook);
    }

    public void returnBook(int count) {
        String strBook = null;
        if (count == 1) {
            strBook = "книга";
        } else if (count > 1 && count < 5) {
            strBook = "книги";
        } else {
            strBook = "книг";
        }

        System.out.printf("%s вернул %s %s\n", this.fullName, count, strBook);
    }
}